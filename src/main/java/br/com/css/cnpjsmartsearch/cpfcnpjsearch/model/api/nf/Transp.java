
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "modFrete",
    "vol",
    "transporta"
})
@Generated("jsonschema2pojo")
public class Transp {

    @JsonProperty("modFrete")
    private Integer modFrete;
    @JsonProperty("vol")
    private Vol vol;
    @JsonProperty("transporta")
    private Transporta transporta;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("modFrete")
    public Integer getModFrete() {
        return modFrete;
    }

    @JsonProperty("modFrete")
    public void setModFrete(Integer modFrete) {
        this.modFrete = modFrete;
    }

    public Transp withModFrete(Integer modFrete) {
        this.modFrete = modFrete;
        return this;
    }

    @JsonProperty("vol")
    public Vol getVol() {
        return vol;
    }

    @JsonProperty("vol")
    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public Transp withVol(Vol vol) {
        this.vol = vol;
        return this;
    }

    @JsonProperty("transporta")
    public Transporta getTransporta() {
        return transporta;
    }

    @JsonProperty("transporta")
    public void setTransporta(Transporta transporta) {
        this.transporta = transporta;
    }

    public Transp withTransporta(Transporta transporta) {
        this.transporta = transporta;
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

    public Transp withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Transp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("modFrete");
        sb.append('=');
        sb.append(((this.modFrete == null)?"<null>":this.modFrete));
        sb.append(',');
        sb.append("vol");
        sb.append('=');
        sb.append(((this.vol == null)?"<null>":this.vol));
        sb.append(',');
        sb.append("transporta");
        sb.append('=');
        sb.append(((this.transporta == null)?"<null>":this.transporta));
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
        result = ((result* 31)+((this.modFrete == null)? 0 :this.modFrete.hashCode()));
        result = ((result* 31)+((this.vol == null)? 0 :this.vol.hashCode()));
        result = ((result* 31)+((this.transporta == null)? 0 :this.transporta.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transp) == false) {
            return false;
        }
        Transp rhs = ((Transp) other);
        return (((((this.modFrete == rhs.modFrete)||((this.modFrete!= null)&&this.modFrete.equals(rhs.modFrete)))&&((this.vol == rhs.vol)||((this.vol!= null)&&this.vol.equals(rhs.vol))))&&((this.transporta == rhs.transporta)||((this.transporta!= null)&&this.transporta.equals(rhs.transporta))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
