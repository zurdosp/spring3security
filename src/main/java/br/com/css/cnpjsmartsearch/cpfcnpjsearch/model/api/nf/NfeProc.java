
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
import com.google.gson.annotations.SerializedName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "protNFe",
    "NFe",
    "versao"
})
@Generated("jsonschema2pojo")
public class NfeProc {

    @JsonProperty("protNFe")
    private ProtNFe protNFe;
    
	@SerializedName("NFe")
    @JsonProperty("NFe")
    private NFe nFe;
    @JsonProperty("versao")
    private Double versao;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("protNFe")
    public ProtNFe getProtNFe() {
        return protNFe;
    }

    @JsonProperty("protNFe")
    public void setProtNFe(ProtNFe protNFe) {
        this.protNFe = protNFe;
    }

    public NfeProc withProtNFe(ProtNFe protNFe) {
        this.protNFe = protNFe;
        return this;
    }

    @JsonProperty("NFe")
    public NFe getNFe() {
        return nFe;
    }

    @JsonProperty("NFe")
    public void setNFe(NFe nFe) {
        this.nFe = nFe;
    }

    public NfeProc withNFe(NFe nFe) {
        this.nFe = nFe;
        return this;
    }

    @JsonProperty("versao")
    public Double getVersao() {
        return versao;
    }

    @JsonProperty("versao")
    public void setVersao(Double versao) {
        this.versao = versao;
    }

    public NfeProc withVersao(Double versao) {
        this.versao = versao;
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

    public NfeProc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NfeProc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("protNFe");
        sb.append('=');
        sb.append(((this.protNFe == null)?"<null>":this.protNFe));
        sb.append(',');
        sb.append("nFe");
        sb.append('=');
        sb.append(((this.nFe == null)?"<null>":this.nFe));
        sb.append(',');
        sb.append("versao");
        sb.append('=');
        sb.append(((this.versao == null)?"<null>":this.versao));
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
        result = ((result* 31)+((this.protNFe == null)? 0 :this.protNFe.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nFe == null)? 0 :this.nFe.hashCode()));
        result = ((result* 31)+((this.versao == null)? 0 :this.versao.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NfeProc) == false) {
            return false;
        }
        NfeProc rhs = ((NfeProc) other);
        return (((((this.protNFe == rhs.protNFe)||((this.protNFe!= null)&&this.protNFe.equals(rhs.protNFe)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nFe == rhs.nFe)||((this.nFe!= null)&&this.nFe.equals(rhs.nFe))))&&((this.versao == rhs.versao)||((this.versao!= null)&&this.versao.equals(rhs.versao))));
    }

}
