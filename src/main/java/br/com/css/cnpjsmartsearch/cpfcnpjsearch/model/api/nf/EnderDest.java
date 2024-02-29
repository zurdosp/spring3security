
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
    "fone",
    "UF",
    "xPais",
    "cPais",
    "xLgr",
    "xMun",
    "nro",
    "cMun",
    "xBairro",
    "CEP"
})
@Generated("jsonschema2pojo")
public class EnderDest {

    @JsonProperty("fone")
    private Integer fone;
    @JsonProperty("UF")
    private String uf;
    @JsonProperty("xPais")
    private String xPais;
    @JsonProperty("cPais")
    private Integer cPais;
    @JsonProperty("xLgr")
    private String xLgr;
    @JsonProperty("xMun")
    private String xMun;
    @JsonProperty("nro")
    private String nro;
    @JsonProperty("cMun")
    private Integer cMun;
    @JsonProperty("xBairro")
    private String xBairro;
    @JsonProperty("CEP")
    private String cep;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fone")
    public Integer getFone() {
        return fone;
    }

    @JsonProperty("fone")
    public void setFone(Integer fone) {
        this.fone = fone;
    }

    public EnderDest withFone(Integer fone) {
        this.fone = fone;
        return this;
    }

    @JsonProperty("UF")
    public String getUf() {
        return uf;
    }

    @JsonProperty("UF")
    public void setUf(String uf) {
        this.uf = uf;
    }

    public EnderDest withUf(String uf) {
        this.uf = uf;
        return this;
    }

    @JsonProperty("xPais")
    public String getxPais() {
        return xPais;
    }

    @JsonProperty("xPais")
    public void setxPais(String xPais) {
        this.xPais = xPais;
    }

    public EnderDest withxPais(String xPais) {
        this.xPais = xPais;
        return this;
    }

    @JsonProperty("cPais")
    public Integer getcPais() {
        return cPais;
    }

    @JsonProperty("cPais")
    public void setcPais(Integer cPais) {
        this.cPais = cPais;
    }

    public EnderDest withcPais(Integer cPais) {
        this.cPais = cPais;
        return this;
    }

    @JsonProperty("xLgr")
    public String getxLgr() {
        return xLgr;
    }

    @JsonProperty("xLgr")
    public void setxLgr(String xLgr) {
        this.xLgr = xLgr;
    }

    public EnderDest withxLgr(String xLgr) {
        this.xLgr = xLgr;
        return this;
    }

    @JsonProperty("xMun")
    public String getxMun() {
        return xMun;
    }

    @JsonProperty("xMun")
    public void setxMun(String xMun) {
        this.xMun = xMun;
    }

    public EnderDest withxMun(String xMun) {
        this.xMun = xMun;
        return this;
    }

    @JsonProperty("nro")
    public String getNro() {
        return nro;
    }

    @JsonProperty("nro")
    public void setNro(String nro) {
        this.nro = nro;
    }

    public EnderDest withNro(String nro) {
        this.nro = nro;
        return this;
    }

    @JsonProperty("cMun")
    public Integer getcMun() {
        return cMun;
    }

    @JsonProperty("cMun")
    public void setcMun(Integer cMun) {
        this.cMun = cMun;
    }

    public EnderDest withcMun(Integer cMun) {
        this.cMun = cMun;
        return this;
    }

    @JsonProperty("xBairro")
    public String getxBairro() {
        return xBairro;
    }

    @JsonProperty("xBairro")
    public void setxBairro(String xBairro) {
        this.xBairro = xBairro;
    }

    public EnderDest withxBairro(String xBairro) {
        this.xBairro = xBairro;
        return this;
    }

    @JsonProperty("CEP")
    public String getCep() {
        return cep;
    }

    @JsonProperty("CEP")
    public void setCep(String cep) {
        this.cep = cep;
    }

    public EnderDest withCep(String cep) {
        this.cep = cep;
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

    public EnderDest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnderDest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fone");
        sb.append('=');
        sb.append(((this.fone == null)?"<null>":this.fone));
        sb.append(',');
        sb.append("uf");
        sb.append('=');
        sb.append(((this.uf == null)?"<null>":this.uf));
        sb.append(',');
        sb.append("xPais");
        sb.append('=');
        sb.append(((this.xPais == null)?"<null>":this.xPais));
        sb.append(',');
        sb.append("cPais");
        sb.append('=');
        sb.append(((this.cPais == null)?"<null>":this.cPais));
        sb.append(',');
        sb.append("xLgr");
        sb.append('=');
        sb.append(((this.xLgr == null)?"<null>":this.xLgr));
        sb.append(',');
        sb.append("xMun");
        sb.append('=');
        sb.append(((this.xMun == null)?"<null>":this.xMun));
        sb.append(',');
        sb.append("nro");
        sb.append('=');
        sb.append(((this.nro == null)?"<null>":this.nro));
        sb.append(',');
        sb.append("cMun");
        sb.append('=');
        sb.append(((this.cMun == null)?"<null>":this.cMun));
        sb.append(',');
        sb.append("xBairro");
        sb.append('=');
        sb.append(((this.xBairro == null)?"<null>":this.xBairro));
        sb.append(',');
        sb.append("cep");
        sb.append('=');
        sb.append(((this.cep == null)?"<null>":this.cep));
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
        result = ((result* 31)+((this.fone == null)? 0 :this.fone.hashCode()));
        result = ((result* 31)+((this.uf == null)? 0 :this.uf.hashCode()));
        result = ((result* 31)+((this.xPais == null)? 0 :this.xPais.hashCode()));
        result = ((result* 31)+((this.cPais == null)? 0 :this.cPais.hashCode()));
        result = ((result* 31)+((this.xLgr == null)? 0 :this.xLgr.hashCode()));
        result = ((result* 31)+((this.xMun == null)? 0 :this.xMun.hashCode()));
        result = ((result* 31)+((this.nro == null)? 0 :this.nro.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cMun == null)? 0 :this.cMun.hashCode()));
        result = ((result* 31)+((this.xBairro == null)? 0 :this.xBairro.hashCode()));
        result = ((result* 31)+((this.cep == null)? 0 :this.cep.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnderDest) == false) {
            return false;
        }
        EnderDest rhs = ((EnderDest) other);
        return ((((((((((((this.fone == rhs.fone)||((this.fone!= null)&&this.fone.equals(rhs.fone)))&&((this.uf == rhs.uf)||((this.uf!= null)&&this.uf.equals(rhs.uf))))&&((this.xPais == rhs.xPais)||((this.xPais!= null)&&this.xPais.equals(rhs.xPais))))&&((this.cPais == rhs.cPais)||((this.cPais!= null)&&this.cPais.equals(rhs.cPais))))&&((this.xLgr == rhs.xLgr)||((this.xLgr!= null)&&this.xLgr.equals(rhs.xLgr))))&&((this.xMun == rhs.xMun)||((this.xMun!= null)&&this.xMun.equals(rhs.xMun))))&&((this.nro == rhs.nro)||((this.nro!= null)&&this.nro.equals(rhs.nro))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cMun == rhs.cMun)||((this.cMun!= null)&&this.cMun.equals(rhs.cMun))))&&((this.xBairro == rhs.xBairro)||((this.xBairro!= null)&&this.xBairro.equals(rhs.xBairro))))&&((this.cep == rhs.cep)||((this.cep!= null)&&this.cep.equals(rhs.cep))));
    }

}
