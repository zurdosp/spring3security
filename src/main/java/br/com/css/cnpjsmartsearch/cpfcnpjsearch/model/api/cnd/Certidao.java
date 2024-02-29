
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
    "TipoContribuinte",
    "ContribuinteCertidao",
    "TipoCertid\u00e3o",
    "CodigoControle",
    "DataEmissao",
    "DataValidade",
    "DocumentoPdf"
})
@Generated("jsonschema2pojo")
public class Certidao {

	@SerializedName("TipoContribuinte")
    @JsonProperty("TipoContribuinte")
    private Integer tipoContribuinte;
	
	@SerializedName("ContribuinteCertidao")
    @JsonProperty("ContribuinteCertidao")
    private String contribuinteCertidao;
	
	@SerializedName("TipoCertid\\u00e3o")
    @JsonProperty("TipoCertid\u00e3o")
    private Integer tipoCertidO;
	
	@SerializedName("CodigoControle")
    @JsonProperty("CodigoControle")
    private String codigoControle;
	
	@SerializedName("DataEmissao")
    @JsonProperty("DataEmissao")
    private String dataEmissao;
	
	@SerializedName("DataValidade")
    @JsonProperty("DataValidade")
    private String dataValidade;
	
	@SerializedName("DocumentoPdf")
    @JsonProperty("DocumentoPdf")
    private String documentoPdf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    @JsonProperty("TipoContribuinte")
    public Integer getTipoContribuinte() {
        return tipoContribuinte;
    }

    @JsonProperty("TipoContribuinte")
    public void setTipoContribuinte(Integer tipoContribuinte) {
        this.tipoContribuinte = tipoContribuinte;
    }

    public Certidao withTipoContribuinte(Integer tipoContribuinte) {
        this.tipoContribuinte = tipoContribuinte;
        return this;
    }

    @JsonProperty("ContribuinteCertidao")
    public String getContribuinteCertidao() {
        return contribuinteCertidao;
    }

    @JsonProperty("ContribuinteCertidao")
    public void setContribuinteCertidao(String contribuinteCertidao) {
        this.contribuinteCertidao = contribuinteCertidao;
    }

    public Certidao withContribuinteCertidao(String contribuinteCertidao) {
        this.contribuinteCertidao = contribuinteCertidao;
        return this;
    }

    @JsonProperty("TipoCertid\u00e3o")
    public Integer getTipoCertidO() {
        return tipoCertidO;
    }

    @JsonProperty("TipoCertid\u00e3o")
    public void setTipoCertidO(Integer tipoCertidO) {
        this.tipoCertidO = tipoCertidO;
    }

    public Certidao withTipoCertidO(Integer tipoCertidO) {
        this.tipoCertidO = tipoCertidO;
        return this;
    }

    @JsonProperty("CodigoControle")
    public String getCodigoControle() {
        return codigoControle;
    }

    @JsonProperty("CodigoControle")
    public void setCodigoControle(String codigoControle) {
        this.codigoControle = codigoControle;
    }

    public Certidao withCodigoControle(String codigoControle) {
        this.codigoControle = codigoControle;
        return this;
    }

    @JsonProperty("DataEmissao")
    public String getDataEmissao() {
        return dataEmissao;
    }

    @JsonProperty("DataEmissao")
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Certidao withDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
        return this;
    }

    @JsonProperty("DataValidade")
    public String getDataValidade() {
        return dataValidade;
    }

    @JsonProperty("DataValidade")
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Certidao withDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
        return this;
    }

    @JsonProperty("DocumentoPdf")
    public String getDocumentoPdf() {
        return documentoPdf;
    }

    @JsonProperty("DocumentoPdf")
    public void setDocumentoPdf(String documentoPdf) {
        this.documentoPdf = documentoPdf;
    }

    public Certidao withDocumentoPdf(String documentoPdf) {
        this.documentoPdf = documentoPdf;
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

    public Certidao withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Certidao.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tipoContribuinte");
        sb.append('=');
        sb.append(((this.tipoContribuinte == null)?"<null>":this.tipoContribuinte));
        sb.append(',');
        sb.append("contribuinteCertidao");
        sb.append('=');
        sb.append(((this.contribuinteCertidao == null)?"<null>":this.contribuinteCertidao));
        sb.append(',');
        sb.append("tipoCertidO");
        sb.append('=');
        sb.append(((this.tipoCertidO == null)?"<null>":this.tipoCertidO));
        sb.append(',');
        sb.append("codigoControle");
        sb.append('=');
        sb.append(((this.codigoControle == null)?"<null>":this.codigoControle));
        sb.append(',');
        sb.append("dataEmissao");
        sb.append('=');
        sb.append(((this.dataEmissao == null)?"<null>":this.dataEmissao));
        sb.append(',');
        sb.append("dataValidade");
        sb.append('=');
        sb.append(((this.dataValidade == null)?"<null>":this.dataValidade));
        sb.append(',');
        sb.append("documentoPdf");
        sb.append('=');
        sb.append(((this.documentoPdf == null)?"<null>":this.documentoPdf));
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
        result = ((result* 31)+((this.documentoPdf == null)? 0 :this.documentoPdf.hashCode()));
        result = ((result* 31)+((this.dataValidade == null)? 0 :this.dataValidade.hashCode()));
        result = ((result* 31)+((this.tipoCertidO == null)? 0 :this.tipoCertidO.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.contribuinteCertidao == null)? 0 :this.contribuinteCertidao.hashCode()));
        result = ((result* 31)+((this.dataEmissao == null)? 0 :this.dataEmissao.hashCode()));
        result = ((result* 31)+((this.codigoControle == null)? 0 :this.codigoControle.hashCode()));
        result = ((result* 31)+((this.tipoContribuinte == null)? 0 :this.tipoContribuinte.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Certidao) == false) {
            return false;
        }
        Certidao rhs = ((Certidao) other);
        return (((((((((this.documentoPdf == rhs.documentoPdf)||((this.documentoPdf!= null)&&this.documentoPdf.equals(rhs.documentoPdf)))&&((this.dataValidade == rhs.dataValidade)||((this.dataValidade!= null)&&this.dataValidade.equals(rhs.dataValidade))))&&((this.tipoCertidO == rhs.tipoCertidO)||((this.tipoCertidO!= null)&&this.tipoCertidO.equals(rhs.tipoCertidO))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.contribuinteCertidao == rhs.contribuinteCertidao)||((this.contribuinteCertidao!= null)&&this.contribuinteCertidao.equals(rhs.contribuinteCertidao))))&&((this.dataEmissao == rhs.dataEmissao)||((this.dataEmissao!= null)&&this.dataEmissao.equals(rhs.dataEmissao))))&&((this.codigoControle == rhs.codigoControle)||((this.codigoControle!= null)&&this.codigoControle.equals(rhs.codigoControle))))&&((this.tipoContribuinte == rhs.tipoContribuinte)||((this.tipoContribuinte!= null)&&this.tipoContribuinte.equals(rhs.tipoContribuinte))));
    }

}
