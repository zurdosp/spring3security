
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
    "vBCST",
    "vICMSDeson",
    "vProd",
    "vSeg",
    "vNF",
    "vTotTrib",
    "vPIS",
    "vBC",
    "vST",
    "vICMS",
    "vII",
    "vDesc",
    "vOutro",
    "vIPI",
    "vFrete"
})
@Generated("jsonschema2pojo")
public class ICMSTot {

    @JsonProperty("vCOFINS")
    private Double vCOFINS;
    @JsonProperty("vBCST")
    private Integer vBCST;
    @JsonProperty("vICMSDeson")
    private Integer vICMSDeson;
    @JsonProperty("vProd")
    private Integer vProd;
    @JsonProperty("vSeg")
    private Integer vSeg;
    @JsonProperty("vNF")
    private Integer vNF;
    @JsonProperty("vTotTrib")
    private Double vTotTrib;
    @JsonProperty("vPIS")
    private Double vPIS;
    @JsonProperty("vBC")
    private Integer vBC;
    @JsonProperty("vST")
    private Integer vST;
    @JsonProperty("vICMS")
    private Double vICMS;
    @JsonProperty("vII")
    private Integer vII;
    @JsonProperty("vDesc")
    private Integer vDesc;
    @JsonProperty("vOutro")
    private Integer vOutro;
    @JsonProperty("vIPI")
    private Integer vIPI;
    @JsonProperty("vFrete")
    private Integer vFrete;
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

    public ICMSTot withvCOFINS(Double vCOFINS) {
        this.vCOFINS = vCOFINS;
        return this;
    }

    @JsonProperty("vBCST")
    public Integer getvBCST() {
        return vBCST;
    }

    @JsonProperty("vBCST")
    public void setvBCST(Integer vBCST) {
        this.vBCST = vBCST;
    }

    public ICMSTot withvBCST(Integer vBCST) {
        this.vBCST = vBCST;
        return this;
    }

    @JsonProperty("vICMSDeson")
    public Integer getvICMSDeson() {
        return vICMSDeson;
    }

    @JsonProperty("vICMSDeson")
    public void setvICMSDeson(Integer vICMSDeson) {
        this.vICMSDeson = vICMSDeson;
    }

