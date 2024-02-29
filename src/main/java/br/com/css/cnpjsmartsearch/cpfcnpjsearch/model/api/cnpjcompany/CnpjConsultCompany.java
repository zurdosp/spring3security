
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.cnpjcompany;

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
    "ni",
    "tipoEstabelecimento",
    "nomeEmpresarial",
    "nomeFantasia",
    "situacaoCadastral",
    "naturezaJuridica",
    "dataAbertura",
    "cnaePrincipal",
    "endereco",
    "municipioJurisdicao",
    "telefones",
    "correioEletronico",
    "capitalSocial",
    "porte",
    "situacaoEspecial",
    "dataSituacaoEspecial",
    "informacoesAdicionais",
    "socios"
})
@Generated("jsonschema2pojo")
public class CnpjConsultCompany {

    @JsonProperty("ni")
    private String ni;
    @JsonProperty("tipoEstabelecimento")
    private String tipoEstabelecimento;
    @JsonProperty("nomeEmpresarial")
    private String nomeEmpresarial;
    @JsonProperty("nomeFantasia")
    private String nomeFantasia;
    @JsonProperty("situacaoCadastral")
    private SituacaoCadastral situacaoCadastral;
    @JsonProperty("naturezaJuridica")
    private NaturezaJuridica naturezaJuridica;
    @JsonProperty("dataAbertura")
    private String dataAbertura;
    @JsonProperty("cnaePrincipal")
    private CnaePrincipal cnaePrincipal;
    @JsonProperty("endereco")
    private Endereco endereco;
    @JsonProperty("municipioJurisdicao")
    private MunicipioJurisdicao municipioJurisdicao;
    @JsonProperty("telefones")
    private List<Telefone> telefones = new ArrayList<Telefone>();
    @JsonProperty("correioEletronico")
    private String correioEletronico;
    @JsonProperty("capitalSocial")
    private Integer capitalSocial;
    @JsonProperty("porte")
    private String porte;
    @JsonProperty("situacaoEspecial")
    private String situacaoEspecial;
    @JsonProperty("dataSituacaoEspecial")
    private String dataSituacaoEspecial;
    @JsonProperty("informacoesAdicionais")
    private InformacoesAdicionais informacoesAdicionais;
    @JsonProperty("socios")
    private List<Socio> socios = new ArrayList<Socio>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ni")
    public String getNi() {
        return ni;
    }

    @JsonProperty("ni")
    public void setNi(String ni) {
        this.ni = ni;
    }

    public CnpjConsultCompany withNi(String ni) {
        this.ni = ni;
        return this;
    }

    @JsonProperty("tipoEstabelecimento")
    public String getTipoEstabelecimento() {
        return tipoEstabelecimento;
    }

    @JsonProperty("tipoEstabelecimento")
    public void setTipoEstabelecimento(String tipoEstabelecimento) {
        this.tipoEstabelecimento = tipoEstabelecimento;
    }

    public CnpjConsultCompany withTipoEstabelecimento(String tipoEstabelecimento) {
        this.tipoEstabelecimento = tipoEstabelecimento;
        return this;
    }

    @JsonProperty("nomeEmpresarial")
    public String getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    @JsonProperty("nomeEmpresarial")
    public void setNomeEmpresarial(String nomeEmpresarial) {
        this.nomeEmpresarial = nomeEmpresarial;
    }

    public CnpjConsultCompany withNomeEmpresarial(String nomeEmpresarial) {
        this.nomeEmpresarial = nomeEmpresarial;
        return this;
    }

