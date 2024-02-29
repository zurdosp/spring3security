
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.smartdatacnpj;

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

import br.com.css.cnpjsmartsearch.global.ParentModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"id",
    "razao_social",
    "cnpj",
    "natureza_juridica",
    "qualificacao_responsavel",
    "capital_social",
    "porte_empresa",
    "ente_federativo_responsavel",
    "identificador_matriz_filial",
    "nome_fantasia",
    "situacao_cadastral",
    "data_situacao_cadastral",
    "motivo_situacao_cadastral",
    "nome_cidade_exterior",
    "pais",
    "data_inicio_atividade",
    "cnaes",
    "addresses",
    "phones",
    "e-mail"
})
@Generated("jsonschema2pojo")
public class SmartdataCnpj extends ParentModel {
    
    @JsonProperty("razao_social")
    private String razaoSocial;
    @JsonProperty("cnpj")
    private String cnpj;
    @JsonProperty("natureza_juridica")
    private String naturezaJuridica;
    @JsonProperty("qualificacao_responsavel")
    private String qualificacaoResponsavel;
    @JsonProperty("capital_social")
    private String capitalSocial;
    @JsonProperty("porte_empresa")
    private String porteEmpresa;
    @JsonProperty("ente_federativo_responsavel")
    private String enteFederativoResponsavel;
    @JsonProperty("identificador_matriz_filial")
    private String identificadorMatrizFilial;
    @JsonProperty("nome_fantasia")
    private String nomeFantasia;
    @JsonProperty("situacao_cadastral")
    private String situacaoCadastral;
    @JsonProperty("data_situacao_cadastral")
    private String dataSituacaoCadastral;
    @JsonProperty("motivo_situacao_cadastral")
    private String motivoSituacaoCadastral;
    @JsonProperty("nome_cidade_exterior")
    private String nomeCidadeExterior;
    @JsonProperty("pais")
    private String pais;
    @JsonProperty("data_inicio_atividade")
    private String dataInicioAtividade;
    @JsonProperty("cnaes")
    private List<Cnae> cnaes = new ArrayList<Cnae>();
    @JsonProperty("addresses")
    private List<Address> addresses = new ArrayList<Address>();
    @JsonProperty("phones")
    private List<Phone> phones = new ArrayList<Phone>();
    @JsonProperty("e-mail")
    private String eMail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
	@JsonProperty("cnpj")
    public String getCnpj() {
		return cnpj;
	}

	@JsonProperty("cnpj")
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@JsonProperty("razao_social")
    public String getRazaoSocial() {
        return razaoSocial;
    }

    @JsonProperty("razao_social")
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public SmartdataCnpj withRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    @JsonProperty("natureza_juridica")
    public String getNaturezaJuridica() {
        return naturezaJuridica;
    }

    @JsonProperty("natureza_juridica")
    public void setNaturezaJuridica(String naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
    }

    public SmartdataCnpj withNaturezaJuridica(String naturezaJuridica) {
        this.naturezaJuridica = naturezaJuridica;
        return this;
    }

    @JsonProperty("qualificacao_responsavel")
    public String getQualificacaoResponsavel() {
        return qualificacaoResponsavel;
    }

    @JsonProperty("qualificacao_responsavel")
    public void setQualificacaoResponsavel(String qualificacaoResponsavel) {
        this.qualificacaoResponsavel = qualificacaoResponsavel;
    }

    public SmartdataCnpj withQualificacaoResponsavel(String qualificacaoResponsavel) {
        this.qualificacaoResponsavel = qualificacaoResponsavel;
        return this;
    }

    @JsonProperty("capital_social")
    public String getCapitalSocial() {
        return capitalSocial;
    }

    @JsonProperty("capital_social")
    public void setCapitalSocial(String capitalSocial) {
        this.capitalSocial = capitalSocial;
    }

    public SmartdataCnpj withCapitalSocial(String capitalSocial) {
        this.capitalSocial = capitalSocial;
        return this;
    }

    @JsonProperty("porte_empresa")
    public String getPorteEmpresa() {
        return porteEmpresa;
    }

    @JsonProperty("porte_empresa")
    public void setPorteEmpresa(String porteEmpresa) {
        this.porteEmpresa = porteEmpresa;
    }

