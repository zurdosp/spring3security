
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
    "tpNF",
    "mod",
    "indPres",
    "tpImp",
    "nNF",
    "cMunFG",
    "procEmi",
    "finNFe",
    "dhEmi",
    "tpAmb",
    "indFinal",
    "idDest",
    "tpEmis",
    "cDV",
    "cUF",
    "serie",
    "natOp",
    "cNF",
    "verProc",
    "indPag"
})
@Generated("jsonschema2pojo")
public class Ide {

    @JsonProperty("tpNF")
    private Integer tpNF;
    @JsonProperty("mod")
    private Integer mod;
    @JsonProperty("indPres")
    private Integer indPres;
    @JsonProperty("tpImp")
    private Integer tpImp;
    @JsonProperty("nNF")
    private Integer nNF;
    @JsonProperty("cMunFG")
    private Integer cMunFG;
    @JsonProperty("procEmi")
    private Integer procEmi;
    @JsonProperty("finNFe")
    private Integer finNFe;
    @JsonProperty("dhEmi")
    private String dhEmi;
    @JsonProperty("tpAmb")
    private Integer tpAmb;
    @JsonProperty("indFinal")
    private Integer indFinal;
    @JsonProperty("idDest")
    private Integer idDest;
    @JsonProperty("tpEmis")
    private Integer tpEmis;
    @JsonProperty("cDV")
    private Integer cDV;
    @JsonProperty("cUF")
    private Integer cUF;
    @JsonProperty("serie")
    private Integer serie;
    @JsonProperty("natOp")
    private String natOp;
    @JsonProperty("cNF")
    private String cNF;
    @JsonProperty("verProc")
    private String verProc;
    @JsonProperty("indPag")
    private Integer indPag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tpNF")
    public Integer getTpNF() {
        return tpNF;
    }

    @JsonProperty("tpNF")
    public void setTpNF(Integer tpNF) {
        this.tpNF = tpNF;
    }

    public Ide withTpNF(Integer tpNF) {
        this.tpNF = tpNF;
        return this;
    }

    @JsonProperty("mod")
    public Integer getMod() {
        return mod;
    }

    @JsonProperty("mod")
    public void setMod(Integer mod) {
        this.mod = mod;
    }

    public Ide withMod(Integer mod) {
        this.mod = mod;
        return this;
    }

    @JsonProperty("indPres")
    public Integer getIndPres() {
        return indPres;
    }

    @JsonProperty("indPres")
    public void setIndPres(Integer indPres) {
        this.indPres = indPres;
    }

    public Ide withIndPres(Integer indPres) {
        this.indPres = indPres;
        return this;
    }

    @JsonProperty("tpImp")
    public Integer getTpImp() {
        return tpImp;
    }

    @JsonProperty("tpImp")
    public void setTpImp(Integer tpImp) {
        this.tpImp = tpImp;
    }

    public Ide withTpImp(Integer tpImp) {
        this.tpImp = tpImp;
        return this;
    }

    @JsonProperty("nNF")
    public Integer getnNF() {
        return nNF;
    }

    @JsonProperty("nNF")
    public void setnNF(Integer nNF) {
        this.nNF = nNF;
    }

    public Ide withnNF(Integer nNF) {
        this.nNF = nNF;
        return this;
    }

    @JsonProperty("cMunFG")
    public Integer getcMunFG() {
        return cMunFG;
    }

    @JsonProperty("cMunFG")
    public void setcMunFG(Integer cMunFG) {
        this.cMunFG = cMunFG;
    }

    public Ide withcMunFG(Integer cMunFG) {
        this.cMunFG = cMunFG;
        return this;
    }

    @JsonProperty("procEmi")
    public Integer getProcEmi() {
        return procEmi;
    }

    @JsonProperty("procEmi")
    public void setProcEmi(Integer procEmi) {
        this.procEmi = procEmi;
    }

