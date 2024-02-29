
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
    "nItem",
    "prod",
    "imposto"
})
@Generated("jsonschema2pojo")
public class Det {

    @JsonProperty("nItem")
    private Integer nItem;
    @JsonProperty("prod")
    private Prod prod;
    @JsonProperty("imposto")
    private Imposto imposto;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nItem")
    public Integer getnItem() {
        return nItem;
    }

    @JsonProperty("nItem")
    public void setnItem(Integer nItem) {
        this.nItem = nItem;
    }

    public Det withnItem(Integer nItem) {
        this.nItem = nItem;
        return this;
    }

    @JsonProperty("prod")
    public Prod getProd() {
        return prod;
    }

    @JsonProperty("prod")
    public void setProd(Prod prod) {
        this.prod = prod;
    }

    public Det withProd(Prod prod) {
        this.prod = prod;
        return this;
    }

    @JsonProperty("imposto")
    public Imposto getImposto() {
        return imposto;
    }

    @JsonProperty("imposto")
    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public Det withImposto(Imposto imposto) {
        this.imposto = imposto;
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

    public Det withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Det.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nItem");
        sb.append('=');
        sb.append(((this.nItem == null)?"<null>":this.nItem));
        sb.append(',');
        sb.append("prod");
        sb.append('=');
        sb.append(((this.prod == null)?"<null>":this.prod));
        sb.append(',');
        sb.append("imposto");
        sb.append('=');
        sb.append(((this.imposto == null)?"<null>":this.imposto));
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
        result = ((result* 31)+((this.nItem == null)? 0 :this.nItem.hashCode()));
        result = ((result* 31)+((this.prod == null)? 0 :this.prod.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.imposto == null)? 0 :this.imposto.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Det) == false) {
            return false;
        }
        Det rhs = ((Det) other);
        return (((((this.nItem == rhs.nItem)||((this.nItem!= null)&&this.nItem.equals(rhs.nItem)))&&((this.prod == rhs.prod)||((this.prod!= null)&&this.prod.equals(rhs.prod))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.imposto == rhs.imposto)||((this.imposto!= null)&&this.imposto.equals(rhs.imposto))));
    }

}
