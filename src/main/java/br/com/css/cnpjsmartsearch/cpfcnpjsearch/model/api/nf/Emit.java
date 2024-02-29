
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
    "xNome",
    "CRT",
    "xFant",
    "CNPJ",
    "enderEmit",
    "IE"
})
@Generated("jsonschema2pojo")
public class Emit {

    @JsonProperty("xNome")
    private String xNome;
    @JsonProperty("CRT")
    private Integer crt;
    @JsonProperty("xFant")
    private String xFant;
    @JsonProperty("CNPJ")
    private String cnpj;
    @JsonProperty("enderEmit")
    private EnderEmit enderEmit;
    @JsonProperty("IE")
    private Long ie;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("xNome")
    public String getxNome() {
        return xNome;
    }

    @JsonProperty("xNome")
    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public Emit withxNome(String xNome) {
        this.xNome = xNome;
        return this;
    }

    @JsonProperty("CRT")
    public Integer getCrt() {
        return crt;
    }

    @JsonProperty("CRT")
    public void setCrt(Integer crt) {
        this.crt = crt;
    }

    public Emit withCrt(Integer crt) {
        this.crt = crt;
        return this;
    }

    @JsonProperty("xFant")
    public String getxFant() {
        return xFant;
    }

    @JsonProperty("xFant")
    public void setxFant(String xFant) {
        this.xFant = xFant;
    }

    public Emit withxFant(String xFant) {
        this.xFant = xFant;
        return this;
    }

    @JsonProperty("CNPJ")
    public String getCnpj() {
        return cnpj;
    }

    @JsonProperty("CNPJ")
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Emit withCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    @JsonProperty("enderEmit")
    public EnderEmit getEnderEmit() {
        return enderEmit;
    }

    @JsonProperty("enderEmit")
    public void setEnderEmit(EnderEmit enderEmit) {
        this.enderEmit = enderEmit;
    }

    public Emit withEnderEmit(EnderEmit enderEmit) {
        this.enderEmit = enderEmit;
        return this;
    }

    @JsonProperty("IE")
    public Long getIe() {
        return ie;
    }

    @JsonProperty("IE")
    public void setIe(Long ie) {
        this.ie = ie;
    }

    public Emit withIe(Long ie) {
        this.ie = ie;
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

    public Emit withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Emit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xNome");
        sb.append('=');
        sb.append(((this.xNome == null)?"<null>":this.xNome));
        sb.append(',');
        sb.append("crt");
        sb.append('=');
        sb.append(((this.crt == null)?"<null>":this.crt));
        sb.append(',');
        sb.append("xFant");
        sb.append('=');
        sb.append(((this.xFant == null)?"<null>":this.xFant));
        sb.append(',');
        sb.append("cnpj");
        sb.append('=');
        sb.append(((this.cnpj == null)?"<null>":this.cnpj));
        sb.append(',');
        sb.append("enderEmit");
        sb.append('=');
        sb.append(((this.enderEmit == null)?"<null>":this.enderEmit));
        sb.append(',');
        sb.append("ie");
        sb.append('=');
        sb.append(((this.ie == null)?"<null>":this.ie));
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
        result = ((result* 31)+((this.xNome == null)? 0 :this.xNome.hashCode()));
        result = ((result* 31)+((this.crt == null)? 0 :this.crt.hashCode()));
        result = ((result* 31)+((this.xFant == null)? 0 :this.xFant.hashCode()));
        result = ((result* 31)+((this.enderEmit == null)? 0 :this.enderEmit.hashCode()));
        result = ((result* 31)+((this.cnpj == null)? 0 :this.cnpj.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ie == null)? 0 :this.ie.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Emit) == false) {
            return false;
        }
        Emit rhs = ((Emit) other);
        return ((((((((this.xNome == rhs.xNome)||((this.xNome!= null)&&this.xNome.equals(rhs.xNome)))&&((this.crt == rhs.crt)||((this.crt!= null)&&this.crt.equals(rhs.crt))))&&((this.xFant == rhs.xFant)||((this.xFant!= null)&&this.xFant.equals(rhs.xFant))))&&((this.enderEmit == rhs.enderEmit)||((this.enderEmit!= null)&&this.enderEmit.equals(rhs.enderEmit))))&&((this.cnpj == rhs.cnpj)||((this.cnpj!= null)&&this.cnpj.equals(rhs.cnpj))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ie == rhs.ie)||((this.ie!= null)&&this.ie.equals(rhs.ie))));
    }

}
