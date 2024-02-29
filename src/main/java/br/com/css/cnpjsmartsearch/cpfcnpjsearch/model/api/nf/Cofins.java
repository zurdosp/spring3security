
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.nf;

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
    "COFINSAliq"
})
@Generated("jsonschema2pojo")
public class Cofins {

    @JsonProperty("COFINSAliq")
    private COFINSAliq cOFINSAliq;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("COFINSAliq")
    public COFINSAliq getCOFINSAliq() {
        return cOFINSAliq;
    }

    @JsonProperty("COFINSAliq")
    public void setCOFINSAliq(COFINSAliq cOFINSAliq) {
        this.cOFINSAliq = cOFINSAliq;
    }

    public Cofins withCOFINSAliq(COFINSAliq cOFINSAliq) {
        this.cOFINSAliq = cOFINSAliq;
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

    public Cofins withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cofins.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cOFINSAliq");
        sb.append('=');
        sb.append(((this.cOFINSAliq == null)?"<null>":this.cOFINSAliq));
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
        result = ((result* 31)+((this.cOFINSAliq == null)? 0 :this.cOFINSAliq.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cofins) == false) {
            return false;
        }
        Cofins rhs = ((Cofins) other);
        return (((this.cOFINSAliq == rhs.cOFINSAliq)||((this.cOFINSAliq!= null)&&this.cOFINSAliq.equals(rhs.cOFINSAliq)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
