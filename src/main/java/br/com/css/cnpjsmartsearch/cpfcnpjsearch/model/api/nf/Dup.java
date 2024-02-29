
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
    "dVenc",
    "nDup",
    "vDup"
})
@Generated("jsonschema2pojo")
public class Dup {

    @JsonProperty("dVenc")
    private String dVenc;
    @JsonProperty("nDup")
    private String nDup;
    @JsonProperty("vDup")
    private Double vDup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dVenc")
    public String getdVenc() {
        return dVenc;
    }

    @JsonProperty("dVenc")
    public void setdVenc(String dVenc) {
        this.dVenc = dVenc;
    }

    public Dup withdVenc(String dVenc) {
        this.dVenc = dVenc;
        return this;
    }

    @JsonProperty("nDup")
    public String getnDup() {
        return nDup;
    }

    @JsonProperty("nDup")
    public void setnDup(String nDup) {
        this.nDup = nDup;
    }

    public Dup withnDup(String nDup) {
        this.nDup = nDup;
        return this;
    }

    @JsonProperty("vDup")
    public Double getvDup() {
        return vDup;
    }

    @JsonProperty("vDup")
    public void setvDup(Double vDup) {
        this.vDup = vDup;
    }

    public Dup withvDup(Double vDup) {
        this.vDup = vDup;
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

    public Dup withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dup.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dVenc");
        sb.append('=');
        sb.append(((this.dVenc == null)?"<null>":this.dVenc));
        sb.append(',');
        sb.append("nDup");
        sb.append('=');
        sb.append(((this.nDup == null)?"<null>":this.nDup));
        sb.append(',');
        sb.append("vDup");
        sb.append('=');
        sb.append(((this.vDup == null)?"<null>":this.vDup));
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
        result = ((result* 31)+((this.dVenc == null)? 0 :this.dVenc.hashCode()));
        result = ((result* 31)+((this.nDup == null)? 0 :this.nDup.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vDup == null)? 0 :this.vDup.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dup) == false) {
            return false;
        }
        Dup rhs = ((Dup) other);
        return (((((this.dVenc == rhs.dVenc)||((this.dVenc!= null)&&this.dVenc.equals(rhs.dVenc)))&&((this.nDup == rhs.nDup)||((this.nDup!= null)&&this.nDup.equals(rhs.nDup))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vDup == rhs.vDup)||((this.vDup!= null)&&this.vDup.equals(rhs.vDup))));
    }

}
