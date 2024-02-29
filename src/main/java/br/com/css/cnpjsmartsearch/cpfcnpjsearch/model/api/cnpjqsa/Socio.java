
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnpjqsa;

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
    "tipoSocio",
    "nome",
    "qualificacao",
    "pais",
    "representanteLegal"
})
@Generated("jsonschema2pojo")
public class Socio {

    @JsonProperty("tipoSocio")
    private String tipoSocio;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("qualificacao")
    private String qualificacao;
    @JsonProperty("pais")
    private Pais__1 pais;
    @JsonProperty("representanteLegal")
    private RepresentanteLegal representanteLegal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tipoSocio")
    public String getTipoSocio() {
        return tipoSocio;
    }

    @JsonProperty("tipoSocio")
    public void setTipoSocio(String tipoSocio) {
        this.tipoSocio = tipoSocio;
    }

    public Socio withTipoSocio(String tipoSocio) {
        this.tipoSocio = tipoSocio;
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

    public Socio withNome(String nome) {
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

    public Socio withQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
        return this;
    }

    @JsonProperty("pais")
    public Pais__1 getPais() {
        return pais;
    }

    @JsonProperty("pais")
    public void setPais(Pais__1 pais) {
        this.pais = pais;
    }

    public Socio withPais(Pais__1 pais) {
        this.pais = pais;
        return this;
    }

    @JsonProperty("representanteLegal")
    public RepresentanteLegal getRepresentanteLegal() {
        return representanteLegal;
    }

    @JsonProperty("representanteLegal")
    public void setRepresentanteLegal(RepresentanteLegal representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public Socio withRepresentanteLegal(RepresentanteLegal representanteLegal) {
        this.representanteLegal = representanteLegal;
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

    public Socio withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Socio.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tipoSocio");
        sb.append('=');
        sb.append(((this.tipoSocio == null)?"<null>":this.tipoSocio));
        sb.append(',');
        sb.append("nome");
        sb.append('=');
        sb.append(((this.nome == null)?"<null>":this.nome));
        sb.append(',');
        sb.append("qualificacao");
        sb.append('=');
        sb.append(((this.qualificacao == null)?"<null>":this.qualificacao));
        sb.append(',');
        sb.append("pais");
        sb.append('=');
        sb.append(((this.pais == null)?"<null>":this.pais));
        sb.append(',');
        sb.append("representanteLegal");
        sb.append('=');
        sb.append(((this.representanteLegal == null)?"<null>":this.representanteLegal));
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
        result = ((result* 31)+((this.qualificacao == null)? 0 :this.qualificacao.hashCode()));
        result = ((result* 31)+((this.representanteLegal == null)? 0 :this.representanteLegal.hashCode()));
        result = ((result* 31)+((this.nome == null)? 0 :this.nome.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tipoSocio == null)? 0 :this.tipoSocio.hashCode()));
        result = ((result* 31)+((this.pais == null)? 0 :this.pais.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Socio) == false) {
            return false;
        }
        Socio rhs = ((Socio) other);
        return (((((((this.qualificacao == rhs.qualificacao)||((this.qualificacao!= null)&&this.qualificacao.equals(rhs.qualificacao)))&&((this.representanteLegal == rhs.representanteLegal)||((this.representanteLegal!= null)&&this.representanteLegal.equals(rhs.representanteLegal))))&&((this.nome == rhs.nome)||((this.nome!= null)&&this.nome.equals(rhs.nome))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tipoSocio == rhs.tipoSocio)||((this.tipoSocio!= null)&&this.tipoSocio.equals(rhs.tipoSocio))))&&((this.pais == rhs.pais)||((this.pais!= null)&&this.pais.equals(rhs.pais))));
    }

}