    public Ide withProcEmi(Integer procEmi) {
        this.procEmi = procEmi;
        return this;
    }

    @JsonProperty("finNFe")
    public Integer getFinNFe() {
        return finNFe;
    }

    @JsonProperty("finNFe")
    public void setFinNFe(Integer finNFe) {
        this.finNFe = finNFe;
    }

    public Ide withFinNFe(Integer finNFe) {
        this.finNFe = finNFe;
        return this;
    }

    @JsonProperty("dhEmi")
    public String getDhEmi() {
        return dhEmi;
    }

    @JsonProperty("dhEmi")
    public void setDhEmi(String dhEmi) {
        this.dhEmi = dhEmi;
    }

    public Ide withDhEmi(String dhEmi) {
        this.dhEmi = dhEmi;
        return this;
    }

    @JsonProperty("tpAmb")
    public Integer getTpAmb() {
        return tpAmb;
    }

    @JsonProperty("tpAmb")
    public void setTpAmb(Integer tpAmb) {
        this.tpAmb = tpAmb;
    }

    public Ide withTpAmb(Integer tpAmb) {
        this.tpAmb = tpAmb;
        return this;
    }

    @JsonProperty("indFinal")
    public Integer getIndFinal() {
        return indFinal;
    }

    @JsonProperty("indFinal")
    public void setIndFinal(Integer indFinal) {
        this.indFinal = indFinal;
    }

    public Ide withIndFinal(Integer indFinal) {
        this.indFinal = indFinal;
        return this;
    }

    @JsonProperty("idDest")
    public Integer getIdDest() {
        return idDest;
    }

    @JsonProperty("idDest")
    public void setIdDest(Integer idDest) {
        this.idDest = idDest;
    }

    public Ide withIdDest(Integer idDest) {
        this.idDest = idDest;
        return this;
    }

    @JsonProperty("tpEmis")
    public Integer getTpEmis() {
        return tpEmis;
    }

    @JsonProperty("tpEmis")
    public void setTpEmis(Integer tpEmis) {
        this.tpEmis = tpEmis;
    }

    public Ide withTpEmis(Integer tpEmis) {
        this.tpEmis = tpEmis;
        return this;
    }

    @JsonProperty("cDV")
    public Integer getcDV() {
        return cDV;
    }

    @JsonProperty("cDV")
    public void setcDV(Integer cDV) {
        this.cDV = cDV;
    }

    public Ide withcDV(Integer cDV) {
        this.cDV = cDV;
        return this;
    }

    @JsonProperty("cUF")
    public Integer getcUF() {
        return cUF;
    }

    @JsonProperty("cUF")
    public void setcUF(Integer cUF) {
        this.cUF = cUF;
    }

    public Ide withcUF(Integer cUF) {
        this.cUF = cUF;
        return this;
    }

    @JsonProperty("serie")
    public Integer getSerie() {
        return serie;
    }

    @JsonProperty("serie")
    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Ide withSerie(Integer serie) {
        this.serie = serie;
        return this;
    }

    @JsonProperty("natOp")
    public String getNatOp() {
        return natOp;
    }

    @JsonProperty("natOp")
    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    public Ide withNatOp(String natOp) {
        this.natOp = natOp;
        return this;
    }

    @JsonProperty("cNF")
    public String getcNF() {
        return cNF;
    }

    @JsonProperty("cNF")
    public void setcNF(String cNF) {
        this.cNF = cNF;
    }

    public Ide withcNF(String cNF) {
        this.cNF = cNF;
        return this;
    }

    @JsonProperty("verProc")
    public String getVerProc() {
        return verProc;
    }

    @JsonProperty("verProc")
    public void setVerProc(String verProc) {
        this.verProc = verProc;
    }

    public Ide withVerProc(String verProc) {
        this.verProc = verProc;
        return this;
    }

    @JsonProperty("indPag")
    public Integer getIndPag() {
        return indPag;
    }

