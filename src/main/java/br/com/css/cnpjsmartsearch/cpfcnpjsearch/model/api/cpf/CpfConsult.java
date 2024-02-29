
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cpf;


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
    "ni",
    "nome",
    "situacao",
    "nascimento",
    "obito"
})
@Generated("jsonschema2pojo")
public class CpfConsult {

    @JsonProperty("ni")
    private String ni;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("situacao")
    private Situacao situacao;
    @JsonProperty("nascimento")
    private String nascimento;
    @JsonProperty("obito")
    private String obito;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ni")
    public String getNi() {
        return ni;
    }

    @JsonProperty("ni")
    public void setNi(String ni) {
        this.ni = ni;
    }

    public CpfConsult withNi(String ni) {
        this.ni = ni;
        return this;
    }

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    public CpfConsult withNome(String nome) {
        this.nome = nome;
        return this;
    }

    @JsonProperty("situacao")
    public Situacao getSituacao() {
        return situacao;
    }

    @JsonProperty("situacao")
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public CpfConsult withSituacao(Situacao situacao) {
        this.situacao = situacao;
        return this;
    }

    @JsonProperty("nascimento")
    public String getNascimento() {
        return nascimento;
    }

    @JsonProperty("nascimento")
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public CpfConsult withNascimento(String nascimento) {
        this.nascimento = nascimento;
        return this;
    }

    @JsonProperty("obito")
    public String getObito() {
        return obito;
    }

    @JsonProperty("obito")
    public void setObito(String obito) {
        this.obito = obito;
    }

    public CpfConsult withObito(String obito) {
        this.obito = obito;
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

    public CpfConsult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CpfConsult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ni");
        sb.append('=');
        sb.append(((this.ni == null)?"<null>":this.ni));
        sb.append(',');
        sb.append("nome");
        sb.append('=');
        sb.append(((this.nome == null)?"<null>":this.nome));
        sb.append(',');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null)?"<null>":this.situacao));
        sb.append(',');
        sb.append("nascimento");
        sb.append('=');
        sb.append(((this.nascimento == null)?"<null>":this.nascimento));
        sb.append(',');
        sb.append("obito");
        sb.append('=');
        sb.append(((this.obito == null)?"<null>":this.obito));
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
        result = ((result* 31)+((this.situacao == null)? 0 :this.situacao.hashCode()));
        result = ((result* 31)+((this.nascimento == null)? 0 :this.nascimento.hashCode()));
        result = ((result* 31)+((this.nome == null)? 0 :this.nome.hashCode()));
        result = ((result* 31)+((this.ni == null)? 0 :this.ni.hashCode()));
        result = ((result* 31)+((this.obito == null)? 0 :this.obito.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CpfConsult) == false) {
            return false;
        }
        CpfConsult rhs = ((CpfConsult) other);
        return (((((((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao)))&&((this.nascimento == rhs.nascimento)||((this.nascimento!= null)&&this.nascimento.equals(rhs.nascimento))))&&((this.nome == rhs.nome)||((this.nome!= null)&&this.nome.equals(rhs.nome))))&&((this.ni == rhs.ni)||((this.ni!= null)&&this.ni.equals(rhs.ni))))&&((this.obito == rhs.obito)||((this.obito!= null)&&this.obito.equals(rhs.obito))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
