
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.devedor;

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
    "numeroInscricao",
    "numeroProcesso",
    "situacaoInscricao",
    "situacaoDescricao",
    "nomeDevedor",
    "tipoDevedor",
    "valorTotalConsolidadoMoeda",
    "cpfCnpj",
    "codigoSida",
    "nomeUnidade",
    "codigoComprot",
    "codigoUorg"
})
@Generated("jsonschema2pojo")
public class Devedor {

    @JsonProperty("numeroInscricao")
    private String numeroInscricao;
    @JsonProperty("numeroProcesso")
    private String numeroProcesso;
    @JsonProperty("situacaoInscricao")
    private String situacaoInscricao;
    @JsonProperty("situacaoDescricao")
    private String situacaoDescricao;
    @JsonProperty("nomeDevedor")
    private String nomeDevedor;
    @JsonProperty("tipoDevedor")
    private String tipoDevedor;
    @JsonProperty("valorTotalConsolidadoMoeda")
    private String valorTotalConsolidadoMoeda;
    @JsonProperty("cpfCnpj")
    private String cpfCnpj;
    @JsonProperty("codigoSida")
    private String codigoSida;
    @JsonProperty("nomeUnidade")
    private String nomeUnidade;
    @JsonProperty("codigoComprot")
    private String codigoComprot;
    @JsonProperty("codigoUorg")
    private String codigoUorg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("numeroInscricao")
    public String getNumeroInscricao() {
        return numeroInscricao;
    }

    @JsonProperty("numeroInscricao")
    public void setNumeroInscricao(String numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }

    public Devedor withNumeroInscricao(String numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
        return this;
    }