    @JsonProperty("indPag")
    public void setIndPag(Integer indPag) {
        this.indPag = indPag;
    }

    public Ide withIndPag(Integer indPag) {
        this.indPag = indPag;
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

    public Ide withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ide.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tpNF");
        sb.append('=');
        sb.append(((this.tpNF == null)?"<null>":this.tpNF));
        sb.append(',');
        sb.append("mod");
        sb.append('=');
        sb.append(((this.mod == null)?"<null>":this.mod));
        sb.append(',');
        sb.append("indPres");
        sb.append('=');
        sb.append(((this.indPres == null)?"<null>":this.indPres));
        sb.append(',');
        sb.append("tpImp");
        sb.append('=');
        sb.append(((this.tpImp == null)?"<null>":this.tpImp));
        sb.append(',');
        sb.append("nNF");
        sb.append('=');
        sb.append(((this.nNF == null)?"<null>":this.nNF));
        sb.append(',');
        sb.append("cMunFG");
        sb.append('=');
        sb.append(((this.cMunFG == null)?"<null>":this.cMunFG));
        sb.append(',');
        sb.append("procEmi");
        sb.append('=');
        sb.append(((this.procEmi == null)?"<null>":this.procEmi));
        sb.append(',');
        sb.append("finNFe");
        sb.append('=');
        sb.append(((this.finNFe == null)?"<null>":this.finNFe));
        sb.append(',');
        sb.append("dhEmi");
        sb.append('=');
        sb.append(((this.dhEmi == null)?"<null>":this.dhEmi));
        sb.append(',');
        sb.append("tpAmb");
        sb.append('=');
        sb.append(((this.tpAmb == null)?"<null>":this.tpAmb));
        sb.append(',');
        sb.append("indFinal");
        sb.append('=');
        sb.append(((this.indFinal == null)?"<null>":this.indFinal));
        sb.append(',');
        sb.append("idDest");
        sb.append('=');
        sb.append(((this.idDest == null)?"<null>":this.idDest));
        sb.append(',');
        sb.append("tpEmis");
        sb.append('=');
        sb.append(((this.tpEmis == null)?"<null>":this.tpEmis));
        sb.append(',');
        sb.append("cDV");
        sb.append('=');
        sb.append(((this.cDV == null)?"<null>":this.cDV));
        sb.append(',');
        sb.append("cUF");
        sb.append('=');
        sb.append(((this.cUF == null)?"<null>":this.cUF));
        sb.append(',');
        sb.append("serie");
        sb.append('=');
        sb.append(((this.serie == null)?"<null>":this.serie));
        sb.append(',');
        sb.append("natOp");
        sb.append('=');
        sb.append(((this.natOp == null)?"<null>":this.natOp));
        sb.append(',');
        sb.append("cNF");
        sb.append('=');
        sb.append(((this.cNF == null)?"<null>":this.cNF));
        sb.append(',');
        sb.append("verProc");
        sb.append('=');
        sb.append(((this.verProc == null)?"<null>":this.verProc));
        sb.append(',');
        sb.append("indPag");
        sb.append('=');
        sb.append(((this.indPag == null)?"<null>":this.indPag));
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
        result = ((result* 31)+((this.tpNF == null)? 0 :this.tpNF.hashCode()));
        result = ((result* 31)+((this.mod == null)? 0 :this.mod.hashCode()));
        result = ((result* 31)+((this.indPres == null)? 0 :this.indPres.hashCode()));
        result = ((result* 31)+((this.tpImp == null)? 0 :this.tpImp.hashCode()));
        result = ((result* 31)+((this.nNF == null)? 0 :this.nNF.hashCode()));
        result = ((result* 31)+((this.cMunFG == null)? 0 :this.cMunFG.hashCode()));
        result = ((result* 31)+((this.procEmi == null)? 0 :this.procEmi.hashCode()));
        result = ((result* 31)+((this.finNFe == null)? 0 :this.finNFe.hashCode()));
        result = ((result* 31)+((this.dhEmi == null)? 0 :this.dhEmi.hashCode()));
        result = ((result* 31)+((this.tpAmb == null)? 0 :this.tpAmb.hashCode()));
        result = ((result* 31)+((this.indFinal == null)? 0 :this.indFinal.hashCode()));
        result = ((result* 31)+((this.idDest == null)? 0 :this.idDest.hashCode()));
        result = ((result* 31)+((this.tpEmis == null)? 0 :this.tpEmis.hashCode()));
        result = ((result* 31)+((this.cDV == null)? 0 :this.cDV.hashCode()));
        result = ((result* 31)+((this.cUF == null)? 0 :this.cUF.hashCode()));
        result = ((result* 31)+((this.serie == null)? 0 :this.serie.hashCode()));
        result = ((result* 31)+((this.natOp == null)? 0 :this.natOp.hashCode()));
        result = ((result* 31)+((this.cNF == null)? 0 :this.cNF.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.verProc == null)? 0 :this.verProc.hashCode()));
        result = ((result* 31)+((this.indPag == null)? 0 :this.indPag.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ide) == false) {
            return false;
        }
        Ide rhs = ((Ide) other);
        return ((((((((((((((((((((((this.tpNF == rhs.tpNF)||((this.tpNF!= null)&&this.tpNF.equals(rhs.tpNF)))&&((this.mod == rhs.mod)||((this.mod!= null)&&this.mod.equals(rhs.mod))))&&((this.indPres == rhs.indPres)||((this.indPres!= null)&&this.indPres.equals(rhs.indPres))))&&((this.tpImp == rhs.tpImp)||((this.tpImp!= null)&&this.tpImp.equals(rhs.tpImp))))&&((this.nNF == rhs.nNF)||((this.nNF!= null)&&this.nNF.equals(rhs.nNF))))&&((this.cMunFG == rhs.cMunFG)||((this.cMunFG!= null)&&this.cMunFG.equals(rhs.cMunFG))))&&((this.procEmi == rhs.procEmi)||((this.procEmi!= null)&&this.procEmi.equals(rhs.procEmi))))&&((this.finNFe == rhs.finNFe)||((this.finNFe!= null)&&this.finNFe.equals(rhs.finNFe))))&&((this.dhEmi == rhs.dhEmi)||((this.dhEmi!= null)&&this.dhEmi.equals(rhs.dhEmi))))&&((this.tpAmb == rhs.tpAmb)||((this.tpAmb!= null)&&this.tpAmb.equals(rhs.tpAmb))))&&((this.indFinal == rhs.indFinal)||((this.indFinal!= null)&&this.indFinal.equals(rhs.indFinal))))&&((this.idDest == rhs.idDest)||((this.idDest!= null)&&this.idDest.equals(rhs.idDest))))&&((this.tpEmis == rhs.tpEmis)||((this.tpEmis!= null)&&this.tpEmis.equals(rhs.tpEmis))))&&((this.cDV == rhs.cDV)||((this.cDV!= null)&&this.cDV.equals(rhs.cDV))))&&((this.cUF == rhs.cUF)||((this.cUF!= null)&&this.cUF.equals(rhs.cUF))))&&((this.serie == rhs.serie)||((this.serie!= null)&&this.serie.equals(rhs.serie))))&&((this.natOp == rhs.natOp)||((this.natOp!= null)&&this.natOp.equals(rhs.natOp))))&&((this.cNF == rhs.cNF)||((this.cNF!= null)&&this.cNF.equals(rhs.cNF))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.verProc == rhs.verProc)||((this.verProc!= null)&&this.verProc.equals(rhs.verProc))))&&((this.indPag == rhs.indPag)||((this.indPag!= null)&&this.indPag.equals(rhs.indPag))));
    }

}
