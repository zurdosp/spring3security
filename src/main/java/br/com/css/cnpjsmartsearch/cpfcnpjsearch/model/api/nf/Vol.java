
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
    "pesoL",
    "esp",
    "qVol",
    "pesoB"
})
@Generated("jsonschema2pojo")
public class Vol {

    @JsonProperty("pesoL")
    private Double pesoL;
    @JsonProperty("esp")
    private String esp;
    @JsonProperty("qVol")
    private Integer qVol;
    @JsonProperty("pesoB")
    private Double pesoB;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pesoL")
    public Double getPesoL() {
        return pesoL;
    }

    @JsonProperty("pesoL")
    public void setPesoL(Double pesoL) {
        this.pesoL = pesoL;
    }

    public Vol withPesoL(Double pesoL) {
        this.pesoL = pesoL;
        return this;
    }

    @JsonProperty("esp")
    public String getEsp() {
        return esp;
    }

    @JsonProperty("esp")
    public void setEsp(String esp) {
        this.esp = esp;
    }

    public Vol withEsp(String esp) {
        this.esp = esp;
        return this;
    }

    @JsonProperty("qVol")
    public Integer getqVol() {
        return qVol;
    }

    @JsonProperty("qVol")
    public void setqVol(Integer qVol) {
        this.qVol = qVol;
    }

    public Vol withqVol(Integer qVol) {
        this.qVol = qVol;
        return this;
    }

    @JsonProperty("pesoB")
    public Double getPesoB() {
        return pesoB;
    }

    @JsonProperty("pesoB")
    public void setPesoB(Double pesoB) {
        this.pesoB = pesoB;
    }

    public Vol withPesoB(Double pesoB) {
        this.pesoB = pesoB;
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

    public Vol withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Vol.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pesoL");
        sb.append('=');
        sb.append(((this.pesoL == null)?"<null>":this.pesoL));
        sb.append(',');
        sb.append("esp");
        sb.append('=');
        sb.append(((this.esp == null)?"<null>":this.esp));
        sb.append(',');
        sb.append("qVol");
        sb.append('=');
        sb.append(((this.qVol == null)?"<null>":this.qVol));
        sb.append(',');
        sb.append("pesoB");
        sb.append('=');
        sb.append(((this.pesoB == null)?"<null>":this.pesoB));
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
        result = ((result* 31)+((this.pesoB == null)? 0 :this.pesoB.hashCode()));
        result = ((result* 31)+((this.pesoL == null)? 0 :this.pesoL.hashCode()));
        result = ((result* 31)+((this.esp == null)? 0 :this.esp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.qVol == null)? 0 :this.qVol.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Vol) == false) {
            return false;
        }
        Vol rhs = ((Vol) other);
        return ((((((this.pesoB == rhs.pesoB)||((this.pesoB!= null)&&this.pesoB.equals(rhs.pesoB)))&&((this.pesoL == rhs.pesoL)||((this.pesoL!= null)&&this.pesoL.equals(rhs.pesoL))))&&((this.esp == rhs.esp)||((this.esp!= null)&&this.esp.equals(rhs.esp))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.qVol == rhs.qVol)||((this.qVol!= null)&&this.qVol.equals(rhs.qVol))));
    }

}
