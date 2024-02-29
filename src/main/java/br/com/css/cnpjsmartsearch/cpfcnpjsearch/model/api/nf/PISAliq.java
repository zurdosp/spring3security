
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
    "vPIS",
    "CST",
    "vBC",
    "pPIS"
})
@Generated("jsonschema2pojo")
public class PISAliq {

    @JsonProperty("vPIS")
    private Double vPIS;
    @JsonProperty("CST")
    private String cst;
    @JsonProperty("vBC")
    private Integer vBC;
    @JsonProperty("pPIS")
    private Double pPIS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vPIS")
    public Double getvPIS() {
        return vPIS;
    }

    @JsonProperty("vPIS")
    public void setvPIS(Double vPIS) {
        this.vPIS = vPIS;
    }

    public PISAliq withvPIS(Double vPIS) {
        this.vPIS = vPIS;
        return this;
    }

    @JsonProperty("CST")
    public String getCst() {
        return cst;
    }

    @JsonProperty("CST")
    public void setCst(String cst) {
        this.cst = cst;
    }

    public PISAliq withCst(String cst) {
        this.cst = cst;
        return this;
    }

    @JsonProperty("vBC")
    public Integer getvBC() {
        return vBC;
    }

    @JsonProperty("vBC")
    public void setvBC(Integer vBC) {
        this.vBC = vBC;
    }

    public PISAliq withvBC(Integer vBC) {
        this.vBC = vBC;
        return this;
    }

    @JsonProperty("pPIS")
    public Double getpPIS() {
        return pPIS;
    }

    @JsonProperty("pPIS")
    public void setpPIS(Double pPIS) {
        this.pPIS = pPIS;
    }

    public PISAliq withpPIS(Double pPIS) {
        this.pPIS = pPIS;
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

    public PISAliq withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PISAliq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vPIS");
        sb.append('=');
        sb.append(((this.vPIS == null)?"<null>":this.vPIS));
        sb.append(',');
        sb.append("cst");
        sb.append('=');
        sb.append(((this.cst == null)?"<null>":this.cst));
        sb.append(',');
        sb.append("vBC");
        sb.append('=');
        sb.append(((this.vBC == null)?"<null>":this.vBC));
        sb.append(',');
        sb.append("pPIS");
        sb.append('=');
        sb.append(((this.pPIS == null)?"<null>":this.pPIS));
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
        result = ((result* 31)+((this.vPIS == null)? 0 :this.vPIS.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cst == null)? 0 :this.cst.hashCode()));
        result = ((result* 31)+((this.vBC == null)? 0 :this.vBC.hashCode()));
        result = ((result* 31)+((this.pPIS == null)? 0 :this.pPIS.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PISAliq) == false) {
            return false;
        }
        PISAliq rhs = ((PISAliq) other);
        return ((((((this.vPIS == rhs.vPIS)||((this.vPIS!= null)&&this.vPIS.equals(rhs.vPIS)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cst == rhs.cst)||((this.cst!= null)&&this.cst.equals(rhs.cst))))&&((this.vBC == rhs.vBC)||((this.vBC!= null)&&this.vBC.equals(rhs.vBC))))&&((this.pPIS == rhs.pPIS)||((this.pPIS!= null)&&this.pPIS.equals(rhs.pPIS))));
    }

}
