
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnpjcompany;

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
    "cpf",
    "nome",
    "qualificacao"
})
@Generated("jsonschema2pojo")
public class RepresentanteLegal {

    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("qualificacao")
    private String qualificacao;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cpf")
    public String getCpf() {
        return cpf;
    }

    @JsonProperty("cpf")
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public RepresentanteLegal withCpf(String cpf) {
        this.cpf = cpf;
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

    public RepresentanteLegal withNome(String nome) {
        this.nome = nome;
        return this;
    }

    @JsonProperty("qualificacao")
    public String getQualificacao() {
        return qualificacao;
    }

    @JsonProperty("qualificacao")
    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }

    public RepresentanteLegal withQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
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

    public RepresentanteLegal withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RepresentanteLegal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cpf");
        sb.append('=');
        sb.append(((this.cpf == null)?"<null>":this.cpf));
        sb.append(',');
        sb.append("nome");
        sb.append('=');
        sb.append(((this.nome == null)?"<null>":this.nome));
        sb.append(',');
        sb.append("qualificacao");
        sb.append('=');
        sb.append(((this.qualificacao == null)?"<null>":this.qualificacao));
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
        result = ((result* 31)+((this.qualificacao == null)? 0 :this.qualificacao.hashCode()));
        result = ((result* 31)+((this.nome == null)? 0 :this.nome.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RepresentanteLegal) == false) {
            return false;
        }
        RepresentanteLegal rhs = ((RepresentanteLegal) other);
        return (((((this.cpf == rhs.cpf)||((this.cpf!= null)&&this.cpf.equals(rhs.cpf)))&&((this.qualificacao == rhs.qualificacao)||((this.qualificacao!= null)&&this.qualificacao.equals(rhs.qualificacao))))&&((this.nome == rhs.nome)||((this.nome!= null)&&this.nome.equals(rhs.nome))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
