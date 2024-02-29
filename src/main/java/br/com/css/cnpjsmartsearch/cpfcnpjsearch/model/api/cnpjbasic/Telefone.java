
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnpjbasic;

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
    "ddd",
    "numero"
})
@Generated("jsonschema2pojo")
public class Telefone {

    @JsonProperty("ddd")
    private String ddd;
    @JsonProperty("numero")
    private String numero;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ddd")
    public String getDdd() {
        return ddd;
    }

    @JsonProperty("ddd")
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Telefone withDdd(String ddd) {
        this.ddd = ddd;
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

    public Telefone withNumero(String numero) {
        this.numero = numero;
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

    public Telefone withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Telefone.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ddd");
        sb.append('=');
        sb.append(((this.ddd == null)?"<null>":this.ddd));
        sb.append(',');
        sb.append("numero");
        sb.append('=');
        sb.append(((this.numero == null)?"<null>":this.numero));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.numero == null)? 0 :this.numero.hashCode()));
        result = ((result* 31)+((this.ddd == null)? 0 :this.ddd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Telefone) == false) {
            return false;
        }
        Telefone rhs = ((Telefone) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.numero == rhs.numero)||((this.numero!= null)&&this.numero.equals(rhs.numero))))&&((this.ddd == rhs.ddd)||((this.ddd!= null)&&this.ddd.equals(rhs.ddd))));
    }

}
