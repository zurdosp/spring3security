
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
    "vCOFINS",
    "CST",
    "vBC",
    "pCOFINS"
})
@Generated("jsonschema2pojo")
public class COFINSAliq {

    @JsonProperty("vCOFINS")
    private Double vCOFINS;
    @JsonProperty("CST")
    private String cst;
    @JsonProperty("vBC")
    private Integer vBC;
    @JsonProperty("pCOFINS")
    private Integer pCOFINS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vCOFINS")
    public Double getvCOFINS() {
        return vCOFINS;
    }

    @JsonProperty("vCOFINS")
    public void setvCOFINS(Double vCOFINS) {
        this.vCOFINS = vCOFINS;
    }

    public COFINSAliq withvCOFINS(Double vCOFINS) {
        this.vCOFINS = vCOFINS;
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

    public COFINSAliq withCst(String cst) {
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

    public COFINSAliq withvBC(Integer vBC) {
        this.vBC = vBC;
        return this;
    }

    @JsonProperty("pCOFINS")
    public Integer getpCOFINS() {
        return pCOFINS;
    }

    @JsonProperty("pCOFINS")
    public void setpCOFINS(Integer pCOFINS) {
        this.pCOFINS = pCOFINS;
    }

    public COFINSAliq withpCOFINS(Integer pCOFINS) {
        this.pCOFINS = pCOFINS;
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

    public COFINSAliq withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(COFINSAliq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vCOFINS");
        sb.append('=');
        sb.append(((this.vCOFINS == null)?"<null>":this.vCOFINS));
        sb.append(',');
        sb.append("cst");
        sb.append('=');
        sb.append(((this.cst == null)?"<null>":this.cst));
        sb.append(',');
        sb.append("vBC");
        sb.append('=');
        sb.append(((this.vBC == null)?"<null>":this.vBC));
        sb.append(',');
        sb.append("pCOFINS");
        sb.append('=');
        sb.append(((this.pCOFINS == null)?"<null>":this.pCOFINS));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vCOFINS == null)? 0 :this.vCOFINS.hashCode()));
        result = ((result* 31)+((this.pCOFINS == null)? 0 :this.pCOFINS.hashCode()));
        result = ((result* 31)+((this.cst == null)? 0 :this.cst.hashCode()));
        result = ((result* 31)+((this.vBC == null)? 0 :this.vBC.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof COFINSAliq) == false) {
            return false;
        }
        COFINSAliq rhs = ((COFINSAliq) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.vCOFINS == rhs.vCOFINS)||((this.vCOFINS!= null)&&this.vCOFINS.equals(rhs.vCOFINS))))&&((this.pCOFINS == rhs.pCOFINS)||((this.pCOFINS!= null)&&this.pCOFINS.equals(rhs.pCOFINS))))&&((this.cst == rhs.cst)||((this.cst!= null)&&this.cst.equals(rhs.cst))))&&((this.vBC == rhs.vBC)||((this.vBC!= null)&&this.vBC.equals(rhs.vBC))));
    }

}
