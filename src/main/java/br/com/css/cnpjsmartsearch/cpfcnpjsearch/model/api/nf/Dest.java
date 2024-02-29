
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
    "CPF",
    "enderDest",
    "indIEDest"
})
@Generated("jsonschema2pojo")
public class Dest {

    @JsonProperty("xNome")
    private String xNome;
    @JsonProperty("CPF")
    private Long cpf;
    @JsonProperty("enderDest")
    private EnderDest enderDest;
    @JsonProperty("indIEDest")
    private Integer indIEDest;
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

    public Dest withxNome(String xNome) {
        this.xNome = xNome;
        return this;
    }

    @JsonProperty("CPF")
    public Long getCpf() {
        return cpf;
    }

    @JsonProperty("CPF")
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Dest withCpf(Long cpf) {
        this.cpf = cpf;
        return this;
    }

    @JsonProperty("enderDest")
    public EnderDest getEnderDest() {
        return enderDest;
    }

    @JsonProperty("enderDest")
    public void setEnderDest(EnderDest enderDest) {
        this.enderDest = enderDest;
    }

    public Dest withEnderDest(EnderDest enderDest) {
        this.enderDest = enderDest;
        return this;
    }

    @JsonProperty("indIEDest")
    public Integer getIndIEDest() {
        return indIEDest;
    }

    @JsonProperty("indIEDest")
    public void setIndIEDest(Integer indIEDest) {
        this.indIEDest = indIEDest;
    }

    public Dest withIndIEDest(Integer indIEDest) {
        this.indIEDest = indIEDest;
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

    public Dest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xNome");
        sb.append('=');
        sb.append(((this.xNome == null)?"<null>":this.xNome));
        sb.append(',');
        sb.append("cpf");
        sb.append('=');
        sb.append(((this.cpf == null)?"<null>":this.cpf));
        sb.append(',');
        sb.append("enderDest");
        sb.append('=');
        sb.append(((this.enderDest == null)?"<null>":this.enderDest));
        sb.append(',');
        sb.append("indIEDest");
        sb.append('=');
        sb.append(((this.indIEDest == null)?"<null>":this.indIEDest));
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
        result = ((result* 31)+((this.cpf == null)? 0 :this.cpf.hashCode()));
        result = ((result* 31)+((this.xNome == null)? 0 :this.xNome.hashCode()));
        result = ((result* 31)+((this.enderDest == null)? 0 :this.enderDest.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.indIEDest == null)? 0 :this.indIEDest.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dest) == false) {
            return false;
        }
        Dest rhs = ((Dest) other);
        return ((((((this.cpf == rhs.cpf)||((this.cpf!= null)&&this.cpf.equals(rhs.cpf)))&&((this.xNome == rhs.xNome)||((this.xNome!= null)&&this.xNome.equals(rhs.xNome))))&&((this.enderDest == rhs.enderDest)||((this.enderDest!= null)&&this.enderDest.equals(rhs.enderDest))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.indIEDest == rhs.indIEDest)||((this.indIEDest!= null)&&this.indIEDest.equals(rhs.indIEDest))));
    }

}
