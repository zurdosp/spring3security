
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
    "cEAN",
    "cProd",
    "qCom",
    "cEANTrib",
    "vUnTrib",
    "qTrib",
    "vProd",
    "xProd",
    "vUnCom",
    "indTot",
    "uTrib",
    "NCM",
    "uCom",
    "CFOP",
    "CEST"
})
@Generated("jsonschema2pojo")
public class Prod {

    @JsonProperty("cEAN")
    private String cEAN;
    @JsonProperty("cProd")
    private Integer cProd;
    @JsonProperty("qCom")
    private Integer qCom;
    @JsonProperty("cEANTrib")
    private String cEANTrib;
    @JsonProperty("vUnTrib")
    private Integer vUnTrib;
    @JsonProperty("qTrib")
    private Integer qTrib;
    @JsonProperty("vProd")
    private Integer vProd;
    @JsonProperty("xProd")
    private String xProd;
    @JsonProperty("vUnCom")
    private Integer vUnCom;
    @JsonProperty("indTot")
    private Integer indTot;
    @JsonProperty("uTrib")
    private String uTrib;
    @JsonProperty("NCM")
    private Integer ncm;
    @JsonProperty("uCom")
    private String uCom;
    @JsonProperty("CFOP")
    private Integer cfop;
    @JsonProperty("CEST")
    private Integer cest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cEAN")
    public String getcEAN() {
        return cEAN;
    }

    @JsonProperty("cEAN")
    public void setcEAN(String cEAN) {
        this.cEAN = cEAN;
    }

    public Prod withcEAN(String cEAN) {
        this.cEAN = cEAN;
        return this;
    }

    @JsonProperty("cProd")
    public Integer getcProd() {
        return cProd;
    }

    @JsonProperty("cProd")
    public void setcProd(Integer cProd) {
        this.cProd = cProd;
    }

    public Prod withcProd(Integer cProd) {
        this.cProd = cProd;
        return this;
    }

    @JsonProperty("qCom")
    public Integer getqCom() {
        return qCom;
    }

    @JsonProperty("qCom")
    public void setqCom(Integer qCom) {
        this.qCom = qCom;
    }

    public Prod withqCom(Integer qCom) {
        this.qCom = qCom;
        return this;
    }

    @JsonProperty("cEANTrib")
    public String getcEANTrib() {
        return cEANTrib;
    }

    @JsonProperty("cEANTrib")
    public void setcEANTrib(String cEANTrib) {
        this.cEANTrib = cEANTrib;
    }

    public Prod withcEANTrib(String cEANTrib) {
        this.cEANTrib = cEANTrib;
        return this;
    }

    @JsonProperty("vUnTrib")
    public Integer getvUnTrib() {
        return vUnTrib;
    }

    @JsonProperty("vUnTrib")
    public void setvUnTrib(Integer vUnTrib) {
        this.vUnTrib = vUnTrib;
    }

    public Prod withvUnTrib(Integer vUnTrib) {
        this.vUnTrib = vUnTrib;
        return this;
    }

    @JsonProperty("qTrib")
    public Integer getqTrib() {
        return qTrib;
    }

    @JsonProperty("qTrib")
    public void setqTrib(Integer qTrib) {
        this.qTrib = qTrib;
    }

    public Prod withqTrib(Integer qTrib) {
        this.qTrib = qTrib;
        return this;
    }

    @JsonProperty("vProd")
    public Integer getvProd() {
        return vProd;
    }

    @JsonProperty("vProd")
    public void setvProd(Integer vProd) {
        this.vProd = vProd;
    }

    public Prod withvProd(Integer vProd) {
        this.vProd = vProd;
        return this;
    }

    @JsonProperty("xProd")
    public String getxProd() {
        return xProd;
    }

    @JsonProperty("xProd")
    public void setxProd(String xProd) {
        this.xProd = xProd;
    }

    public Prod withxProd(String xProd) {
        this.xProd = xProd;
        return this;
    }