    public ICMSTot withvICMSDeson(Integer vICMSDeson) {
        this.vICMSDeson = vICMSDeson;
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

    public ICMSTot withvProd(Integer vProd) {
        this.vProd = vProd;
        return this;
    }

    @JsonProperty("vSeg")
    public Integer getvSeg() {
        return vSeg;
    }

    @JsonProperty("vSeg")
    public void setvSeg(Integer vSeg) {
        this.vSeg = vSeg;
    }

    public ICMSTot withvSeg(Integer vSeg) {
        this.vSeg = vSeg;
        return this;
    }

    @JsonProperty("vNF")
    public Integer getvNF() {
        return vNF;
    }

    @JsonProperty("vNF")
    public void setvNF(Integer vNF) {
        this.vNF = vNF;
    }

    public ICMSTot withvNF(Integer vNF) {
        this.vNF = vNF;
        return this;
    }

    @JsonProperty("vTotTrib")
    public Double getvTotTrib() {
        return vTotTrib;
    }

    @JsonProperty("vTotTrib")
    public void setvTotTrib(Double vTotTrib) {
        this.vTotTrib = vTotTrib;
    }

    public ICMSTot withvTotTrib(Double vTotTrib) {
        this.vTotTrib = vTotTrib;
        return this;
    }

    @JsonProperty("vPIS")
    public Double getvPIS() {
        return vPIS;
    }

    @JsonProperty("vPIS")
    public void setvPIS(Double vPIS) {
        this.vPIS = vPIS;
    }

    public ICMSTot withvPIS(Double vPIS) {
        this.vPIS = vPIS;
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

    public ICMSTot withvBC(Integer vBC) {
        this.vBC = vBC;
        return this;
    }

    @JsonProperty("vST")
    public Integer getvST() {
        return vST;
    }

    @JsonProperty("vST")
    public void setvST(Integer vST) {
        this.vST = vST;
    }

    public ICMSTot withvST(Integer vST) {
        this.vST = vST;
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

    public ICMSTot withvICMS(Double vICMS) {
        this.vICMS = vICMS;
        return this;
    }

    @JsonProperty("vII")
    public Integer getvII() {
        return vII;
    }

    @JsonProperty("vII")
    public void setvII(Integer vII) {
        this.vII = vII;
    }

    public ICMSTot withvII(Integer vII) {
        this.vII = vII;
        return this;
    }

    @JsonProperty("vDesc")
    public Integer getvDesc() {
        return vDesc;
    }

    @JsonProperty("vDesc")
    public void setvDesc(Integer vDesc) {
        this.vDesc = vDesc;
    }

    public ICMSTot withvDesc(Integer vDesc) {
        this.vDesc = vDesc;
        return this;
    }

    @JsonProperty("vOutro")
    public Integer getvOutro() {
        return vOutro;
    }

    @JsonProperty("vOutro")
    public void setvOutro(Integer vOutro) {
        this.vOutro = vOutro;
    }

    public ICMSTot withvOutro(Integer vOutro) {
        this.vOutro = vOutro;
        return this;
    }

    @JsonProperty("vIPI")
    public Integer getvIPI() {
        return vIPI;
    }

    @JsonProperty("vIPI")
    public void setvIPI(Integer vIPI) {
        this.vIPI = vIPI;
    }

    public ICMSTot withvIPI(Integer vIPI) {
        this.vIPI = vIPI;
        return this;
    }

    @JsonProperty("vFrete")
    public Integer getvFrete() {
        return vFrete;
    }

    @JsonProperty("vFrete")
    public void setvFrete(Integer vFrete) {
        this.vFrete = vFrete;
    }

    public ICMSTot withvFrete(Integer vFrete) {
        this.vFrete = vFrete;
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

    public ICMSTot withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ICMSTot.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vCOFINS");
        sb.append('=');
        sb.append(((this.vCOFINS == null)?"<null>":this.vCOFINS));
        sb.append(',');
        sb.append("vBCST");
        sb.append('=');
        sb.append(((this.vBCST == null)?"<null>":this.vBCST));
        sb.append(',');
        sb.append("vICMSDeson");
        sb.append('=');
        sb.append(((this.vICMSDeson == null)?"<null>":this.vICMSDeson));
        sb.append(',');
        sb.append("vProd");
        sb.append('=');
        sb.append(((this.vProd == null)?"<null>":this.vProd));
        sb.append(',');
        sb.append("vSeg");
        sb.append('=');
        sb.append(((this.vSeg == null)?"<null>":this.vSeg));
        sb.append(',');
        sb.append("vNF");
        sb.append('=');
        sb.append(((this.vNF == null)?"<null>":this.vNF));
        sb.append(',');
        sb.append("vTotTrib");
        sb.append('=');
        sb.append(((this.vTotTrib == null)?"<null>":this.vTotTrib));
        sb.append(',');
        sb.append("vPIS");
        sb.append('=');
        sb.append(((this.vPIS == null)?"<null>":this.vPIS));
        sb.append(',');
        sb.append("vBC");
        sb.append('=');
        sb.append(((this.vBC == null)?"<null>":this.vBC));
        sb.append(',');
        sb.append("vST");
        sb.append('=');
        sb.append(((this.vST == null)?"<null>":this.vST));
        sb.append(',');
        sb.append("vICMS");
        sb.append('=');
        sb.append(((this.vICMS == null)?"<null>":this.vICMS));
        sb.append(',');
        sb.append("vII");
        sb.append('=');
        sb.append(((this.vII == null)?"<null>":this.vII));
        sb.append(',');
        sb.append("vDesc");
        sb.append('=');
        sb.append(((this.vDesc == null)?"<null>":this.vDesc));
        sb.append(',');
        sb.append("vOutro");
        sb.append('=');
        sb.append(((this.vOutro == null)?"<null>":this.vOutro));
        sb.append(',');
        sb.append("vIPI");
        sb.append('=');
        sb.append(((this.vIPI == null)?"<null>":this.vIPI));
        sb.append(',');
        sb.append("vFrete");
        sb.append('=');
        sb.append(((this.vFrete == null)?"<null>":this.vFrete));
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
        result = ((result* 31)+((this.vCOFINS == null)? 0 :this.vCOFINS.hashCode()));
        result = ((result* 31)+((this.vBCST == null)? 0 :this.vBCST.hashCode()));
        result = ((result* 31)+((this.vICMSDeson == null)? 0 :this.vICMSDeson.hashCode()));
        result = ((result* 31)+((this.vProd == null)? 0 :this.vProd.hashCode()));
        result = ((result* 31)+((this.vSeg == null)? 0 :this.vSeg.hashCode()));
        result = ((result* 31)+((this.vNF == null)? 0 :this.vNF.hashCode()));
        result = ((result* 31)+((this.vTotTrib == null)? 0 :this.vTotTrib.hashCode()));
        result = ((result* 31)+((this.vPIS == null)? 0 :this.vPIS.hashCode()));
        result = ((result* 31)+((this.vBC == null)? 0 :this.vBC.hashCode()));
        result = ((result* 31)+((this.vST == null)? 0 :this.vST.hashCode()));
        result = ((result* 31)+((this.vICMS == null)? 0 :this.vICMS.hashCode()));
        result = ((result* 31)+((this.vII == null)? 0 :this.vII.hashCode()));
        result = ((result* 31)+((this.vDesc == null)? 0 :this.vDesc.hashCode()));
        result = ((result* 31)+((this.vOutro == null)? 0 :this.vOutro.hashCode()));
        result = ((result* 31)+((this.vIPI == null)? 0 :this.vIPI.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vFrete == null)? 0 :this.vFrete.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ICMSTot) == false) {
            return false;
        }
        ICMSTot rhs = ((ICMSTot) other);
        return ((((((((((((((((((this.vCOFINS == rhs.vCOFINS)||((this.vCOFINS!= null)&&this.vCOFINS.equals(rhs.vCOFINS)))&&((this.vBCST == rhs.vBCST)||((this.vBCST!= null)&&this.vBCST.equals(rhs.vBCST))))&&((this.vICMSDeson == rhs.vICMSDeson)||((this.vICMSDeson!= null)&&this.vICMSDeson.equals(rhs.vICMSDeson))))&&((this.vProd == rhs.vProd)||((this.vProd!= null)&&this.vProd.equals(rhs.vProd))))&&((this.vSeg == rhs.vSeg)||((this.vSeg!= null)&&this.vSeg.equals(rhs.vSeg))))&&((this.vNF == rhs.vNF)||((this.vNF!= null)&&this.vNF.equals(rhs.vNF))))&&((this.vTotTrib == rhs.vTotTrib)||((this.vTotTrib!= null)&&this.vTotTrib.equals(rhs.vTotTrib))))&&((this.vPIS == rhs.vPIS)||((this.vPIS!= null)&&this.vPIS.equals(rhs.vPIS))))&&((this.vBC == rhs.vBC)||((this.vBC!= null)&&this.vBC.equals(rhs.vBC))))&&((this.vST == rhs.vST)||((this.vST!= null)&&this.vST.equals(rhs.vST))))&&((this.vICMS == rhs.vICMS)||((this.vICMS!= null)&&this.vICMS.equals(rhs.vICMS))))&&((this.vII == rhs.vII)||((this.vII!= null)&&this.vII.equals(rhs.vII))))&&((this.vDesc == rhs.vDesc)||((this.vDesc!= null)&&this.vDesc.equals(rhs.vDesc))))&&((this.vOutro == rhs.vOutro)||((this.vOutro!= null)&&this.vOutro.equals(rhs.vOutro))))&&((this.vIPI == rhs.vIPI)||((this.vIPI!= null)&&this.vIPI.equals(rhs.vIPI))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vFrete == rhs.vFrete)||((this.vFrete!= null)&&this.vFrete.equals(rhs.vFrete))));
    }

}
