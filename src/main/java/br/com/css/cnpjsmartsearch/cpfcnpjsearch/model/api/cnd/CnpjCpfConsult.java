
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnd;

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
    "Status",
    "Messagem",
    "Certidao"
})
@Generated("jsonschema2pojo")
public class CnpjCpfConsult {

    @JsonProperty("Status")
    @SerializedName("Status")
    private Integer status;
    
    @SerializedName("Messagem")
    @JsonProperty("Messagem")
    private String messagem;
    
    @SerializedName("Certidao")
    @JsonProperty("Certidao")
    private Certidao certidao;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    public CnpjCpfConsult withStatus(Integer status) {
        this.status = status;
        return this;
    }

    @JsonProperty("Messagem")
    public String getMessagem() {
        return messagem;
    }

    @JsonProperty("Messagem")
    public void setMessagem(String messagem) {
        this.messagem = messagem;
    }

    public CnpjCpfConsult withMessagem(String messagem) {
        this.messagem = messagem;
        return this;
    }

    @JsonProperty("Certidao")
    public Certidao getCertidao() {
        return certidao;
    }

    @JsonProperty("Certidao")
    public void setCertidao(Certidao certidao) {
        this.certidao = certidao;
    }

    public CnpjCpfConsult withCertidao(Certidao certidao) {
        this.certidao = certidao;
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

    public CnpjCpfConsult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CnpjCpfConsult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("messagem");
        sb.append('=');
        sb.append(((this.messagem == null)?"<null>":this.messagem));
        sb.append(',');
        sb.append("certidao");
        sb.append('=');
        sb.append(((this.certidao == null)?"<null>":this.certidao));
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
        result = ((result* 31)+((this.messagem == null)? 0 :this.messagem.hashCode()));
        result = ((result* 31)+((this.certidao == null)? 0 :this.certidao.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CnpjCpfConsult) == false) {
            return false;
        }
        CnpjCpfConsult rhs = ((CnpjCpfConsult) other);
        return (((((this.messagem == rhs.messagem)||((this.messagem!= null)&&this.messagem.equals(rhs.messagem)))&&((this.certidao == rhs.certidao)||((this.certidao!= null)&&this.certidao.equals(rhs.certidao))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
