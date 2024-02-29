
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.processing.Generated;

import org.aspectj.asm.internal.Relationship;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.smartdatacnpj.Address;
import br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.smartdatacnpj.Phone;
import br.com.css.cnpjsmartsearch.global.ParentModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "cpf",
    "rg",
    "last_name",
    "gradutation",
    "birthdate",
    "situation",
    "city_born",
    "country_born",
    "addresses",
    "phones",
    "e-mail",
    "relationship"
})
@Generated("jsonschema2pojo")
public class SmartDataCpf extends ParentModel {

    @JsonProperty("name")
    private String name;
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("rg")
    private String rg;
    @JsonProperty("cpf")
    private String cpf;

    
    @JsonProperty("gradutation")
    private String gradutation;
    @JsonProperty("birthdate")
    private String birthdate;
    @JsonProperty("situation")
    private String situation;
    @JsonProperty("city_born")
    private String cityBorn;
    @JsonProperty("country_born")
    private String countryBorn;
    @JsonProperty("addresses")
    private List<Address> addresses = new ArrayList<Address>();
    @JsonProperty("phones")
    private List<Phone> phones = new ArrayList<Phone>();
    @JsonProperty("e-mail")
    private String eMail;
    @JsonProperty("relationship")
    private List<Relationship> relationship = new ArrayList<Relationship>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("rg")
    public String getRg() {
		return rg;
	}

	@JsonProperty("rg")
	public void setRg(String rg) {
		this.rg = rg;
	}

	@JsonProperty("cpf")
	public String getCpf() {
		return cpf;
	}

	@JsonProperty("cpf")
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public SmartDataCpf withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SmartDataCpf withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("gradutation")
    public String getGradutation() {
        return gradutation;
    }

    @JsonProperty("gradutation")
    public void setGradutation(String gradutation) {
        this.gradutation = gradutation;
    }

    public SmartDataCpf withGradutation(String gradutation) {
        this.gradutation = gradutation;
        return this;
    }

    @JsonProperty("birthdate")
    public String getBirthdate() {
        return birthdate;
    }

    @JsonProperty("birthdate")
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public SmartDataCpf withBirthdate(String birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    @JsonProperty("situation")
    public String getSituation() {
        return situation;
    }

    @JsonProperty("situation")
    public void setSituation(String situation) {
        this.situation = situation;
    }

    public SmartDataCpf withSituation(String situation) {
        this.situation = situation;
        return this;
    }

    @JsonProperty("city_born")
    public String getCityBorn() {
        return cityBorn;
    }

    @JsonProperty("city_born")
    public void setCityBorn(String cityBorn) {
        this.cityBorn = cityBorn;
    }

    public SmartDataCpf withCityBorn(String cityBorn) {
        this.cityBorn = cityBorn;
        return this;
    }

    @JsonProperty("country_born")
    public String getCountryBorn() {
        return countryBorn;
    }

    @JsonProperty("country_born")
    public void setCountryBorn(String countryBorn) {
        this.countryBorn = countryBorn;
    }

    public SmartDataCpf withCountryBorn(String countryBorn) {
        this.countryBorn = countryBorn;
        return this;
    }

    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public SmartDataCpf withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public SmartDataCpf withPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    @JsonProperty("e-mail")
    public String geteMail() {
        return eMail;
    }

    @JsonProperty("e-mail")
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public SmartDataCpf witheMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    @JsonProperty("relationship")
    public List<Relationship> getRelationship() {
        return relationship;
    }

    @JsonProperty("relationship")
    public void setRelationship(List<Relationship> relationship) {
        this.relationship = relationship;
    }

    public SmartDataCpf withRelationship(List<Relationship> relationship) {
        this.relationship = relationship;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public SmartDataCpf withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SmartDataCpf.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("gradutation");
        sb.append('=');
        sb.append(((this.gradutation == null)?"<null>":this.gradutation));
        sb.append(',');
        sb.append("birthdate");
        sb.append('=');
        sb.append(((this.birthdate == null)?"<null>":this.birthdate));
        sb.append(',');
        sb.append("situation");
        sb.append('=');
        sb.append(((this.situation == null)?"<null>":this.situation));
        sb.append(',');
        sb.append("cityBorn");
        sb.append('=');
        sb.append(((this.cityBorn == null)?"<null>":this.cityBorn));
        sb.append(',');
        sb.append("countryBorn");
        sb.append('=');
        sb.append(((this.countryBorn == null)?"<null>":this.countryBorn));
        sb.append(',');
        sb.append("addresses");
        sb.append('=');
        sb.append(((this.addresses == null)?"<null>":this.addresses));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("eMail");
        sb.append('=');
        sb.append(((this.eMail == null)?"<null>":this.eMail));
        sb.append(',');
        sb.append("relationship");
        sb.append('=');
        sb.append(((this.relationship == null)?"<null>":this.relationship));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.birthdate == null)? 0 :this.birthdate.hashCode()));
        result = ((result* 31)+((this.cityBorn == null)? 0 :this.cityBorn.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.countryBorn == null)? 0 :this.countryBorn.hashCode()));
        result = ((result* 31)+((this.eMail == null)? 0 :this.eMail.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gradutation == null)? 0 :this.gradutation.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        result = ((result* 31)+((this.situation == null)? 0 :this.situation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SmartDataCpf) == false) {
            return false;
        }
        SmartDataCpf rhs = ((SmartDataCpf) other);
        return (((((((((((((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName)))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.birthdate == rhs.birthdate)||((this.birthdate!= null)&&this.birthdate.equals(rhs.birthdate))))&&((this.cityBorn == rhs.cityBorn)||((this.cityBorn!= null)&&this.cityBorn.equals(rhs.cityBorn))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.countryBorn == rhs.countryBorn)||((this.countryBorn!= null)&&this.countryBorn.equals(rhs.countryBorn))))&&((this.eMail == rhs.eMail)||((this.eMail!= null)&&this.eMail.equals(rhs.eMail))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gradutation == rhs.gradutation)||((this.gradutation!= null)&&this.gradutation.equals(rhs.gradutation))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))))&&((this.situation == rhs.situation)||((this.situation!= null)&&this.situation.equals(rhs.situation))));
    }

}
