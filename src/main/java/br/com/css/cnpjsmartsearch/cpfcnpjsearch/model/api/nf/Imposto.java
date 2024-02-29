
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
    "vTotTrib",
    "ICMS",
    "COFINS",
    "PIS"
})
@Generated("jsonschema2pojo")
public class Imposto {

    @JsonProperty("vTotTrib")
    private Double vTotTrib;
    @JsonProperty("ICMS")
    private Icms icms;
    @JsonProperty("COFINS")
    private Cofins cofins;
    @JsonProperty("PIS")
    private Pis pis;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vTotTrib")
    public Double getvTotTrib() {
        return vTotTrib;
    }

    @JsonProperty("vTotTrib")
    public void setvTotTrib(Double vTotTrib) {
        this.vTotTrib = vTotTrib;
    }

    public Imposto withvTotTrib(Double vTotTrib) {
        this.vTotTrib = vTotTrib;
        return this;
    }

    @JsonProperty("ICMS")
    public Icms getIcms() {
        return icms;
    }

    @JsonProperty("ICMS")
    public void setIcms(Icms icms) {
        this.icms = icms;
    }

    public Imposto withIcms(Icms icms) {
        this.icms = icms;
        return this;
    }

    @JsonProperty("COFINS")
    public Cofins getCofins() {
        return cofins;
    }

    @JsonProperty("COFINS")
    public void setCofins(Cofins cofins) {
        this.cofins = cofins;
    }

    public Imposto withCofins(Cofins cofins) {
        this.cofins = cofins;
        return this;
    }

    @JsonProperty("PIS")
    public Pis getPis() {
        return pis;
    }

    @JsonProperty("PIS")
    public void setPis(Pis pis) {
        this.pis = pis;
    }

    public Imposto withPis(Pis pis) {
        this.pis = pis;
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

    public Imposto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Imposto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("vTotTrib");
        sb.append('=');
        sb.append(((this.vTotTrib == null)?"<null>":this.vTotTrib));
        sb.append(',');
        sb.append("icms");
        sb.append('=');
        sb.append(((this.icms == null)?"<null>":this.icms));
        sb.append(',');
        sb.append("cofins");
        sb.append('=');
        sb.append(((this.cofins == null)?"<null>":this.cofins));
        sb.append(',');
        sb.append("pis");
        sb.append('=');
        sb.append(((this.pis == null)?"<null>":this.pis));
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
        result = ((result* 31)+((this.vTotTrib == null)? 0 :this.vTotTrib.hashCode()));
        result = ((result* 31)+((this.icms == null)? 0 :this.icms.hashCode()));
        result = ((result* 31)+((this.pis == null)? 0 :this.pis.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cofins == null)? 0 :this.cofins.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Imposto) == false) {
            return false;
        }
        Imposto rhs = ((Imposto) other);
        return ((((((this.vTotTrib == rhs.vTotTrib)||((this.vTotTrib!= null)&&this.vTotTrib.equals(rhs.vTotTrib)))&&((this.icms == rhs.icms)||((this.icms!= null)&&this.icms.equals(rhs.icms))))&&((this.pis == rhs.pis)||((this.pis!= null)&&this.pis.equals(rhs.pis))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cofins == rhs.cofins)||((this.cofins!= null)&&this.cofins.equals(rhs.cofins))));
    }

}
