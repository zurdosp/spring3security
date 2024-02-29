
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
    "tipoLogradouro",
    "logradouro",
    "numero",
    "complemento",
    "cep",
    "bairro",
    "municipio",
    "uf",
    "pais"
})
@Generated("jsonschema2pojo")
public class Endereco {

    @JsonProperty("tipoLogradouro")
    private String tipoLogradouro;
    @JsonProperty("logradouro")
    private String logradouro;
    @JsonProperty("numero")
    private String numero;
    @JsonProperty("complemento")
    private String complemento;
    @JsonProperty("cep")
    private String cep;
    @JsonProperty("bairro")
    private String bairro;
    @JsonProperty("municipio")
    private Municipio municipio;
    @JsonProperty("uf")
    private String uf;
    @JsonProperty("pais")
    private Pais pais;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tipoLogradouro")
    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    @JsonProperty("tipoLogradouro")
    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public Endereco withTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
        return this;
    }

    @JsonProperty("logradouro")
    public String getLogradouro() {
        return logradouro;
    }

    @JsonProperty("logradouro")
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Endereco withLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    @JsonProperty("numero")
    public String getNumero() {
        return numero;
    }

    @JsonProperty("numero")
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Endereco withNumero(String numero) {
        this.numero = numero;
        return this;
    }

    @JsonProperty("complemento")
    public String getComplemento() {
        return complemento;
    }

    @JsonProperty("complemento")
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Endereco withComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    @JsonProperty("cep")
    public String getCep() {
        return cep;
    }

    @JsonProperty("cep")
    public void setCep(String cep) {
        this.cep = cep;
    }

    public Endereco withCep(String cep) {
        this.cep = cep;
        return this;
    }

    @JsonProperty("bairro")
    public String getBairro() {
        return bairro;
    }

    @JsonProperty("bairro")
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Endereco withBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    @JsonProperty("municipio")
    public Municipio getMunicipio() {
        return municipio;
    }

    @JsonProperty("municipio")
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Endereco withMunicipio(Municipio municipio) {
        this.municipio = municipio;
        return this;
    }

    @JsonProperty("uf")
    public String getUf() {
        return uf;
    }

    @JsonProperty("uf")
    public void setUf(String uf) {
        this.uf = uf;
    }

    public Endereco withUf(String uf) {
        this.uf = uf;
        return this;
    }

    @JsonProperty("pais")
    public Pais getPais() {
        return pais;
    }

    @JsonProperty("pais")
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Endereco withPais(Pais pais) {
        this.pais = pais;
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

    public Endereco withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Endereco.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tipoLogradouro");
        sb.append('=');
        sb.append(((this.tipoLogradouro == null)?"<null>":this.tipoLogradouro));
        sb.append(',');
        sb.append("logradouro");
        sb.append('=');
        sb.append(((this.logradouro == null)?"<null>":this.logradouro));
        sb.append(',');
        sb.append("numero");
        sb.append('=');
        sb.append(((this.numero == null)?"<null>":this.numero));
        sb.append(',');
        sb.append("complemento");
        sb.append('=');
        sb.append(((this.complemento == null)?"<null>":this.complemento));
        sb.append(',');
        sb.append("cep");
        sb.append('=');
        sb.append(((this.cep == null)?"<null>":this.cep));
        sb.append(',');
        sb.append("bairro");
        sb.append('=');
        sb.append(((this.bairro == null)?"<null>":this.bairro));
        sb.append(',');
        sb.append("municipio");
        sb.append('=');
        sb.append(((this.municipio == null)?"<null>":this.municipio));
        sb.append(',');
        sb.append("uf");
        sb.append('=');
        sb.append(((this.uf == null)?"<null>":this.uf));
        sb.append(',');
        sb.append("pais");
        sb.append('=');
        sb.append(((this.pais == null)?"<null>":this.pais));
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
        result = ((result* 31)+((this.uf == null)? 0 :this.uf.hashCode()));
        result = ((result* 31)+((this.complemento == null)? 0 :this.complemento.hashCode()));
        result = ((result* 31)+((this.numero == null)? 0 :this.numero.hashCode()));
        result = ((result* 31)+((this.logradouro == null)? 0 :this.logradouro.hashCode()));
        result = ((result* 31)+((this.bairro == null)? 0 :this.bairro.hashCode()));
        result = ((result* 31)+((this.municipio == null)? 0 :this.municipio.hashCode()));
        result = ((result* 31)+((this.tipoLogradouro == null)? 0 :this.tipoLogradouro.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cep == null)? 0 :this.cep.hashCode()));
        result = ((result* 31)+((this.pais == null)? 0 :this.pais.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Endereco) == false) {
            return false;
        }
        Endereco rhs = ((Endereco) other);
        return (((((((((((this.uf == rhs.uf)||((this.uf!= null)&&this.uf.equals(rhs.uf)))&&((this.complemento == rhs.complemento)||((this.complemento!= null)&&this.complemento.equals(rhs.complemento))))&&((this.numero == rhs.numero)||((this.numero!= null)&&this.numero.equals(rhs.numero))))&&((this.logradouro == rhs.logradouro)||((this.logradouro!= null)&&this.logradouro.equals(rhs.logradouro))))&&((this.bairro == rhs.bairro)||((this.bairro!= null)&&this.bairro.equals(rhs.bairro))))&&((this.municipio == rhs.municipio)||((this.municipio!= null)&&this.municipio.equals(rhs.municipio))))&&((this.tipoLogradouro == rhs.tipoLogradouro)||((this.tipoLogradouro!= null)&&this.tipoLogradouro.equals(rhs.tipoLogradouro))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cep == rhs.cep)||((this.cep!= null)&&this.cep.equals(rhs.cep))))&&((this.pais == rhs.pais)||((this.pais!= null)&&this.pais.equals(rhs.pais))));
    }

}
