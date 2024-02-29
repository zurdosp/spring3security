
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.smartdatacnpj;

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
    "tipo_logradouro",
    "logradouro",
    "numero",
    "complemento",
    "bairro",
    "cep",
    "uf",
    "municipio",
    "address_type",
    "isMain"
})
@Generated("jsonschema2pojo")
public class Address {

    @JsonProperty("tipo_logradouro")
    private String tipoLogradouro;
    @JsonProperty("logradouro")
    private String logradouro;
    @JsonProperty("numero")
    private String numero;
    @JsonProperty("complemento")
    private String complemento;
    @JsonProperty("bairro")
    private String bairro;
    @JsonProperty("cep")
    private String cep;
    @JsonProperty("uf")
    private String uf;
    @JsonProperty("municipio")
    private String municipio;
    @JsonProperty("address_type")
    private String addressType;
    @JsonProperty("isMain")
    private Boolean isMain;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tipo_logradouro")
    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    @JsonProperty("tipo_logradouro")
    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public Address withTipoLogradouro(String tipoLogradouro) {
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

    public Address withLogradouro(String logradouro) {
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

    public Address withNumero(String numero) {
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

    public Address withComplemento(String complemento) {
        this.complemento = complemento;
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

    public Address withBairro(String bairro) {
        this.bairro = bairro;
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

    public Address withCep(String cep) {
        this.cep = cep;
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

    public Address withUf(String uf) {
        this.uf = uf;
        return this;
    }

    @JsonProperty("municipio")
    public String getMunicipio() {
        return municipio;
    }

    @JsonProperty("municipio")
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Address withMunicipio(String municipio) {
        this.municipio = municipio;
        return this;
    }

    @JsonProperty("address_type")
    public String getAddressType() {
        return addressType;
    }

    @JsonProperty("address_type")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Address withAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    @JsonProperty("isMain")
    public Boolean getIsMain() {
        return isMain;
    }

    @JsonProperty("isMain")
    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
    }

    public Address withIsMain(Boolean isMain) {
        this.isMain = isMain;
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

    public Address withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("bairro");
        sb.append('=');
        sb.append(((this.bairro == null)?"<null>":this.bairro));
        sb.append(',');
        sb.append("cep");
        sb.append('=');
        sb.append(((this.cep == null)?"<null>":this.cep));
        sb.append(',');
        sb.append("uf");
        sb.append('=');
        sb.append(((this.uf == null)?"<null>":this.uf));
        sb.append(',');
        sb.append("municipio");
        sb.append('=');
        sb.append(((this.municipio == null)?"<null>":this.municipio));
        sb.append(',');
        sb.append("addressType");
        sb.append('=');
        sb.append(((this.addressType == null)?"<null>":this.addressType));
        sb.append(',');
        sb.append("isMain");
        sb.append('=');
        sb.append(((this.isMain == null)?"<null>":this.isMain));
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
        result = ((result* 31)+((this.addressType == null)? 0 :this.addressType.hashCode()));
        result = ((result* 31)+((this.isMain == null)? 0 :this.isMain.hashCode()));
        result = ((result* 31)+((this.tipoLogradouro == null)? 0 :this.tipoLogradouro.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cep == null)? 0 :this.cep.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return ((((((((((((this.uf == rhs.uf)||((this.uf!= null)&&this.uf.equals(rhs.uf)))&&((this.complemento == rhs.complemento)||((this.complemento!= null)&&this.complemento.equals(rhs.complemento))))&&((this.numero == rhs.numero)||((this.numero!= null)&&this.numero.equals(rhs.numero))))&&((this.logradouro == rhs.logradouro)||((this.logradouro!= null)&&this.logradouro.equals(rhs.logradouro))))&&((this.bairro == rhs.bairro)||((this.bairro!= null)&&this.bairro.equals(rhs.bairro))))&&((this.municipio == rhs.municipio)||((this.municipio!= null)&&this.municipio.equals(rhs.municipio))))&&((this.addressType == rhs.addressType)||((this.addressType!= null)&&this.addressType.equals(rhs.addressType))))&&((this.isMain == rhs.isMain)||((this.isMain!= null)&&this.isMain.equals(rhs.isMain))))&&((this.tipoLogradouro == rhs.tipoLogradouro)||((this.tipoLogradouro!= null)&&this.tipoLogradouro.equals(rhs.tipoLogradouro))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cep == rhs.cep)||((this.cep!= null)&&this.cep.equals(rhs.cep))));
    }

}