    @JsonProperty("nomeFantasia")
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    @JsonProperty("nomeFantasia")
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public CnpjConsultCompany withNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
        return this;
    }

    @JsonProperty("situacaoCadastral")
    public SituacaoCadastral getSituacaoCadastral() {
        return situacaoCadastral;
    }

    @JsonProperty("situacaoCadastral")
    public void setSituacaoCadastral(SituacaoCadastral situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    public CnpjConsultCompany withSituacaoCadastral(SituacaoCadastral situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
        return this;
    }

    @JsonProperty("naturezaJuridica")
    public NaturezaJuridica getNaturezaJuridica() {
        return naturezaJuridica;
    }

    @JsonProperty("naturezaJuridica")
    public void setNaturezaJuridica(NaturezaJuridica naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }

    public CnpjConsultCompany withNaturezaJuridica(NaturezaJuridica naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
        return this;
    }

    @JsonProperty("dataAbertura")
    public String getDataAbertura() {
        return dataAbertura;
    }

    @JsonProperty("dataAbertura")
    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public CnpjConsultCompany withDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
        return this;
    }

    @JsonProperty("cnaePrincipal")
    public CnaePrincipal getCnaePrincipal() {
        return cnaePrincipal;
    }

    @JsonProperty("cnaePrincipal")
    public void setCnaePrincipal(CnaePrincipal cnaePrincipal) {
        this.cnaePrincipal = cnaePrincipal;
    }

    public CnpjConsultCompany withCnaePrincipal(CnaePrincipal cnaePrincipal) {
        this.cnaePrincipal = cnaePrincipal;
        return this;
    }

    @JsonProperty("endereco")
    public Endereco getEndereco() {
        return endereco;
    }

    @JsonProperty("endereco")
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public CnpjConsultCompany withEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    @JsonProperty("municipioJurisdicao")
    public MunicipioJurisdicao getMunicipioJurisdicao() {
        return municipioJurisdicao;
    }

    @JsonProperty("municipioJurisdicao")
    public void setMunicipioJurisdicao(MunicipioJurisdicao municipioJurisdicao) {
        this.municipioJurisdicao = municipioJurisdicao;
    }

    public CnpjConsultCompany withMunicipioJurisdicao(MunicipioJurisdicao municipioJurisdicao) {
        this.municipioJurisdicao = municipioJurisdicao;
        return this;
    }

    @JsonProperty("telefones")
    public List<Telefone> getTelefones() {
        return telefones;
    }

    @JsonProperty("telefones")
    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public CnpjConsultCompany withTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
        return this;
    }

    @JsonProperty("correioEletronico")
    public String getCorreioEletronico() {
        return correioEletronico;
    }

    @JsonProperty("correioEletronico")
    public void setCorreioEletronico(String correioEletronico) {
        this.correioEletronico = correioEletronico;
    }

    public CnpjConsultCompany withCorreioEletronico(String correioEletronico) {
        this.correioEletronico = correioEletronico;
        return this;
    }

    @JsonProperty("capitalSocial")
    public Integer getCapitalSocial() {
        return capitalSocial;
    }

    @JsonProperty("capitalSocial")
    public void setCapitalSocial(Integer capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public CnpjConsultCompany withCapitalSocial(Integer capitalSocial) {
        this.capitalSocial = capitalSocial;
        return this;
    }

    @JsonProperty("porte")
    public String getPorte() {
        return porte;
    }

    @JsonProperty("porte")
    public void setPorte(String porte) {
        this.porte = porte;
    }

    public CnpjConsultCompany withPorte(String porte) {
        this.porte = porte;
        return this;
    }

    @JsonProperty("situacaoEspecial")
    public String getSituacaoEspecial() {
        return situacaoEspecial;
    }

    @JsonProperty("situacaoEspecial")
    public void setSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
    }

    public CnpjConsultCompany withSituacaoEspecial(String situacaoEspecial) {
        this.situacaoEspecial = situacaoEspecial;
        return this;
    }

    @JsonProperty("dataSituacaoEspecial")
    public String getDataSituacaoEspecial() {
        return dataSituacaoEspecial;
    }

    @JsonProperty("dataSituacaoEspecial")
    public void setDataSituacaoEspecial(String dataSituacaoEspecial) {
        this.dataSituacaoEspecial = dataSituacaoEspecial;
    }

    public CnpjConsultCompany withDataSituacaoEspecial(String dataSituacaoEspecial) {
        this.dataSituacaoEspecial = dataSituacaoEspecial;
        return this;
    }

    @JsonProperty("informacoesAdicionais")
    public InformacoesAdicionais getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    @JsonProperty("informacoesAdicionais")
    public void setInformacoesAdicionais(InformacoesAdicionais informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public CnpjConsultCompany withInformacoesAdicionais(InformacoesAdicionais informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
        return this;
    }

    @JsonProperty("socios")
    public List<Socio> getSocios() {
        return socios;
    }

    @JsonProperty("socios")
    public void setSocios(List<Socio> socios) {
        this.socios = socios;
    }

    public CnpjConsultCompany withSocios(List<Socio> socios) {
        this.socios = socios;
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

    public CnpjConsultCompany withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CnpjConsultCompany.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ni");
        sb.append('=');
        sb.append(((this.ni == null)?"<null>":this.ni));
        sb.append(',');
        sb.append("tipoEstabelecimento");
        sb.append('=');
        sb.append(((this.tipoEstabelecimento == null)?"<null>":this.tipoEstabelecimento));
        sb.append(',');
        sb.append("nomeEmpresarial");
        sb.append('=');
        sb.append(((this.nomeEmpresarial == null)?"<null>":this.nomeEmpresarial));
        sb.append(',');
        sb.append("nomeFantasia");
        sb.append('=');
        sb.append(((this.nomeFantasia == null)?"<null>":this.nomeFantasia));
        sb.append(',');
        sb.append("situacaoCadastral");
        sb.append('=');
        sb.append(((this.situacaoCadastral == null)?"<null>":this.situacaoCadastral));
        sb.append(',');
        sb.append("naturezaJuridica");
        sb.append('=');
        sb.append(((this.naturezaJuridica == null)?"<null>":this.naturezaJuridica));
        sb.append(',');
        sb.append("dataAbertura");
        sb.append('=');
        sb.append(((this.dataAbertura == null)?"<null>":this.dataAbertura));
        sb.append(',');
        sb.append("cnaePrincipal");
        sb.append('=');
        sb.append(((this.cnaePrincipal == null)?"<null>":this.cnaePrincipal));
        sb.append(',');
        sb.append("endereco");
        sb.append('=');
        sb.append(((this.endereco == null)?"<null>":this.endereco));
        sb.append(',');
        sb.append("municipioJurisdicao");
        sb.append('=');
        sb.append(((this.municipioJurisdicao == null)?"<null>":this.municipioJurisdicao));
        sb.append(',');
        sb.append("telefones");
        sb.append('=');
        sb.append(((this.telefones == null)?"<null>":this.telefones));
        sb.append(',');
        sb.append("correioEletronico");
        sb.append('=');
        sb.append(((this.correioEletronico == null)?"<null>":this.correioEletronico));
        sb.append(',');
        sb.append("capitalSocial");
        sb.append('=');
        sb.append(((this.capitalSocial == null)?"<null>":this.capitalSocial));
        sb.append(',');
        sb.append("porte");
        sb.append('=');
        sb.append(((this.porte == null)?"<null>":this.porte));
        sb.append(',');
        sb.append("situacaoEspecial");
        sb.append('=');
        sb.append(((this.situacaoEspecial == null)?"<null>":this.situacaoEspecial));
        sb.append(',');
        sb.append("dataSituacaoEspecial");
        sb.append('=');
        sb.append(((this.dataSituacaoEspecial == null)?"<null>":this.dataSituacaoEspecial));
        sb.append(',');
        sb.append("informacoesAdicionais");
        sb.append('=');
        sb.append(((this.informacoesAdicionais == null)?"<null>":this.informacoesAdicionais));
        sb.append(',');
        sb.append("socios");
        sb.append('=');
        sb.append(((this.socios == null)?"<null>":this.socios));
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
        result = ((result* 31)+((this.dataSituacaoEspecial == null)? 0 :this.dataSituacaoEspecial.hashCode()));
        result = ((result* 31)+((this.nomeEmpresarial == null)? 0 :this.nomeEmpresarial.hashCode()));
        result = ((result* 31)+((this.endereco == null)? 0 :this.endereco.hashCode()));
        result = ((result* 31)+((this.situacaoCadastral == null)? 0 :this.situacaoCadastral.hashCode()));
        result = ((result* 31)+((this.informacoesAdicionais == null)? 0 :this.informacoesAdicionais.hashCode()));
        result = ((result* 31)+((this.cnaePrincipal == null)? 0 :this.cnaePrincipal.hashCode()));
        result = ((result* 31)+((this.telefones == null)? 0 :this.telefones.hashCode()));
        result = ((result* 31)+((this.socios == null)? 0 :this.socios.hashCode()));
        result = ((result* 31)+((this.tipoEstabelecimento == null)? 0 :this.tipoEstabelecimento.hashCode()));
        result = ((result* 31)+((this.dataAbertura == null)? 0 :this.dataAbertura.hashCode()));
        result = ((result* 31)+((this.municipioJurisdicao == null)? 0 :this.municipioJurisdicao.hashCode()));
        result = ((result* 31)+((this.nomeFantasia == null)? 0 :this.nomeFantasia.hashCode()));
        result = ((result* 31)+((this.correioEletronico == null)? 0 :this.correioEletronico.hashCode()));
        result = ((result* 31)+((this.naturezaJuridica == null)? 0 :this.naturezaJuridica.hashCode()));
        result = ((result* 31)+((this.porte == null)? 0 :this.porte.hashCode()));
        result = ((result* 31)+((this.situacaoEspecial == null)? 0 :this.situacaoEspecial.hashCode()));
        result = ((result* 31)+((this.ni == null)? 0 :this.ni.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.capitalSocial == null)? 0 :this.capitalSocial.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CnpjConsultCompany) == false) {
            return false;
        }
        CnpjConsultCompany rhs = ((CnpjConsultCompany) other);
        return ((((((((((((((((((((this.dataSituacaoEspecial == rhs.dataSituacaoEspecial)||((this.dataSituacaoEspecial!= null)&&this.dataSituacaoEspecial.equals(rhs.dataSituacaoEspecial)))&&((this.nomeEmpresarial == rhs.nomeEmpresarial)||((this.nomeEmpresarial!= null)&&this.nomeEmpresarial.equals(rhs.nomeEmpresarial))))&&((this.endereco == rhs.endereco)||((this.endereco!= null)&&this.endereco.equals(rhs.endereco))))&&((this.situacaoCadastral == rhs.situacaoCadastral)||((this.situacaoCadastral!= null)&&this.situacaoCadastral.equals(rhs.situacaoCadastral))))&&((this.informacoesAdicionais == rhs.informacoesAdicionais)||((this.informacoesAdicionais!= null)&&this.informacoesAdicionais.equals(rhs.informacoesAdicionais))))&&((this.cnaePrincipal == rhs.cnaePrincipal)||((this.cnaePrincipal!= null)&&this.cnaePrincipal.equals(rhs.cnaePrincipal))))&&((this.telefones == rhs.telefones)||((this.telefones!= null)&&this.telefones.equals(rhs.telefones))))&&((this.socios == rhs.socios)||((this.socios!= null)&&this.socios.equals(rhs.socios))))&&((this.tipoEstabelecimento == rhs.tipoEstabelecimento)||((this.tipoEstabelecimento!= null)&&this.tipoEstabelecimento.equals(rhs.tipoEstabelecimento))))&&((this.dataAbertura == rhs.dataAbertura)||((this.dataAbertura!= null)&&this.dataAbertura.equals(rhs.dataAbertura))))&&((this.municipioJurisdicao == rhs.municipioJurisdicao)||((this.municipioJurisdicao!= null)&&this.municipioJurisdicao.equals(rhs.municipioJurisdicao))))&&((this.nomeFantasia == rhs.nomeFantasia)||((this.nomeFantasia!= null)&&this.nomeFantasia.equals(rhs.nomeFantasia))))&&((this.correioEletronico == rhs.correioEletronico)||((this.correioEletronico!= null)&&this.correioEletronico.equals(rhs.correioEletronico))))&&((this.naturezaJuridica == rhs.naturezaJuridica)||((this.naturezaJuridica!= null)&&this.naturezaJuridica.equals(rhs.naturezaJuridica))))&&((this.porte == rhs.porte)||((this.porte!= null)&&this.porte.equals(rhs.porte))))&&((this.situacaoEspecial == rhs.situacaoEspecial)||((this.situacaoEspecial!= null)&&this.situacaoEspecial.equals(rhs.situacaoEspecial))))&&((this.ni == rhs.ni)||((this.ni!= null)&&this.ni.equals(rhs.ni))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.capitalSocial == rhs.capitalSocial)||((this.capitalSocial!= null)&&this.capitalSocial.equals(rhs.capitalSocial))));
    }

}
