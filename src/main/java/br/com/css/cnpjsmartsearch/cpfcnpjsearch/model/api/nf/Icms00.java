
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
    "modBC",
    "orig",
    "CST",
    "vBC",
    "vICMS",
    "pICMS"
})
@Generated("jsonschema2pojo")
public class Icms00 {

    @JsonProperty("modBC")
    private Integer modBC;
    @JsonProperty("orig")
    private Integer orig;
    @JsonProperty("CST")
    private String cst;
    @JsonProperty("vBC")
    private Integer vBC;
    @JsonProperty("vICMS")
    private Double vICMS;
    @JsonProperty("pICMS")
    private Integer pICMS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("modBC")
    public Integer getModBC() {
        return modBC;
    }

    @JsonProperty("modBC")
    public void setModBC(Integer modBC) {
        this.modBC = modBC;
    }

    public Icms00 withModBC(Integer modBC) {
        this.modBC = modBC;
        return this;
    }

    @JsonProperty("orig")
    public Integer getOrig() {
        return orig;
    }

    @JsonProperty("orig")
    public void setOrig(Integer orig) {
        this.orig = orig;
    }

    public Icms00 withOrig(Integer orig) {
        this.orig = orig;
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

    public Icms00 withCst(String cst) {
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

    public Icms00 withvBC(Integer vBC) {
        this.vBC = vBC;
        return this;
    }

    @JsonProperty("vICMS")
    public Double getvICMS() {
        return vICMS;
    }

    @JsonProperty("vICMS")
    public void setvICMS(Double vICMS) {
        this.vICMS = vICMS;
    }

    public Icms00 withvICMS(Double vICMS) {
        this.vICMS = vICMS;
        return this;
    }

    @JsonProperty("pICMS")
    public Integer getpICMS() {
        return pICMS;
    }

    @JsonProperty("pICMS")
    public void setpICMS(Integer pICMS) {
        this.pICMS = pICMS;
    }

    public Icms00 withpICMS(Integer pICMS) {
        this.pICMS = pICMS;
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

    public Icms00 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Icms00 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("modBC");
        sb.append('=');
        sb.append(((this.modBC == null)?"<null>":this.modBC));
        sb.append(',');
        sb.append("orig");
        sb.append('=');
        sb.append(((this.orig == null)?"<null>":this.orig));
        sb.append(',');
        sb.append("cst");
        sb.append('=');
        sb.append(((this.cst == null)?"<null>":this.cst));
        sb.append(',');
        sb.append("vBC");
        sb.append('=');
        sb.append(((this.vBC == null)?"<null>":this.vBC));
        sb.append(',');
        sb.append("vICMS");
        sb.append('=');
        sb.append(((this.vICMS == null)?"<null>":this.vICMS));
        sb.append(',');
        sb.append("pICMS");
        sb.append('=');
        sb.append(((this.pICMS == null)?"<null>":this.pICMS));
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
        result = ((result* 31)+((this.modBC == null)? 0 :this.modBC.hashCode()));
        result = ((result* 31)+((this.orig == null)? 0 :this.orig.hashCode()));
        result = ((result* 31)+((this.cst == null)? 0 :this.cst.hashCode()));
        result = ((result* 31)+((this.vBC == null)? 0 :this.vBC.hashCode()));
        result = ((result* 31)+((this.vICMS == null)? 0 :this.vICMS.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pICMS == null)? 0 :this.pICMS.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Icms00) == false) {
            return false;
        }
        Icms00 rhs = ((Icms00) other);
        return ((((((((this.modBC == rhs.modBC)||((this.modBC!= null)&&this.modBC.equals(rhs.modBC)))&&((this.orig == rhs.orig)||((this.orig!= null)&&this.orig.equals(rhs.orig))))&&((this.cst == rhs.cst)||((this.cst!= null)&&this.cst.equals(rhs.cst))))&&((this.vBC == rhs.vBC)||((this.vBC!= null)&&this.vBC.equals(rhs.vBC))))&&((this.vICMS == rhs.vICMS)||((this.vICMS!= null)&&this.vICMS.equals(rhs.vICMS))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pICMS == rhs.pICMS)||((this.pICMS!= null)&&this.pICMS.equals(rhs.pICMS))));
    }

}
