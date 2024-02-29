package br.com.css.cnpjsmartsearch.global;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import br.com.css.cnpjsmartsearch.onboarding.enums.OnboardingTypeEnum;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.Tuple;
import jakarta.persistence.TupleElement;

public class SuperServices {
	
	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(SuperServices.class);
	
	@PersistenceContext
	public EntityManager entityManager;
	
	public static final String SQL_INSERT_ONBOARDING = "INSERT INTO onboarding (data, cpfcnpj, type, sourceType, cre_by) VALUES (to_json(?), ?, ?, ?, ?)";
	public static final String SQL_UPDATE_ONBOARDING = "UPDATE onboarding SET data = to_json(?), upd_by = ?, upd_at= ?, cpfcnpj = ? where id = ?";
	
	public List<ObjectNode> getQuery(String query) {
		Query q = entityManager.createNativeQuery(query, Tuple.class);
		List<Tuple> results = q.getResultList();
		return toJson(results);
	}

	public Object filter(UUID id, OnboardingTypeEnum type){
		String queryString = "select CAST(id AS varchar(50)), cre_at, CAST(data AS varchar(50000)), cpfcnpj, type, sourcetype, "
				+ "upd_at, deleted_at, delete_by from onboarding where ";

		if (id != null) {
			queryString = queryString.concat(String.format(" CAST(id AS varchar(50)) = '" + "%s" + "'", id)); 
		}

		if (type != null) {
			queryString = queryString.concat(String.format(" and type = '" + "%s" + "'", type.toString())); 
		}
		LOG.info("Executing query: {}", queryString);
		return getQuery(queryString);
	}
	
	private List<ObjectNode> toJson(List<Tuple> results) {
		List<ObjectNode> json = new ArrayList<ObjectNode>();
		ObjectMapper mapper = new ObjectMapper();
		for (Tuple t : results) {
			List<TupleElement<?>> cols = t.getElements();
			ObjectNode one = mapper.createObjectNode();
			for (TupleElement col : cols) {
				LOG.debug("alias:"+col.getAlias().toString() + ", type: " + col.getJavaType().toString()+ 
						", value:" + (t.get(col.getAlias()) == null ? null : t.get(col.getAlias())));
				if (col.getAlias().equalsIgnoreCase("data")) {					
					one.put(col.getAlias(), (t.get(col.getAlias()) ==null) ? null :t.get(col.getAlias()).toString().replace("\\\"", "\""));
				}else {
					one.put(col.getAlias(), (t.get(col.getAlias()) ==null) ? null :t.get(col.getAlias()).toString());
				}
			}
			json.add(one);
		}
		return json;
	}


	static List<?> convertObjectToList(Object obj) {
		List<?> list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			list = Arrays.asList((Object[])obj);
		} else if (obj instanceof Collection) {
			list = new ArrayList<>((Collection<?>)obj);
		}
		return list;
	}


}