    public SmartdataCnpj withPorteEmpresa(String porteEmpresa) {
        this.porteEmpresa = porteEmpresa;
        return this;
    }

    @JsonProperty("ente_federativo_responsavel")
    public String getEnteFederativoResponsavel() {
        return enteFederativoResponsavel;
    }

    @JsonProperty("ente_federativo_responsavel")
    public void setEnteFederativoResponsavel(String enteFederativoResponsavel) {
        this.enteFederativoResponsavel = enteFederativoResponsavel;
    }

    public SmartdataCnpj withEnteFederativoResponsavel(String enteFederativoResponsavel) {
        this.enteFederativoResponsavel = enteFederativoResponsavel;
        return this;
    }

    @JsonProperty("identificador_matriz_filial")
    public String getIdentificadorMatrizFilial() {
        return identificadorMatrizFilial;
    }

    @JsonProperty("identificador_matriz_filial")
    public void setIdentificadorMatrizFilial(String identificadorMatrizFilial) {
        this.identificadorMatrizFilial = identificadorMatrizFilial;
    }

    public SmartdataCnpj withIdentificadorMatrizFilial(String identificadorMatrizFilial) {
        this.identificadorMatrizFilial = identificadorMatrizFilial;
        return this;
    }

    @JsonProperty("nome_fantasia")
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    @JsonProperty("nome_fantasia")
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public SmartdataCnpj withNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
        return this;
    }

    @JsonProperty("situacao_cadastral")
    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }

    @JsonProperty("situacao_cadastral")
    public void setSituacaoCadastral(String situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    public SmartdataCnpj withSituacaoCadastral(String situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
        return this;
    }

    @JsonProperty("data_situacao_cadastral")
    public String getDataSituacaoCadastral() {
        return dataSituacaoCadastral;
    }

    @JsonProperty("data_situacao_cadastral")
    public void setDataSituacaoCadastral(String dataSituacaoCadastral) {
        this.dataSituacaoCadastral = dataSituacaoCadastral;
    }

    public SmartdataCnpj withDataSituacaoCadastral(String dataSituacaoCadastral) {
        this.dataSituacaoCadastral = dataSituacaoCadastral;
        return this;
    }

    @JsonProperty("motivo_situacao_cadastral")
    public String getMotivoSituacaoCadastral() {
        return motivoSituacaoCadastral;
    }

    @JsonProperty("motivo_situacao_cadastral")
    public void setMotivoSituacaoCadastral(String motivoSituacaoCadastral) {
        this.motivoSituacaoCadastral = motivoSituacaoCadastral;
    }

    public SmartdataCnpj withMotivoSituacaoCadastral(String motivoSituacaoCadastral) {
        this.motivoSituacaoCadastral = motivoSituacaoCadastral;
        return this;
    }

    @JsonProperty("nome_cidade_exterior")
    public String getNomeCidadeExterior() {
        return nomeCidadeExterior;
    }

    @JsonProperty("nome_cidade_exterior")
    public void setNomeCidadeExterior(String nomeCidadeExterior) {
        this.nomeCidadeExterior = nomeCidadeExterior;
    }

    public SmartdataCnpj withNomeCidadeExterior(String nomeCidadeExterior) {
        this.nomeCidadeExterior = nomeCidadeExterior;
        return this;
    }

    @JsonProperty("pais")
    public String getPais() {
        return pais;
    }

    @JsonProperty("pais")
    public void setPais(String pais) {
        this.pais = pais;
    }

    public SmartdataCnpj withPais(String pais) {
        this.pais = pais;
        return this;
    }

    @JsonProperty("data_inicio_atividade")
    public String getDataInicioAtividade() {
        return dataInicioAtividade;
    }

    @JsonProperty("data_inicio_atividade")
    public void setDataInicioAtividade(String dataInicioAtividade) {
        this.dataInicioAtividade = dataInicioAtividade;
    }

    public SmartdataCnpj withDataInicioAtividade(String dataInicioAtividade) {
        this.dataInicioAtividade = dataInicioAtividade;
        return this;
    }

    @JsonProperty("cnaes")
    public List<Cnae> getCnaes() {
        return cnaes;
    }

    @JsonProperty("cnaes")
    public void setCnaes(List<Cnae> cnaes) {
        this.cnaes = cnaes;
    }

    public SmartdataCnpj withCnaes(List<Cnae> cnaes) {
        this.cnaes = cnaes;
        return this;
    }

    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public SmartdataCnpj withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public SmartdataCnpj withPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    @JsonProperty("e-mail")
    public String geteMail() {
        return eMail;
    }

    @JsonProperty("e-mail")
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public SmartdataCnpj witheMail(String eMail) {
        this.eMail = eMail;
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

    public SmartdataCnpj withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SmartdataCnpj.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("razaoSocial");
        sb.append('=');
        sb.append(((this.razaoSocial == null)?"<null>":this.razaoSocial));
        sb.append(',');
        sb.append("naturezaJuridica");
        sb.append('=');
        sb.append(((this.naturezaJuridica == null)?"<null>":this.naturezaJuridica));
        sb.append(',');
        sb.append("qualificacaoResponsavel");
        sb.append('=');
        sb.append(((this.qualificacaoResponsavel == null)?"<null>":this.qualificacaoResponsavel));
        sb.append(',');
        sb.append("capitalSocial");
        sb.append('=');
        sb.append(((this.capitalSocial == null)?"<null>":this.capitalSocial));
        sb.append(',');
        sb.append("porteEmpresa");
        sb.append('=');
        sb.append(((this.porteEmpresa == null)?"<null>":this.porteEmpresa));
        sb.append(',');
        sb.append("enteFederativoResponsavel");
        sb.append('=');
        sb.append(((this.enteFederativoResponsavel == null)?"<null>":this.enteFederativoResponsavel));
        sb.append(',');
        sb.append("identificadorMatrizFilial");
        sb.append('=');
        sb.append(((this.identificadorMatrizFilial == null)?"<null>":this.identificadorMatrizFilial));
        sb.append(',');
        sb.append("nomeFantasia");
        sb.append('=');
        sb.append(((this.nomeFantasia == null)?"<null>":this.nomeFantasia));
        sb.append(',');
        sb.append("situacaoCadastral");
        sb.append('=');
        sb.append(((this.situacaoCadastral == null)?"<null>":this.situacaoCadastral));
        sb.append(',');
        sb.append("dataSituacaoCadastral");
        sb.append('=');
        sb.append(((this.dataSituacaoCadastral == null)?"<null>":this.dataSituacaoCadastral));
        sb.append(',');
        sb.append("motivoSituacaoCadastral");
        sb.append('=');
        sb.append(((this.motivoSituacaoCadastral == null)?"<null>":this.motivoSituacaoCadastral));
        sb.append(',');
        sb.append("nomeCidadeExterior");
        sb.append('=');
        sb.append(((this.nomeCidadeExterior == null)?"<null>":this.nomeCidadeExterior));
        sb.append(',');
        sb.append("pais");
        sb.append('=');
        sb.append(((this.pais == null)?"<null>":this.pais));
        sb.append(',');
        sb.append("dataInicioAtividade");
        sb.append('=');
        sb.append(((this.dataInicioAtividade == null)?"<null>":this.dataInicioAtividade));
        sb.append(',');
        sb.append("cnaes");
        sb.append('=');
        sb.append(((this.cnaes == null)?"<null>":this.cnaes));
        sb.append(',');
        sb.append("addresses");
        sb.append('=');
        sb.append(((this.addresses == null)?"<null>":this.addresses));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("eMail");
        sb.append('=');
        sb.append(((this.eMail == null)?"<null>":this.eMail));
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
        result = ((result* 31)+((this.dataSituacaoCadastral == null)? 0 :this.dataSituacaoCadastral.hashCode()));
        result = ((result* 31)+((this.cnaes == null)? 0 :this.cnaes.hashCode()));
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.situacaoCadastral == null)? 0 :this.situacaoCadastral.hashCode()));
        result = ((result* 31)+((this.nomeCidadeExterior == null)? 0 :this.nomeCidadeExterior.hashCode()));
        result = ((result* 31)+((this.enteFederativoResponsavel == null)? 0 :this.enteFederativoResponsavel.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.pais == null)? 0 :this.pais.hashCode()));
        result = ((result* 31)+((this.eMail == null)? 0 :this.eMail.hashCode()));
        result = ((result* 31)+((this.motivoSituacaoCadastral == null)? 0 :this.motivoSituacaoCadastral.hashCode()));
        result = ((result* 31)+((this.nomeFantasia == null)? 0 :this.nomeFantasia.hashCode()));
        result = ((result* 31)+((this.naturezaJuridica == null)? 0 :this.naturezaJuridica.hashCode()));
        result = ((result* 31)+((this.dataInicioAtividade == null)? 0 :this.dataInicioAtividade.hashCode()));
        result = ((result* 31)+((this.porteEmpresa == null)? 0 :this.porteEmpresa.hashCode()));
        result = ((result* 31)+((this.identificadorMatrizFilial == null)? 0 :this.identificadorMatrizFilial.hashCode()));
        result = ((result* 31)+((this.qualificacaoResponsavel == null)? 0 :this.qualificacaoResponsavel.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.razaoSocial == null)? 0 :this.razaoSocial.hashCode()));
        result = ((result* 31)+((this.capitalSocial == null)? 0 :this.capitalSocial.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SmartdataCnpj) == false) {
            return false;
        }
        SmartdataCnpj rhs = ((SmartdataCnpj) other);
        return ((((((((((((((((((((this.dataSituacaoCadastral == rhs.dataSituacaoCadastral)||((this.dataSituacaoCadastral!= null)&&this.dataSituacaoCadastral.equals(rhs.dataSituacaoCadastral)))&&((this.cnaes == rhs.cnaes)||((this.cnaes!= null)&&this.cnaes.equals(rhs.cnaes))))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.situacaoCadastral == rhs.situacaoCadastral)||((this.situacaoCadastral!= null)&&this.situacaoCadastral.equals(rhs.situacaoCadastral))))&&((this.nomeCidadeExterior == rhs.nomeCidadeExterior)||((this.nomeCidadeExterior!= null)&&this.nomeCidadeExterior.equals(rhs.nomeCidadeExterior))))&&((this.enteFederativoResponsavel == rhs.enteFederativoResponsavel)||((this.enteFederativoResponsavel!= null)&&this.enteFederativoResponsavel.equals(rhs.enteFederativoResponsavel))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.pais == rhs.pais)||((this.pais!= null)&&this.pais.equals(rhs.pais))))&&((this.eMail == rhs.eMail)||((this.eMail!= null)&&this.eMail.equals(rhs.eMail))))&&((this.motivoSituacaoCadastral == rhs.motivoSituacaoCadastral)||((this.motivoSituacaoCadastral!= null)&&this.motivoSituacaoCadastral.equals(rhs.motivoSituacaoCadastral))))&&((this.nomeFantasia == rhs.nomeFantasia)||((this.nomeFantasia!= null)&&this.nomeFantasia.equals(rhs.nomeFantasia))))&&((this.naturezaJuridica == rhs.naturezaJuridica)||((this.naturezaJuridica!= null)&&this.naturezaJuridica.equals(rhs.naturezaJuridica))))&&((this.dataInicioAtividade == rhs.dataInicioAtividade)||((this.dataInicioAtividade!= null)&&this.dataInicioAtividade.equals(rhs.dataInicioAtividade))))&&((this.porteEmpresa == rhs.porteEmpresa)||((this.porteEmpresa!= null)&&this.porteEmpresa.equals(rhs.porteEmpresa))))&&((this.identificadorMatrizFilial == rhs.identificadorMatrizFilial)||((this.identificadorMatrizFilial!= null)&&this.identificadorMatrizFilial.equals(rhs.identificadorMatrizFilial))))&&((this.qualificacaoResponsavel == rhs.qualificacaoResponsavel)||((this.qualificacaoResponsavel!= null)&&this.qualificacaoResponsavel.equals(rhs.qualificacaoResponsavel))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.razaoSocial == rhs.razaoSocial)||((this.razaoSocial!= null)&&this.razaoSocial.equals(rhs.razaoSocial))))&&((this.capitalSocial == rhs.capitalSocial)||((this.capitalSocial!= null)&&this.capitalSocial.equals(rhs.capitalSocial))));
    }

}