    @JsonProperty("numeroProcesso")
    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    @JsonProperty("numeroProcesso")
    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public Devedor withNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
        return this;
    }

    @JsonProperty("situacaoInscricao")
    public String getSituacaoInscricao() {
        return situacaoInscricao;
    }

    @JsonProperty("situacaoInscricao")
    public void setSituacaoInscricao(String situacaoInscricao) {
        this.situacaoInscricao = situacaoInscricao;
    }

    public Devedor withSituacaoInscricao(String situacaoInscricao) {
        this.situacaoInscricao = situacaoInscricao;
        return this;
    }

    @JsonProperty("situacaoDescricao")
    public String getSituacaoDescricao() {
        return situacaoDescricao;
    }

    @JsonProperty("situacaoDescricao")
    public void setSituacaoDescricao(String situacaoDescricao) {
        this.situacaoDescricao = situacaoDescricao;
    }

    public Devedor withSituacaoDescricao(String situacaoDescricao) {
        this.situacaoDescricao = situacaoDescricao;
        return this;
    }

    @JsonProperty("nomeDevedor")
    public String getNomeDevedor() {
        return nomeDevedor;
    }

    @JsonProperty("nomeDevedor")
    public void setNomeDevedor(String nomeDevedor) {
        this.nomeDevedor = nomeDevedor;
    }

    public Devedor withNomeDevedor(String nomeDevedor) {
        this.nomeDevedor = nomeDevedor;
        return this;
    }

    @JsonProperty("tipoDevedor")
    public String getTipoDevedor() {
        return tipoDevedor;
    }

    @JsonProperty("tipoDevedor")
    public void setTipoDevedor(String tipoDevedor) {
        this.tipoDevedor = tipoDevedor;
    }

    public Devedor withTipoDevedor(String tipoDevedor) {
        this.tipoDevedor = tipoDevedor;
        return this;
    }

    @JsonProperty("valorTotalConsolidadoMoeda")
    public String getValorTotalConsolidadoMoeda() {
        return valorTotalConsolidadoMoeda;
    }

    @JsonProperty("valorTotalConsolidadoMoeda")
    public void setValorTotalConsolidadoMoeda(String valorTotalConsolidadoMoeda) {
        this.valorTotalConsolidadoMoeda = valorTotalConsolidadoMoeda;
    }

    public Devedor withValorTotalConsolidadoMoeda(String valorTotalConsolidadoMoeda) {
        this.valorTotalConsolidadoMoeda = valorTotalConsolidadoMoeda;
        return this;
    }

    @JsonProperty("cpfCnpj")
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    @JsonProperty("cpfCnpj")
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Devedor withCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
        return this;
    }

    @JsonProperty("codigoSida")
    public String getCodigoSida() {
        return codigoSida;
    }

    @JsonProperty("codigoSida")
    public void setCodigoSida(String codigoSida) {
        this.codigoSida = codigoSida;
    }

    public Devedor withCodigoSida(String codigoSida) {
        this.codigoSida = codigoSida;
        return this;
    }

    @JsonProperty("nomeUnidade")
    public String getNomeUnidade() {
        return nomeUnidade;
    }

    @JsonProperty("nomeUnidade")
    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    public Devedor withNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
        return this;
    }

    @JsonProperty("codigoComprot")
    public String getCodigoComprot() {
        return codigoComprot;
    }

    @JsonProperty("codigoComprot")
    public void setCodigoComprot(String codigoComprot) {
        this.codigoComprot = codigoComprot;
    }

    public Devedor withCodigoComprot(String codigoComprot) {
        this.codigoComprot = codigoComprot;
        return this;
    }

    @JsonProperty("codigoUorg")
    public String getCodigoUorg() {
        return codigoUorg;
    }

    @JsonProperty("codigoUorg")
    public void setCodigoUorg(String codigoUorg) {
        this.codigoUorg = codigoUorg;
    }

    public Devedor withCodigoUorg(String codigoUorg) {
        this.codigoUorg = codigoUorg;
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

    public Devedor withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Devedor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numeroInscricao");
        sb.append('=');
        sb.append(((this.numeroInscricao == null)?"<null>":this.numeroInscricao));
        sb.append(',');
        sb.append("numeroProcesso");
        sb.append('=');
        sb.append(((this.numeroProcesso == null)?"<null>":this.numeroProcesso));
        sb.append(',');
        sb.append("situacaoInscricao");
        sb.append('=');
        sb.append(((this.situacaoInscricao == null)?"<null>":this.situacaoInscricao));
        sb.append(',');
        sb.append("situacaoDescricao");
        sb.append('=');
        sb.append(((this.situacaoDescricao == null)?"<null>":this.situacaoDescricao));
        sb.append(',');
        sb.append("nomeDevedor");
        sb.append('=');
        sb.append(((this.nomeDevedor == null)?"<null>":this.nomeDevedor));
        sb.append(',');
        sb.append("tipoDevedor");
        sb.append('=');
        sb.append(((this.tipoDevedor == null)?"<null>":this.tipoDevedor));
        sb.append(',');
        sb.append("valorTotalConsolidadoMoeda");
        sb.append('=');
        sb.append(((this.valorTotalConsolidadoMoeda == null)?"<null>":this.valorTotalConsolidadoMoeda));
        sb.append(',');
        sb.append("cpfCnpj");
        sb.append('=');
        sb.append(((this.cpfCnpj == null)?"<null>":this.cpfCnpj));
        sb.append(',');
        sb.append("codigoSida");
        sb.append('=');
        sb.append(((this.codigoSida == null)?"<null>":this.codigoSida));
        sb.append(',');
        sb.append("nomeUnidade");
        sb.append('=');
        sb.append(((this.nomeUnidade == null)?"<null>":this.nomeUnidade));
        sb.append(',');
        sb.append("codigoComprot");
        sb.append('=');
        sb.append(((this.codigoComprot == null)?"<null>":this.codigoComprot));
        sb.append(',');
        sb.append("codigoUorg");
        sb.append('=');
        sb.append(((this.codigoUorg == null)?"<null>":this.codigoUorg));
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
        result = ((result* 31)+((this.tipoDevedor == null)? 0 :this.tipoDevedor.hashCode()));
        result = ((result* 31)+((this.nomeUnidade == null)? 0 :this.nomeUnidade.hashCode()));
        result = ((result* 31)+((this.numeroProcesso == null)? 0 :this.numeroProcesso.hashCode()));
        result = ((result* 31)+((this.situacaoInscricao == null)? 0 :this.situacaoInscricao.hashCode()));
        result = ((result* 31)+((this.numeroInscricao == null)? 0 :this.numeroInscricao.hashCode()));
        result = ((result* 31)+((this.codigoSida == null)? 0 :this.codigoSida.hashCode()));
        result = ((result* 31)+((this.codigoUorg == null)? 0 :this.codigoUorg.hashCode()));
        result = ((result* 31)+((this.nomeDevedor == null)? 0 :this.nomeDevedor.hashCode()));
        result = ((result* 31)+((this.cpfCnpj == null)? 0 :this.cpfCnpj.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.codigoComprot == null)? 0 :this.codigoComprot.hashCode()));
        result = ((result* 31)+((this.situacaoDescricao == null)? 0 :this.situacaoDescricao.hashCode()));
        result = ((result* 31)+((this.valorTotalConsolidadoMoeda == null)? 0 :this.valorTotalConsolidadoMoeda.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Devedor) == false) {
            return false;
        }
        Devedor rhs = ((Devedor) other);
        return ((((((((((((((this.tipoDevedor == rhs.tipoDevedor)||((this.tipoDevedor!= null)&&this.tipoDevedor.equals(rhs.tipoDevedor)))&&((this.nomeUnidade == rhs.nomeUnidade)||((this.nomeUnidade!= null)&&this.nomeUnidade.equals(rhs.nomeUnidade))))&&((this.numeroProcesso == rhs.numeroProcesso)||((this.numeroProcesso!= null)&&this.numeroProcesso.equals(rhs.numeroProcesso))))&&((this.situacaoInscricao == rhs.situacaoInscricao)||((this.situacaoInscricao!= null)&&this.situacaoInscricao.equals(rhs.situacaoInscricao))))&&((this.numeroInscricao == rhs.numeroInscricao)||((this.numeroInscricao!= null)&&this.numeroInscricao.equals(rhs.numeroInscricao))))&&((this.codigoSida == rhs.codigoSida)||((this.codigoSida!= null)&&this.codigoSida.equals(rhs.codigoSida))))&&((this.codigoUorg == rhs.codigoUorg)||((this.codigoUorg!= null)&&this.codigoUorg.equals(rhs.codigoUorg))))&&((this.nomeDevedor == rhs.nomeDevedor)||((this.nomeDevedor!= null)&&this.nomeDevedor.equals(rhs.nomeDevedor))))&&((this.cpfCnpj == rhs.cpfCnpj)||((this.cpfCnpj!= null)&&this.cpfCnpj.equals(rhs.cpfCnpj))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.codigoComprot == rhs.codigoComprot)||((this.codigoComprot!= null)&&this.codigoComprot.equals(rhs.codigoComprot))))&&((this.situacaoDescricao == rhs.situacaoDescricao)||((this.situacaoDescricao!= null)&&this.situacaoDescricao.equals(rhs.situacaoDescricao))))&&((this.valorTotalConsolidadoMoeda == rhs.valorTotalConsolidadoMoeda)||((this.valorTotalConsolidadoMoeda!= null)&&this.valorTotalConsolidadoMoeda.equals(rhs.valorTotalConsolidadoMoeda))));
    }

}