    @JsonProperty("vUnCom")
    public Integer getvUnCom() {
        return vUnCom;
    }

    @JsonProperty("vUnCom")
    public void setvUnCom(Integer vUnCom) {
        this.vUnCom = vUnCom;
    }

    public Prod withvUnCom(Integer vUnCom) {
        this.vUnCom = vUnCom;
        return this;
    }

    @JsonProperty("indTot")
    public Integer getIndTot() {
        return indTot;
    }

    @JsonProperty("indTot")
    public void setIndTot(Integer indTot) {
        this.indTot = indTot;
    }

    public Prod withIndTot(Integer indTot) {
        this.indTot = indTot;
        return this;
    }

    @JsonProperty("uTrib")
    public String getuTrib() {
        return uTrib;
    }

    @JsonProperty("uTrib")
    public void setuTrib(String uTrib) {
        this.uTrib = uTrib;
    }

    public Prod withuTrib(String uTrib) {
        this.uTrib = uTrib;
        return this;
    }

    @JsonProperty("NCM")
    public Integer getNcm() {
        return ncm;
    }

    @JsonProperty("NCM")
    public void setNcm(Integer ncm) {
        this.ncm = ncm;
    }

    public Prod withNcm(Integer ncm) {
        this.ncm = ncm;
        return this;
    }

    @JsonProperty("uCom")
    public String getuCom() {
        return uCom;
    }

    @JsonProperty("uCom")
    public void setuCom(String uCom) {
        this.uCom = uCom;
    }

    public Prod withuCom(String uCom) {
        this.uCom = uCom;
        return this;
    }

    @JsonProperty("CFOP")
    public Integer getCfop() {
        return cfop;
    }

    @JsonProperty("CFOP")
    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public Prod withCfop(Integer cfop) {
        this.cfop = cfop;
        return this;
    }

    @JsonProperty("CEST")
    public Integer getCest() {
        return cest;
    }

    @JsonProperty("CEST")
    public void setCest(Integer cest) {
        this.cest = cest;
    }

