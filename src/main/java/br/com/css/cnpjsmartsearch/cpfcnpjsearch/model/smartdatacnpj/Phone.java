
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.smartdatacnpj;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ddd",
    "number",
    "phone_type",
    "isMain"
})
@Generated("jsonschema2pojo")
public class Phone {

    @JsonProperty("ddd")
    private String ddd;
    @JsonProperty("number")
    private String number;
    @JsonProperty("phone_type")
    private String phoneType;
    @JsonProperty("isMain")
    private Boolean isMain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ddd")
    public String getDdd() {
        return ddd;
    }

    @JsonProperty("ddd")
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Phone withDdd(String ddd) {
        this.ddd = ddd;
        return this;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Phone withNumber(String number) {
        this.number = number;
        return this;
    }

    @JsonProperty("phone_type")
    public String getPhoneType() {
        return phoneType;
    }

    @JsonProperty("phone_type")
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public Phone withPhoneType(String phoneType) {
        this.phoneType = phoneType;
        return this;
    }

    @JsonProperty("isMain")
    public Boolean getIsMain() {
        return isMain;
    }

    @JsonProperty("isMain")
    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
    }

    public Phone withIsMain(Boolean isMain) {
        this.isMain = isMain;
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

    public Phone withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Phone.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ddd");
        sb.append('=');
        sb.append(((this.ddd == null)?"<null>":this.ddd));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("phoneType");
        sb.append('=');
        sb.append(((this.phoneType == null)?"<null>":this.phoneType));
        sb.append(',');
        sb.append("isMain");
        sb.append('=');
        sb.append(((this.isMain == null)?"<null>":this.isMain));
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
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.phoneType == null)? 0 :this.phoneType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ddd == null)? 0 :this.ddd.hashCode()));
        result = ((result* 31)+((this.isMain == null)? 0 :this.isMain.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Phone) == false) {
            return false;
        }
        Phone rhs = ((Phone) other);
        return ((((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.phoneType == rhs.phoneType)||((this.phoneType!= null)&&this.phoneType.equals(rhs.phoneType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ddd == rhs.ddd)||((this.ddd!= null)&&this.ddd.equals(rhs.ddd))))&&((this.isMain == rhs.isMain)||((this.isMain!= null)&&this.isMain.equals(rhs.isMain))));
    }

}
