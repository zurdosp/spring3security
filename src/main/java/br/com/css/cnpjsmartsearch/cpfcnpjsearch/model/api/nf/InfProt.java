
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
    "nProt",
    "digVal",
    "dhRecbto",
    "chNFe",
    "xMotivo",
    "cStat"
})
@Generated("jsonschema2pojo")
public class InfProt {

    @JsonProperty("nProt")
    private Long nProt;
    @JsonProperty("digVal")
    private String digVal;
    @JsonProperty("dhRecbto")
    private String dhRecbto;
    @JsonProperty("chNFe")
    private String chNFe;
    @JsonProperty("xMotivo")
    private String xMotivo;
    @JsonProperty("cStat")
    private Integer cStat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nProt")
    public Long getnProt() {
        return nProt;
    }

    @JsonProperty("nProt")
    public void setnProt(Long nProt) {
        this.nProt = nProt;
    }

    public InfProt withnProt(Long nProt) {
        this.nProt = nProt;
        return this;
    }

    @JsonProperty("digVal")
    public String getDigVal() {
        return digVal;
    }

    @JsonProperty("digVal")
    public void setDigVal(String digVal) {
        this.digVal = digVal;
    }

    public InfProt withDigVal(String digVal) {
        this.digVal = digVal;
        return this;
    }

    @JsonProperty("dhRecbto")
    public String getDhRecbto() {
        return dhRecbto;
    }

    @JsonProperty("dhRecbto")
    public void setDhRecbto(String dhRecbto) {
        this.dhRecbto = dhRecbto;
    }

    public InfProt withDhRecbto(String dhRecbto) {
        this.dhRecbto = dhRecbto;
        return this;
    }

    @JsonProperty("chNFe")
    public String getChNFe() {
        return chNFe;
    }

    @JsonProperty("chNFe")
    public void setChNFe(String chNFe) {
        this.chNFe = chNFe;
    }

    public InfProt withChNFe(String chNFe) {
        this.chNFe = chNFe;
        return this;
    }

    @JsonProperty("xMotivo")
    public String getxMotivo() {
        return xMotivo;
    }

    @JsonProperty("xMotivo")
    public void setxMotivo(String xMotivo) {
        this.xMotivo = xMotivo;
    }

    public InfProt withxMotivo(String xMotivo) {
        this.xMotivo = xMotivo;
        return this;
    }

    @JsonProperty("cStat")
    public Integer getcStat() {
        return cStat;
    }

    @JsonProperty("cStat")
    public void setcStat(Integer cStat) {
        this.cStat = cStat;
    }

    public InfProt withcStat(Integer cStat) {
        this.cStat = cStat;
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

    public InfProt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InfProt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nProt");
        sb.append('=');
        sb.append(((this.nProt == null)?"<null>":this.nProt));
        sb.append(',');
        sb.append("digVal");
        sb.append('=');
        sb.append(((this.digVal == null)?"<null>":this.digVal));
        sb.append(',');
        sb.append("dhRecbto");
        sb.append('=');
        sb.append(((this.dhRecbto == null)?"<null>":this.dhRecbto));
        sb.append(',');
        sb.append("chNFe");
        sb.append('=');
        sb.append(((this.chNFe == null)?"<null>":this.chNFe));
        sb.append(',');
        sb.append("xMotivo");
        sb.append('=');
        sb.append(((this.xMotivo == null)?"<null>":this.xMotivo));
        sb.append(',');
        sb.append("cStat");
        sb.append('=');
        sb.append(((this.cStat == null)?"<null>":this.cStat));
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
        result = ((result* 31)+((this.nProt == null)? 0 :this.nProt.hashCode()));
        result = ((result* 31)+((this.digVal == null)? 0 :this.digVal.hashCode()));
        result = ((result* 31)+((this.dhRecbto == null)? 0 :this.dhRecbto.hashCode()));
        result = ((result* 31)+((this.chNFe == null)? 0 :this.chNFe.hashCode()));
        result = ((result* 31)+((this.xMotivo == null)? 0 :this.xMotivo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cStat == null)? 0 :this.cStat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InfProt) == false) {
            return false;
        }
        InfProt rhs = ((InfProt) other);
        return ((((((((this.nProt == rhs.nProt)||((this.nProt!= null)&&this.nProt.equals(rhs.nProt)))&&((this.digVal == rhs.digVal)||((this.digVal!= null)&&this.digVal.equals(rhs.digVal))))&&((this.dhRecbto == rhs.dhRecbto)||((this.dhRecbto!= null)&&this.dhRecbto.equals(rhs.dhRecbto))))&&((this.chNFe == rhs.chNFe)||((this.chNFe!= null)&&this.chNFe.equals(rhs.chNFe))))&&((this.xMotivo == rhs.xMotivo)||((this.xMotivo!= null)&&this.xMotivo.equals(rhs.xMotivo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cStat == rhs.cStat)||((this.cStat!= null)&&this.cStat.equals(rhs.cStat))));
    }

}