    public Prod withCest(Integer cest) {
        this.cest = cest;
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

    public Prod withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Prod.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cEAN");
        sb.append('=');
        sb.append(((this.cEAN == null)?"<null>":this.cEAN));
        sb.append(',');
        sb.append("cProd");
        sb.append('=');
        sb.append(((this.cProd == null)?"<null>":this.cProd));
        sb.append(',');
        sb.append("qCom");
        sb.append('=');
        sb.append(((this.qCom == null)?"<null>":this.qCom));
        sb.append(',');
        sb.append("cEANTrib");
        sb.append('=');
        sb.append(((this.cEANTrib == null)?"<null>":this.cEANTrib));
        sb.append(',');
        sb.append("vUnTrib");
        sb.append('=');
        sb.append(((this.vUnTrib == null)?"<null>":this.vUnTrib));
        sb.append(',');
        sb.append("qTrib");
        sb.append('=');
        sb.append(((this.qTrib == null)?"<null>":this.qTrib));
        sb.append(',');
        sb.append("vProd");
        sb.append('=');
        sb.append(((this.vProd == null)?"<null>":this.vProd));
        sb.append(',');
        sb.append("xProd");
        sb.append('=');
        sb.append(((this.xProd == null)?"<null>":this.xProd));
        sb.append(',');
        sb.append("vUnCom");
        sb.append('=');
        sb.append(((this.vUnCom == null)?"<null>":this.vUnCom));
        sb.append(',');
        sb.append("indTot");
        sb.append('=');
        sb.append(((this.indTot == null)?"<null>":this.indTot));
        sb.append(',');
        sb.append("uTrib");
        sb.append('=');
        sb.append(((this.uTrib == null)?"<null>":this.uTrib));
        sb.append(',');
        sb.append("ncm");
        sb.append('=');
        sb.append(((this.ncm == null)?"<null>":this.ncm));
        sb.append(',');
        sb.append("uCom");
        sb.append('=');
        sb.append(((this.uCom == null)?"<null>":this.uCom));
        sb.append(',');
        sb.append("cfop");
        sb.append('=');
        sb.append(((this.cfop == null)?"<null>":this.cfop));
        sb.append(',');
        sb.append("cest");
        sb.append('=');
        sb.append(((this.cest == null)?"<null>":this.cest));
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
        result = ((result* 31)+((this.cEAN == null)? 0 :this.cEAN.hashCode()));
        result = ((result* 31)+((this.cProd == null)? 0 :this.cProd.hashCode()));
        result = ((result* 31)+((this.qCom == null)? 0 :this.qCom.hashCode()));
        result = ((result* 31)+((this.cEANTrib == null)? 0 :this.cEANTrib.hashCode()));
        result = ((result* 31)+((this.vUnTrib == null)? 0 :this.vUnTrib.hashCode()));
        result = ((result* 31)+((this.qTrib == null)? 0 :this.qTrib.hashCode()));
        result = ((result* 31)+((this.vProd == null)? 0 :this.vProd.hashCode()));
        result = ((result* 31)+((this.cfop == null)? 0 :this.cfop.hashCode()));
        result = ((result* 31)+((this.cest == null)? 0 :this.cest.hashCode()));
        result = ((result* 31)+((this.xProd == null)? 0 :this.xProd.hashCode()));
        result = ((result* 31)+((this.vUnCom == null)? 0 :this.vUnCom.hashCode()));
        result = ((result* 31)+((this.indTot == null)? 0 :this.indTot.hashCode()));
        result = ((result* 31)+((this.uTrib == null)? 0 :this.uTrib.hashCode()));
        result = ((result* 31)+((this.ncm == null)? 0 :this.ncm.hashCode()));
        result = ((result* 31)+((this.uCom == null)? 0 :this.uCom.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Prod) == false) {
            return false;
        }
        Prod rhs = ((Prod) other);
        return (((((((((((((((((this.cEAN == rhs.cEAN)||((this.cEAN!= null)&&this.cEAN.equals(rhs.cEAN)))&&((this.cProd == rhs.cProd)||((this.cProd!= null)&&this.cProd.equals(rhs.cProd))))&&((this.qCom == rhs.qCom)||((this.qCom!= null)&&this.qCom.equals(rhs.qCom))))&&((this.cEANTrib == rhs.cEANTrib)||((this.cEANTrib!= null)&&this.cEANTrib.equals(rhs.cEANTrib))))&&((this.vUnTrib == rhs.vUnTrib)||((this.vUnTrib!= null)&&this.vUnTrib.equals(rhs.vUnTrib))))&&((this.qTrib == rhs.qTrib)||((this.qTrib!= null)&&this.qTrib.equals(rhs.qTrib))))&&((this.vProd == rhs.vProd)||((this.vProd!= null)&&this.vProd.equals(rhs.vProd))))&&((this.cfop == rhs.cfop)||((this.cfop!= null)&&this.cfop.equals(rhs.cfop))))&&((this.cest == rhs.cest)||((this.cest!= null)&&this.cest.equals(rhs.cest))))&&((this.xProd == rhs.xProd)||((this.xProd!= null)&&this.xProd.equals(rhs.xProd))))&&((this.vUnCom == rhs.vUnCom)||((this.vUnCom!= null)&&this.vUnCom.equals(rhs.vUnCom))))&&((this.indTot == rhs.indTot)||((this.indTot!= null)&&this.indTot.equals(rhs.indTot))))&&((this.uTrib == rhs.uTrib)||((this.uTrib!= null)&&this.uTrib.equals(rhs.uTrib))))&&((this.ncm == rhs.ncm)||((this.ncm!= null)&&this.ncm.equals(rhs.ncm))))&&((this.uCom == rhs.uCom)||((this.uCom!= null)&&this.uCom.equals(rhs.uCom))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
