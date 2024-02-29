
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.nf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "infAdic",
    "det",
    "total",
    "cobr",
    "Id",
    "ide",
    "emit",
    "dest",
    "transp"
})
@Generated("jsonschema2pojo")
public class InfNFe {

    @JsonProperty("infAdic")
    private InfAdic infAdic;
    @JsonProperty("det")
    private List<Det> det = new ArrayList<Det>();
    @JsonProperty("total")
    private Total total;
    @JsonProperty("cobr")
    private Cobr cobr;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("ide")
    private Ide ide;
    @JsonProperty("emit")
    private Emit emit;
    @JsonProperty("dest")
    private Dest dest;
    @JsonProperty("transp")
    private Transp transp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("infAdic")
    public InfAdic getInfAdic() {
        return infAdic;
    }

    @JsonProperty("infAdic")
    public void setInfAdic(InfAdic infAdic) {
        this.infAdic = infAdic;
    }

    public InfNFe withInfAdic(InfAdic infAdic) {
        this.infAdic = infAdic;
        return this;
    }

    @JsonProperty("det")
    public List<Det> getDet() {
        return det;
    }

    @JsonProperty("det")
    public void setDet(List<Det> det) {
        this.det = det;
    }

    public InfNFe withDet(List<Det> det) {
        this.det = det;
        return this;
    }

    @JsonProperty("total")
    public Total getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Total total) {
        this.total = total;
    }

    public InfNFe withTotal(Total total) {
        this.total = total;
        return this;
    }

    @JsonProperty("cobr")
    public Cobr getCobr() {
        return cobr;
    }

    @JsonProperty("cobr")
    public void setCobr(Cobr cobr) {
        this.cobr = cobr;
    }

    public InfNFe withCobr(Cobr cobr) {
        this.cobr = cobr;
        return this;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    public InfNFe withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("ide")
    public Ide getIde() {
        return ide;
    }

    @JsonProperty("ide")
    public void setIde(Ide ide) {
        this.ide = ide;
    }

    public InfNFe withIde(Ide ide) {
        this.ide = ide;
        return this;
    }

    @JsonProperty("emit")
    public Emit getEmit() {
        return emit;
    }

    @JsonProperty("emit")
    public void setEmit(Emit emit) {
        this.emit = emit;
    }

    public InfNFe withEmit(Emit emit) {
        this.emit = emit;
        return this;
    }

    @JsonProperty("dest")
    public Dest getDest() {
        return dest;
    }

    @JsonProperty("dest")
    public void setDest(Dest dest) {
        this.dest = dest;
    }

    public InfNFe withDest(Dest dest) {
        this.dest = dest;
        return this;
    }

    @JsonProperty("transp")
    public Transp getTransp() {
        return transp;
    }

    @JsonProperty("transp")
    public void setTransp(Transp transp) {
        this.transp = transp;
    }

    public InfNFe withTransp(Transp transp) {
        this.transp = transp;
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

    public InfNFe withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InfNFe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("infAdic");
        sb.append('=');
        sb.append(((this.infAdic == null)?"<null>":this.infAdic));
        sb.append(',');
        sb.append("det");
        sb.append('=');
        sb.append(((this.det == null)?"<null>":this.det));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("cobr");
        sb.append('=');
        sb.append(((this.cobr == null)?"<null>":this.cobr));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ide");
        sb.append('=');
        sb.append(((this.ide == null)?"<null>":this.ide));
        sb.append(',');
        sb.append("emit");
        sb.append('=');
        sb.append(((this.emit == null)?"<null>":this.emit));
        sb.append(',');
        sb.append("dest");
        sb.append('=');
        sb.append(((this.dest == null)?"<null>":this.dest));
        sb.append(',');
        sb.append("transp");
        sb.append('=');
        sb.append(((this.transp == null)?"<null>":this.transp));
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
        result = ((result* 31)+((this.infAdic == null)? 0 :this.infAdic.hashCode()));
        result = ((result* 31)+((this.det == null)? 0 :this.det.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.cobr == null)? 0 :this.cobr.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.ide == null)? 0 :this.ide.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.emit == null)? 0 :this.emit.hashCode()));
        result = ((result* 31)+((this.dest == null)? 0 :this.dest.hashCode()));
        result = ((result* 31)+((this.transp == null)? 0 :this.transp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InfNFe) == false) {
            return false;
        }
        InfNFe rhs = ((InfNFe) other);
        return (((((((((((this.infAdic == rhs.infAdic)||((this.infAdic!= null)&&this.infAdic.equals(rhs.infAdic)))&&((this.det == rhs.det)||((this.det!= null)&&this.det.equals(rhs.det))))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.cobr == rhs.cobr)||((this.cobr!= null)&&this.cobr.equals(rhs.cobr))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.ide == rhs.ide)||((this.ide!= null)&&this.ide.equals(rhs.ide))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.emit == rhs.emit)||((this.emit!= null)&&this.emit.equals(rhs.emit))))&&((this.dest == rhs.dest)||((this.dest!= null)&&this.dest.equals(rhs.dest))))&&((this.transp == rhs.transp)||((this.transp!= null)&&this.transp.equals(rhs.transp))));
    }

}
