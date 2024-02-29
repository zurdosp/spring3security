package br.com.css.cnpjsmartsearch.cpfcnpjsearch.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import br.com.css.cnpjsmartsearch.global.SuperServices;

@Service
public class CnpjPublicDataService extends SuperServices {

	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(CnpjPublicDataService.class);

	private final String MASTER_SQL_SEARCH = "select  "
			+ "e2.cnpj_basico, (case when e.razao_social is null then e2.nome_fantasia  else e.razao_social end), e.capital_social, e.ente_federativo_responsavel, n2.descricao as natUreza_juridica, e.porte_empresa, "
			+ "e.qualificacao_responsavel, p.descricao as empresa_pais, e2.bairro, e2.cep, c2.descricao as cnae_principal_empresa, c3.descricao as cnae_secundario_empresa,  "
			+ "e2.cnpj_dv, e2.cnpj_ordem, e2.complemento, e2.correio_eletronico, e2.data_inicio_atividade, "
			+ "e2.data_situacao_cadastral, e2.data_situacao_especial, e2.ddd_1, e2.ddd_2, e2.ddd_fax, e2.fax, e2.identificador_matriz_filial, e2.logradouro, m2.descricao as motivo_situacao_cadastral_empresa, "
			+ "m4.descricao  as municipio_empresa, e2.nome_cidade_exterior, e2.nome_fantasia, e2.numero, e2.pais, e2.situacao_cadastral, e2.situacao_especial, e2.telefone_1, e2.telefone_2, e2.tipo_logradouro,  "
			+ "e2.uf  "
			+ "from estabelecimento e2 "
			+ "left join empresa e on e.cnpj_basico = e2.cnpj_basico "
			+ "left join moti m2 on m2.codigo = e2.motivo_situacao_cadastral "
			+ "left join munic m3 on m3.codigo = e2.municipio "
			+ "left join natju n on n.codigo = e.natureza_juridica "
			+ "left join pais p on p.codigo = e2.pais "
			+ "left join natju n2 on n2.codigo = e.natureza_juridica "
			+ "left join quals q on q.codigo = e.qualificacao_responsavel "
			+ "left join cnae c2 on c2.codigo = e2.cnae_fiscal_principal "
			+ "left join cnae c3 on c3.codigo = e2.cnae_fiscal_secundaria "
			+ "inner join munic m4 on m4.codigo = e2.municipio where ";

	public Object getPublicDataCnpjEmpresaParamsquery(String cnpj,
													String munic,
													String uf,
													String cnaeCode,
													String sortDirection,
													String sortField,
													int page,
													int size){

		StringBuffer queryString = new StringBuffer(MASTER_SQL_SEARCH);

		if (cnpj != null && !"".equalsIgnoreCase(cnpj)) {
		queryString = queryString.append(String.format("CONCAT(e2.cnpj_basico, e2.cnpj_ordem, e2.cnpj_dv) = '" + "%s" + "' and ",
				cnpj));
		}
		
		if (munic != null && uf != null && !"".equalsIgnoreCase(uf) && !"".equalsIgnoreCase(munic)) {
			queryString = queryString.append(String.format("public.similarity(m3.descricao, '" + "%s" + "' ) > " + "%s "
											+ "and e2.uf =  '" + "%s" + "' and ",
											munic, 0.35d, uf, munic));
		}
		
		if (cnaeCode != null && !"".equalsIgnoreCase(cnaeCode)) {
			String cnaesStr = "";
			for (int i = 0; Arrays.asList(cnaeCode.split(",")).size() > i; i++) {
				cnaesStr = cnaesStr + "'" + Arrays.asList(cnaeCode.split(",")).get(i) + "',";
			}
			
			queryString = queryString.append(String.format(" c2.codigo in (" + "%s" + ") and ", 
					cnaesStr.substring(0, cnaesStr.length()-1)));
		}
		
		if (munic != null && uf != null && !"".equalsIgnoreCase(uf) && !"".equalsIgnoreCase(munic)) {
			queryString = queryString.append(String.format(" 1=1 order by public.similarity(m3.descricao, '" + "%s" + "' ) desc,  m3.descricao desc limit 10",
											munic, 0.35));
		} else {
			queryString = queryString.append(String.format(" 1=1 order by (case when e.razao_social is null then e2.nome_fantasia  else e.razao_social end) desc "));
		}
		
		LOG.info("executing Query: {}", queryString.toString());		
		return getQuery(queryString.toString());
	}

	public Object getPublicDataCnpjSocios(String cnpj,
			String sortDirection,
			String sortField,
			int page,
			int size){

		// TODO. IMPLEMENTAR PAGINAÇÃO
		String queryString = String.format(
						  "select "
						+ "s.cnpj_basico, s.cpf_cnpj_socio, s.data_entrada_sociedade, s.faixa_etaria, s.identificador_socio, s.nome_do_representante, s.nome_socio_razao_social, p.descricao as pais_socio, "
						+ "q2.descricao  as qualificacao_representante_legal, q3.descricao as qualificacao_socio, s.representante_legal  "
						+ "from estabelecimento e3 "
						+ "left join empresa e on e3.cnpj_basico = e.cnpj_basico "
						+ "inner join socios s on s.cnpj_basico = e3.cnpj_basico "
						+ "inner join pais p on p.codigo = s.pais "
						+ "left join quals q2 on q2.codigo = s.qualificacao_representante_legal  "
						+ "left join quals q3 on q3.codigo = s.qualificacao_socio  "
						+ "where CONCAT(e3.cnpj_basico, e3.cnpj_ordem, e3.cnpj_dv) = '" + "%s" + "'",
						cnpj);
		return getQuery(queryString);
	}

	public Object getPublicDataCnpjSimples(String cnpj,
			String sortDirection,
			String sortField,
			int page,
			int size){

		// TODO. IMPLEMENTAR PAGINAÇÃO
		String queryString = String.format(
						      "select s2.data_exclusao_mei, s2.data_exclusao_simples, s2.data_opcao_mei, s2.data_opcao_simples, s2.opcao_mei, s2.opcao_pelo_simples "
							+ "from estabelecimento e2 " 
							+ "inner join simples s2 on s2.cnpj_basico = e2.cnpj_basico "
							+ "where CONCAT(e2.cnpj_basico, e2.cnpj_ordem, e2.cnpj_dv) = '" + "%s" + "'",
						  cnpj);
		return getQuery(queryString);
	}

	public Object getCnaeList() {
		String queryString = String.format("select codigo as value, concat('(', codigo, ') ', descricao) as descricao from cnae");
		return getQuery(queryString);
	}
}
