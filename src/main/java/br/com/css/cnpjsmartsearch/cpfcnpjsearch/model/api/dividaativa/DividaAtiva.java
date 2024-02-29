
package br.com.css.cnpjsmartsearch.cpfcnpjsearch.model.api.dividaativa;

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
    "inscricao",
    "processoAdministrativo",
    "situacao",
    "dataInscricao",
    "numeroPFNResponsavel",
    "nomePFNResponsavel",
    "numeroPFNInscricao",
    "nomePFNInscricao",
    "numeroProcessoJudicial",
    "numeroProcessoJudicialNovo",
    "orgaoOrigem",
    "codigoNaturezaReceita",
    "nomeNaturezaReceita",
    "codigoReceitaPrincipal",
    "nomeReceita",
    "codigoSerie",
    "nomeSerie",
    "codigoOrgaoJustica",
    "nomeOrgaoJustica",
    "numeroJuizo",
    "descricaoJuizo",
    "dataProtocoloJudExecucao",
    "dataDistribuicaoJudicial",
    "indicadorMoedaTotalInscrito",
    "valorTotalInscritoMoeda",
    "valorTotalInscritoIndex",
    "indicadorMoedaTotalConsolidado",
    "valorTotalConsolidadoMoeda",
    "indicadorMoedaTotalRemanescente",
    "valorRemanescenteMoeda",
    "valorRemanescenteIndex",
    "dataDevolucaoProcesso",
    "numeroAutoInfracao",
    "indicadorPrescricaoSV8",
    "dataDecretacaoFalencia",
    "dataFimProcurador",
    "numeroImovelITR",
    "dataExtincaoInscricao",
    "motivoSuspensaoExigibilidade",
    "numeroRipSpu",
    "indicadorAnaliseOrgaoOrigem",
    "motivoExtincaoInscricao",
    "indicadorProtImpedAjuiz",
    "numeroAgrupamento",
    "numeroInscricaoOriginal",
    "numeroInscricaoDerivada1",
    "numeroInscricaoDerivada2",
    "numeroInscricaoDerivada3",
    "numeroInscricaoDerivada4",
    "numeroInscricaoDerivada5",
    "numeroInscricaoDerivada6",
    "numeroInscricaoDerivada7",
    "dcomp",
    "descricaoNaoCalculado",
    "codigoMunicipioSPU",
    "codigoSistemaOrigem",
    "descricaoSistemaOrigem"
})
@Generated("jsonschema2pojo")
public class DividaAtiva {

    @JsonProperty("inscricao")
    private String inscricao;
    @JsonProperty("processoAdministrativo")
    private String processoAdministrativo;
    @JsonProperty("situacao")
    private String situacao;
    @JsonProperty("dataInscricao")
    private String dataInscricao;
    @JsonProperty("numeroPFNResponsavel")
    private String numeroPFNResponsavel;
    @JsonProperty("nomePFNResponsavel")
    private String nomePFNResponsavel;
    @JsonProperty("numeroPFNInscricao")
    private String numeroPFNInscricao;
    @JsonProperty("nomePFNInscricao")
    private String nomePFNInscricao;
    @JsonProperty("numeroProcessoJudicial")
    private String numeroProcessoJudicial;
    @JsonProperty("numeroProcessoJudicialNovo")
    private String numeroProcessoJudicialNovo;
    @JsonProperty("orgaoOrigem")
    private String orgaoOrigem;
    @JsonProperty("codigoNaturezaReceita")
    private String codigoNaturezaReceita;
    @JsonProperty("nomeNaturezaReceita")
    private String nomeNaturezaReceita;
    @JsonProperty("codigoReceitaPrincipal")
    private String codigoReceitaPrincipal;
    @JsonProperty("nomeReceita")
    private String nomeReceita;
    @JsonProperty("codigoSerie")
    private String codigoSerie;
    @JsonProperty("nomeSerie")
    private String nomeSerie;
    @JsonProperty("codigoOrgaoJustica")
    private String codigoOrgaoJustica;
    @JsonProperty("nomeOrgaoJustica")
    private String nomeOrgaoJustica;
    @JsonProperty("numeroJuizo")
    private String numeroJuizo;
    @JsonProperty("descricaoJuizo")
    private String descricaoJuizo;
    @JsonProperty("dataProtocoloJudExecucao")
    private String dataProtocoloJudExecucao;
    @JsonProperty("dataDistribuicaoJudicial")
    private String dataDistribuicaoJudicial;
    @JsonProperty("indicadorMoedaTotalInscrito")
    private String indicadorMoedaTotalInscrito;
    @JsonProperty("valorTotalInscritoMoeda")
    private String valorTotalInscritoMoeda;
    @JsonProperty("valorTotalInscritoIndex")
    private String valorTotalInscritoIndex;
    @JsonProperty("indicadorMoedaTotalConsolidado")
    private String indicadorMoedaTotalConsolidado;
    @JsonProperty("valorTotalConsolidadoMoeda")
    private String valorTotalConsolidadoMoeda;
    @JsonProperty("indicadorMoedaTotalRemanescente")
    private String indicadorMoedaTotalRemanescente;
    @JsonProperty("valorRemanescenteMoeda")
    private String valorRemanescenteMoeda;
    @JsonProperty("valorRemanescenteIndex")
    private String valorRemanescenteIndex;
    @JsonProperty("dataDevolucaoProcesso")
    private String dataDevolucaoProcesso;
    @JsonProperty("numeroAutoInfracao")
    private String numeroAutoInfracao;
    @JsonProperty("indicadorPrescricaoSV8")
    private String indicadorPrescricaoSV8;
    @JsonProperty("dataDecretacaoFalencia")
    private String dataDecretacaoFalencia;
    @JsonProperty("dataFimProcurador")
    private String dataFimProcurador;
    @JsonProperty("numeroImovelITR")
    private String numeroImovelITR;
    @JsonProperty("dataExtincaoInscricao")
    private String dataExtincaoInscricao;
    @JsonProperty("motivoSuspensaoExigibilidade")
    private String motivoSuspensaoExigibilidade;
    @JsonProperty("numeroRipSpu")
    private String numeroRipSpu;
    @JsonProperty("indicadorAnaliseOrgaoOrigem")
    private String indicadorAnaliseOrgaoOrigem;
    @JsonProperty("motivoExtincaoInscricao")
    private String motivoExtincaoInscricao;
    @JsonProperty("indicadorProtImpedAjuiz")
    private String indicadorProtImpedAjuiz;
    @JsonProperty("numeroAgrupamento")
    private String numeroAgrupamento;
    @JsonProperty("numeroInscricaoOriginal")
    private String numeroInscricaoOriginal;
    @JsonProperty("numeroInscricaoDerivada1")
    private String numeroInscricaoDerivada1;
    @JsonProperty("numeroInscricaoDerivada2")
    private String numeroInscricaoDerivada2;
    @JsonProperty("numeroInscricaoDerivada3")
    private String numeroInscricaoDerivada3;
    @JsonProperty("numeroInscricaoDerivada4")
    private String numeroInscricaoDerivada4;
    @JsonProperty("numeroInscricaoDerivada5")
    private String numeroInscricaoDerivada5;
    @JsonProperty("numeroInscricaoDerivada6")
    private String numeroInscricaoDerivada6;
    @JsonProperty("numeroInscricaoDerivada7")
    private String numeroInscricaoDerivada7;
    @JsonProperty("dcomp")
    private String dcomp;
    @JsonProperty("descricaoNaoCalculado")
    private String descricaoNaoCalculado;
    @JsonProperty("codigoMunicipioSPU")
    private Integer codigoMunicipioSPU;
    @JsonProperty("codigoSistemaOrigem")
    private String codigoSistemaOrigem;
    @JsonProperty("descricaoSistemaOrigem")
    private Object descricaoSistemaOrigem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("inscricao")
    public String getInscricao() {
        return inscricao;
    }

    @JsonProperty("inscricao")
    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public DividaAtiva withInscricao(String inscricao) {
        this.inscricao = inscricao;
        return this;
    }

    @JsonProperty("processoAdministrativo")
    public String getProcessoAdministrativo() {
        return processoAdministrativo;
    }

    @JsonProperty("processoAdministrativo")
    public void setProcessoAdministrativo(String processoAdministrativo) {
        this.processoAdministrativo = processoAdministrativo;
    }

    public DividaAtiva withProcessoAdministrativo(String processoAdministrativo) {
        this.processoAdministrativo = processoAdministrativo;
        return this;
    }

    @JsonProperty("situacao")
    public String getSituacao() {
        return situacao;
    }

    @JsonProperty("situacao")
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public DividaAtiva withSituacao(String situacao) {
        this.situacao = situacao;
        return this;
    }

    @JsonProperty("dataInscricao")
    public String getDataInscricao() {
        return dataInscricao;
    }

    @JsonProperty("dataInscricao")
    public void setDataInscricao(String dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public DividaAtiva withDataInscricao(String dataInscricao) {
        this.dataInscricao = dataInscricao;
        return this;
    }

    @JsonProperty("numeroPFNResponsavel")
    public String getNumeroPFNResponsavel() {
        return numeroPFNResponsavel;
    }

    @JsonProperty("numeroPFNResponsavel")
    public void setNumeroPFNResponsavel(String numeroPFNResponsavel) {
        this.numeroPFNResponsavel = numeroPFNResponsavel;
    }

    public DividaAtiva withNumeroPFNResponsavel(String numeroPFNResponsavel) {
        this.numeroPFNResponsavel = numeroPFNResponsavel;
        return this;
    }

    @JsonProperty("nomePFNResponsavel")
    public String getNomePFNResponsavel() {
        return nomePFNResponsavel;
    }

    @JsonProperty("nomePFNResponsavel")
    public void setNomePFNResponsavel(String nomePFNResponsavel) {
        this.nomePFNResponsavel = nomePFNResponsavel;
    }

    public DividaAtiva withNomePFNResponsavel(String nomePFNResponsavel) {
        this.nomePFNResponsavel = nomePFNResponsavel;
        return this;
    }

    @JsonProperty("numeroPFNInscricao")
    public String getNumeroPFNInscricao() {
        return numeroPFNInscricao;
    }

    @JsonProperty("numeroPFNInscricao")
    public void setNumeroPFNInscricao(String numeroPFNInscricao) {
        this.numeroPFNInscricao = numeroPFNInscricao;
    }

    public DividaAtiva withNumeroPFNInscricao(String numeroPFNInscricao) {
        this.numeroPFNInscricao = numeroPFNInscricao;
        return this;
    }

    @JsonProperty("nomePFNInscricao")
    public String getNomePFNInscricao() {
        return nomePFNInscricao;
    }

    @JsonProperty("nomePFNInscricao")
    public void setNomePFNInscricao(String nomePFNInscricao) {
        this.nomePFNInscricao = nomePFNInscricao;
    }

    public DividaAtiva withNomePFNInscricao(String nomePFNInscricao) {
        this.nomePFNInscricao = nomePFNInscricao;
        return this;
    }

    @JsonProperty("numeroProcessoJudicial")
    public String getNumeroProcessoJudicial() {
        return numeroProcessoJudicial;
    }

    @JsonProperty("numeroProcessoJudicial")
    public void setNumeroProcessoJudicial(String numeroProcessoJudicial) {
        this.numeroProcessoJudicial = numeroProcessoJudicial;
    }

    public DividaAtiva withNumeroProcessoJudicial(String numeroProcessoJudicial) {
        this.numeroProcessoJudicial = numeroProcessoJudicial;
        return this;
    }

    @JsonProperty("numeroProcessoJudicialNovo")
    public String getNumeroProcessoJudicialNovo() {
        return numeroProcessoJudicialNovo;
    }

    @JsonProperty("numeroProcessoJudicialNovo")
    public void setNumeroProcessoJudicialNovo(String numeroProcessoJudicialNovo) {
        this.numeroProcessoJudicialNovo = numeroProcessoJudicialNovo;
    }

    public DividaAtiva withNumeroProcessoJudicialNovo(String numeroProcessoJudicialNovo) {
        this.numeroProcessoJudicialNovo = numeroProcessoJudicialNovo;
        return this;
    }

    @JsonProperty("orgaoOrigem")
    public String getOrgaoOrigem() {
        return orgaoOrigem;
    }

    @JsonProperty("orgaoOrigem")
    public void setOrgaoOrigem(String orgaoOrigem) {
        this.orgaoOrigem = orgaoOrigem;
    }

    public DividaAtiva withOrgaoOrigem(String orgaoOrigem) {
        this.orgaoOrigem = orgaoOrigem;
        return this;
    }

    @JsonProperty("codigoNaturezaReceita")
    public String getCodigoNaturezaReceita() {
        return codigoNaturezaReceita;
    }

    @JsonProperty("codigoNaturezaReceita")
    public void setCodigoNaturezaReceita(String codigoNaturezaReceita) {
        this.codigoNaturezaReceita = codigoNaturezaReceita;
    }

    public DividaAtiva withCodigoNaturezaReceita(String codigoNaturezaReceita) {
        this.codigoNaturezaReceita = codigoNaturezaReceita;
        return this;
    }

    @JsonProperty("nomeNaturezaReceita")
    public String getNomeNaturezaReceita() {
        return nomeNaturezaReceita;
    }

    @JsonProperty("nomeNaturezaReceita")
    public void setNomeNaturezaReceita(String nomeNaturezaReceita) {
        this.nomeNaturezaReceita = nomeNaturezaReceita;
    }

    public DividaAtiva withNomeNaturezaReceita(String nomeNaturezaReceita) {
        this.nomeNaturezaReceita = nomeNaturezaReceita;
        return this;
    }

    @JsonProperty("codigoReceitaPrincipal")
    public String getCodigoReceitaPrincipal() {
        return codigoReceitaPrincipal;
    }

    @JsonProperty("codigoReceitaPrincipal")
    public void setCodigoReceitaPrincipal(String codigoReceitaPrincipal) {
        this.codigoReceitaPrincipal = codigoReceitaPrincipal;
    }

    public DividaAtiva withCodigoReceitaPrincipal(String codigoReceitaPrincipal) {
        this.codigoReceitaPrincipal = codigoReceitaPrincipal;
        return this;
    }

    @JsonProperty("nomeReceita")
    public String getNomeReceita() {
        return nomeReceita;
    }

    @JsonProperty("nomeReceita")
    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public DividaAtiva withNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
        return this;
    }

    @JsonProperty("codigoSerie")
    public String getCodigoSerie() {
        return codigoSerie;
    }

    @JsonProperty("codigoSerie")
    public void setCodigoSerie(String codigoSerie) {
        this.codigoSerie = codigoSerie;
    }

    public DividaAtiva withCodigoSerie(String codigoSerie) {
        this.codigoSerie = codigoSerie;
        return this;
    }

    @JsonProperty("nomeSerie")
    public String getNomeSerie() {
        return nomeSerie;
    }

    @JsonProperty("nomeSerie")
    public void setNomeSerie(String nomeSerie) {
        this.nomeSerie = nomeSerie;
    }

    public DividaAtiva withNomeSerie(String nomeSerie) {
        this.nomeSerie = nomeSerie;
        return this;
    }

    @JsonProperty("codigoOrgaoJustica")
    public String getCodigoOrgaoJustica() {
        return codigoOrgaoJustica;
    }

    @JsonProperty("codigoOrgaoJustica")
    public void setCodigoOrgaoJustica(String codigoOrgaoJustica) {
        this.codigoOrgaoJustica = codigoOrgaoJustica;
    }

    public DividaAtiva withCodigoOrgaoJustica(String codigoOrgaoJustica) {
        this.codigoOrgaoJustica = codigoOrgaoJustica;
        return this;
    }

    @JsonProperty("nomeOrgaoJustica")
    public String getNomeOrgaoJustica() {
        return nomeOrgaoJustica;
    }

    @JsonProperty("nomeOrgaoJustica")
    public void setNomeOrgaoJustica(String nomeOrgaoJustica) {
        this.nomeOrgaoJustica = nomeOrgaoJustica;
    }

    public DividaAtiva withNomeOrgaoJustica(String nomeOrgaoJustica) {
        this.nomeOrgaoJustica = nomeOrgaoJustica;
        return this;
    }

    @JsonProperty("numeroJuizo")
    public String getNumeroJuizo() {
        return numeroJuizo;
    }

    @JsonProperty("numeroJuizo")
    public void setNumeroJuizo(String numeroJuizo) {
        this.numeroJuizo = numeroJuizo;
    }

    public DividaAtiva withNumeroJuizo(String numeroJuizo) {
        this.numeroJuizo = numeroJuizo;
        return this;
    }

    @JsonProperty("descricaoJuizo")
    public String getDescricaoJuizo() {
        return descricaoJuizo;
    }

    @JsonProperty("descricaoJuizo")
    public void setDescricaoJuizo(String descricaoJuizo) {
        this.descricaoJuizo = descricaoJuizo;
    }

    public DividaAtiva withDescricaoJuizo(String descricaoJuizo) {
        this.descricaoJuizo = descricaoJuizo;
        return this;
    }

    @JsonProperty("dataProtocoloJudExecucao")
    public String getDataProtocoloJudExecucao() {
        return dataProtocoloJudExecucao;
    }

    @JsonProperty("dataProtocoloJudExecucao")
    public void setDataProtocoloJudExecucao(String dataProtocoloJudExecucao) {
        this.dataProtocoloJudExecucao = dataProtocoloJudExecucao;
    }

    public DividaAtiva withDataProtocoloJudExecucao(String dataProtocoloJudExecucao) {
        this.dataProtocoloJudExecucao = dataProtocoloJudExecucao;
        return this;
    }

    @JsonProperty("dataDistribuicaoJudicial")
    public String getDataDistribuicaoJudicial() {
        return dataDistribuicaoJudicial;
    }

    @JsonProperty("dataDistribuicaoJudicial")
    public void setDataDistribuicaoJudicial(String dataDistribuicaoJudicial) {
        this.dataDistribuicaoJudicial = dataDistribuicaoJudicial;
    }

    public DividaAtiva withDataDistribuicaoJudicial(String dataDistribuicaoJudicial) {
        this.dataDistribuicaoJudicial = dataDistribuicaoJudicial;
        return this;
    }

    @JsonProperty("indicadorMoedaTotalInscrito")
    public String getIndicadorMoedaTotalInscrito() {
        return indicadorMoedaTotalInscrito;
    }

    @JsonProperty("indicadorMoedaTotalInscrito")
    public void setIndicadorMoedaTotalInscrito(String indicadorMoedaTotalInscrito) {
        this.indicadorMoedaTotalInscrito = indicadorMoedaTotalInscrito;
    }

    public DividaAtiva withIndicadorMoedaTotalInscrito(String indicadorMoedaTotalInscrito) {
        this.indicadorMoedaTotalInscrito = indicadorMoedaTotalInscrito;
        return this;
    }

    @JsonProperty("valorTotalInscritoMoeda")
    public String getValorTotalInscritoMoeda() {
        return valorTotalInscritoMoeda;
    }

    @JsonProperty("valorTotalInscritoMoeda")
    public void setValorTotalInscritoMoeda(String valorTotalInscritoMoeda) {
        this.valorTotalInscritoMoeda = valorTotalInscritoMoeda;
    }

    public DividaAtiva withValorTotalInscritoMoeda(String valorTotalInscritoMoeda) {
        this.valorTotalInscritoMoeda = valorTotalInscritoMoeda;
        return this;
    }

    @JsonProperty("valorTotalInscritoIndex")
    public String getValorTotalInscritoIndex() {
        return valorTotalInscritoIndex;
    }

    @JsonProperty("valorTotalInscritoIndex")
    public void setValorTotalInscritoIndex(String valorTotalInscritoIndex) {
        this.valorTotalInscritoIndex = valorTotalInscritoIndex;
    }

    public DividaAtiva withValorTotalInscritoIndex(String valorTotalInscritoIndex) {
        this.valorTotalInscritoIndex = valorTotalInscritoIndex;
        return this;
    }

    @JsonProperty("indicadorMoedaTotalConsolidado")
    public String getIndicadorMoedaTotalConsolidado() {
        return indicadorMoedaTotalConsolidado;
    }

    @JsonProperty("indicadorMoedaTotalConsolidado")
    public void setIndicadorMoedaTotalConsolidado(String indicadorMoedaTotalConsolidado) {
        this.indicadorMoedaTotalConsolidado = indicadorMoedaTotalConsolidado;
    }

    public DividaAtiva withIndicadorMoedaTotalConsolidado(String indicadorMoedaTotalConsolidado) {
        this.indicadorMoedaTotalConsolidado = indicadorMoedaTotalConsolidado;
        return this;
    }

    @JsonProperty("valorTotalConsolidadoMoeda")
    public String getValorTotalConsolidadoMoeda() {
        return valorTotalConsolidadoMoeda;
    }

    @JsonProperty("valorTotalConsolidadoMoeda")
    public void setValorTotalConsolidadoMoeda(String valorTotalConsolidadoMoeda) {
        this.valorTotalConsolidadoMoeda = valorTotalConsolidadoMoeda;
    }

    public DividaAtiva withValorTotalConsolidadoMoeda(String valorTotalConsolidadoMoeda) {
        this.valorTotalConsolidadoMoeda = valorTotalConsolidadoMoeda;
        return this;
    }

    @JsonProperty("indicadorMoedaTotalRemanescente")
    public String getIndicadorMoedaTotalRemanescente() {
        return indicadorMoedaTotalRemanescente;
    }

    @JsonProperty("indicadorMoedaTotalRemanescente")
    public void setIndicadorMoedaTotalRemanescente(String indicadorMoedaTotalRemanescente) {
        this.indicadorMoedaTotalRemanescente = indicadorMoedaTotalRemanescente;
    }

    public DividaAtiva withIndicadorMoedaTotalRemanescente(String indicadorMoedaTotalRemanescente) {
        this.indicadorMoedaTotalRemanescente = indicadorMoedaTotalRemanescente;
        return this;
    }

    @JsonProperty("valorRemanescenteMoeda")
    public String getValorRemanescenteMoeda() {
        return valorRemanescenteMoeda;
    }

    @JsonProperty("valorRemanescenteMoeda")
    public void setValorRemanescenteMoeda(String valorRemanescenteMoeda) {
        this.valorRemanescenteMoeda = valorRemanescenteMoeda;
    }

    public DividaAtiva withValorRemanescenteMoeda(String valorRemanescenteMoeda) {
        this.valorRemanescenteMoeda = valorRemanescenteMoeda;
        return this;
    }

    @JsonProperty("valorRemanescenteIndex")
    public String getValorRemanescenteIndex() {
        return valorRemanescenteIndex;
    }

    @JsonProperty("valorRemanescenteIndex")
    public void setValorRemanescenteIndex(String valorRemanescenteIndex) {
        this.valorRemanescenteIndex = valorRemanescenteIndex;
    }

    public DividaAtiva withValorRemanescenteIndex(String valorRemanescenteIndex) {
        this.valorRemanescenteIndex = valorRemanescenteIndex;
        return this;
    }

    @JsonProperty("dataDevolucaoProcesso")
    public String getDataDevolucaoProcesso() {
        return dataDevolucaoProcesso;
    }

    @JsonProperty("dataDevolucaoProcesso")
    public void setDataDevolucaoProcesso(String dataDevolucaoProcesso) {
        this.dataDevolucaoProcesso = dataDevolucaoProcesso;
    }

    public DividaAtiva withDataDevolucaoProcesso(String dataDevolucaoProcesso) {
        this.dataDevolucaoProcesso = dataDevolucaoProcesso;
        return this;
    }

    @JsonProperty("numeroAutoInfracao")
    public String getNumeroAutoInfracao() {
        return numeroAutoInfracao;
    }

    @JsonProperty("numeroAutoInfracao")
    public void setNumeroAutoInfracao(String numeroAutoInfracao) {
        this.numeroAutoInfracao = numeroAutoInfracao;
    }

    public DividaAtiva withNumeroAutoInfracao(String numeroAutoInfracao) {
        this.numeroAutoInfracao = numeroAutoInfracao;
        return this;
    }

    @JsonProperty("indicadorPrescricaoSV8")
    public String getIndicadorPrescricaoSV8() {
        return indicadorPrescricaoSV8;
    }

    @JsonProperty("indicadorPrescricaoSV8")
    public void setIndicadorPrescricaoSV8(String indicadorPrescricaoSV8) {
        this.indicadorPrescricaoSV8 = indicadorPrescricaoSV8;
    }

    public DividaAtiva withIndicadorPrescricaoSV8(String indicadorPrescricaoSV8) {
        this.indicadorPrescricaoSV8 = indicadorPrescricaoSV8;
        return this;
    }

    @JsonProperty("dataDecretacaoFalencia")
    public String getDataDecretacaoFalencia() {
        return dataDecretacaoFalencia;
    }

    @JsonProperty("dataDecretacaoFalencia")
    public void setDataDecretacaoFalencia(String dataDecretacaoFalencia) {
        this.dataDecretacaoFalencia = dataDecretacaoFalencia;
    }

    public DividaAtiva withDataDecretacaoFalencia(String dataDecretacaoFalencia) {
        this.dataDecretacaoFalencia = dataDecretacaoFalencia;
        return this;
    }

    @JsonProperty("dataFimProcurador")
    public String getDataFimProcurador() {
        return dataFimProcurador;
    }

    @JsonProperty("dataFimProcurador")
    public void setDataFimProcurador(String dataFimProcurador) {
        this.dataFimProcurador = dataFimProcurador;
    }

    public DividaAtiva withDataFimProcurador(String dataFimProcurador) {
        this.dataFimProcurador = dataFimProcurador;
        return this;
    }

    @JsonProperty("numeroImovelITR")
    public String getNumeroImovelITR() {
        return numeroImovelITR;
    }

    @JsonProperty("numeroImovelITR")
    public void setNumeroImovelITR(String numeroImovelITR) {
        this.numeroImovelITR = numeroImovelITR;
    }

    public DividaAtiva withNumeroImovelITR(String numeroImovelITR) {
        this.numeroImovelITR = numeroImovelITR;
        return this;
    }

    @JsonProperty("dataExtincaoInscricao")
    public String getDataExtincaoInscricao() {
        return dataExtincaoInscricao;
    }

    @JsonProperty("dataExtincaoInscricao")
    public void setDataExtincaoInscricao(String dataExtincaoInscricao) {
        this.dataExtincaoInscricao = dataExtincaoInscricao;
    }

    public DividaAtiva withDataExtincaoInscricao(String dataExtincaoInscricao) {
        this.dataExtincaoInscricao = dataExtincaoInscricao;
        return this;
    }

    @JsonProperty("motivoSuspensaoExigibilidade")
    public String getMotivoSuspensaoExigibilidade() {
        return motivoSuspensaoExigibilidade;
    }

    @JsonProperty("motivoSuspensaoExigibilidade")
    public void setMotivoSuspensaoExigibilidade(String motivoSuspensaoExigibilidade) {
        this.motivoSuspensaoExigibilidade = motivoSuspensaoExigibilidade;
    }

    public DividaAtiva withMotivoSuspensaoExigibilidade(String motivoSuspensaoExigibilidade) {
        this.motivoSuspensaoExigibilidade = motivoSuspensaoExigibilidade;
        return this;
    }

    @JsonProperty("numeroRipSpu")
    public String getNumeroRipSpu() {
        return numeroRipSpu;
    }

    @JsonProperty("numeroRipSpu")
    public void setNumeroRipSpu(String numeroRipSpu) {
        this.numeroRipSpu = numeroRipSpu;
    }

    public DividaAtiva withNumeroRipSpu(String numeroRipSpu) {
        this.numeroRipSpu = numeroRipSpu;
        return this;
    }

    @JsonProperty("indicadorAnaliseOrgaoOrigem")
    public String getIndicadorAnaliseOrgaoOrigem() {
        return indicadorAnaliseOrgaoOrigem;
    }

    @JsonProperty("indicadorAnaliseOrgaoOrigem")
    public void setIndicadorAnaliseOrgaoOrigem(String indicadorAnaliseOrgaoOrigem) {
        this.indicadorAnaliseOrgaoOrigem = indicadorAnaliseOrgaoOrigem;
    }

    public DividaAtiva withIndicadorAnaliseOrgaoOrigem(String indicadorAnaliseOrgaoOrigem) {
        this.indicadorAnaliseOrgaoOrigem = indicadorAnaliseOrgaoOrigem;
        return this;
    }

    @JsonProperty("motivoExtincaoInscricao")
    public String getMotivoExtincaoInscricao() {
        return motivoExtincaoInscricao;
    }

    @JsonProperty("motivoExtincaoInscricao")
    public void setMotivoExtincaoInscricao(String motivoExtincaoInscricao) {
        this.motivoExtincaoInscricao = motivoExtincaoInscricao;
    }

    public DividaAtiva withMotivoExtincaoInscricao(String motivoExtincaoInscricao) {
        this.motivoExtincaoInscricao = motivoExtincaoInscricao;
        return this;
    }

    @JsonProperty("indicadorProtImpedAjuiz")
    public String getIndicadorProtImpedAjuiz() {
        return indicadorProtImpedAjuiz;
    }

    @JsonProperty("indicadorProtImpedAjuiz")
    public void setIndicadorProtImpedAjuiz(String indicadorProtImpedAjuiz) {
        this.indicadorProtImpedAjuiz = indicadorProtImpedAjuiz;
    }

    public DividaAtiva withIndicadorProtImpedAjuiz(String indicadorProtImpedAjuiz) {
        this.indicadorProtImpedAjuiz = indicadorProtImpedAjuiz;
        return this;
    }

    @JsonProperty("numeroAgrupamento")
    public String getNumeroAgrupamento() {
        return numeroAgrupamento;
    }

    @JsonProperty("numeroAgrupamento")
    public void setNumeroAgrupamento(String numeroAgrupamento) {
        this.numeroAgrupamento = numeroAgrupamento;
    }

    public DividaAtiva withNumeroAgrupamento(String numeroAgrupamento) {
        this.numeroAgrupamento = numeroAgrupamento;
        return this;
    }

    @JsonProperty("numeroInscricaoOriginal")
    public String getNumeroInscricaoOriginal() {
        return numeroInscricaoOriginal;
    }

    @JsonProperty("numeroInscricaoOriginal")
    public void setNumeroInscricaoOriginal(String numeroInscricaoOriginal) {
        this.numeroInscricaoOriginal = numeroInscricaoOriginal;
    }

    public DividaAtiva withNumeroInscricaoOriginal(String numeroInscricaoOriginal) {
        this.numeroInscricaoOriginal = numeroInscricaoOriginal;
        return this;
    }

    @JsonProperty("numeroInscricaoDerivada1")
    public String getNumeroInscricaoDerivada1() {
        return numeroInscricaoDerivada1;
    }

    @JsonProperty("numeroInscricaoDerivada1")
    public void setNumeroInscricaoDerivada1(String numeroInscricaoDerivada1) {
        this.numeroInscricaoDerivada1 = numeroInscricaoDerivada1;
    }

    public DividaAtiva withNumeroInscricaoDerivada1(String numeroInscricaoDerivada1) {
        this.numeroInscricaoDerivada1 = numeroInscricaoDerivada1;
        return this;
    }

    @JsonProperty("numeroInscricaoDerivada2")
    public String getNumeroInscricaoDerivada2() {
        return numeroInscricaoDerivada2;
    }

    @JsonProperty("numeroInscricaoDerivada2")
    public void setNumeroInscricaoDerivada2(String numeroInscricaoDerivada2) {
        this.numeroInscricaoDerivada2 = numeroInscricaoDerivada2;
    }

    public DividaAtiva withNumeroInscricaoDerivada2(String numeroInscricaoDerivada2) {
        this.numeroInscricaoDerivada2 = numeroInscricaoDerivada2;
        return this;
    }

    @JsonProperty("numeroInscricaoDerivada3")
    public String getNumeroInscricaoDerivada3() {
        return numeroInscricaoDerivada3;
    }

    @JsonProperty("numeroInscricaoDerivada3")
    public void setNumeroInscricaoDerivada3(String numeroInscricaoDerivada3) {
        this.numeroInscricaoDerivada3 = numeroInscricaoDerivada3;
    }

    public DividaAtiva withNumeroInscricaoDerivada3(String numeroInscricaoDerivada3) {
        this.numeroInscricaoDerivada3 = numeroInscricaoDerivada3;
        return this;
    }

    @JsonProperty("numeroInscricaoDerivada4")
    public String getNumeroInscricaoDerivada4() {
        return numeroInscricaoDerivada4;
    }

    @JsonProperty("numeroInscricaoDerivada4")
    public void setNumeroInscricaoDerivada4(String numeroInscricaoDerivada4) {
        this.numeroInscricaoDerivada4 = numeroInscricaoDerivada4;
    }

    public DividaAtiva withNumeroInscricaoDerivada4(String numeroInscricaoDerivada4) {
        this.numeroInscricaoDerivada4 = numeroInscricaoDerivada4;
        return this;
    }

    @JsonProperty("numeroInscricaoDerivada5")
    public String getNumeroInscricaoDerivada5() {
        return numeroInscricaoDerivada5;
    }

    @JsonProperty("numeroInscricaoDerivada5")
    public void setNumeroInscricaoDerivada5(String numeroInscricaoDerivada5) {
        this.numeroInscricaoDerivada5 = numeroInscricaoDerivada5;
    }

    public DividaAtiva withNumeroInscricaoDerivada5(String numeroInscricaoDerivada5) {
        this.numeroInscricaoDerivada5 = numeroInscricaoDerivada5;
        return this;
    }

    @JsonProperty("numeroInscricaoDerivada6")
    public String getNumeroInscricaoDerivada6() {
        return numeroInscricaoDerivada6;
    }

    @JsonProperty("numeroInscricaoDerivada6")
    public void setNumeroInscricaoDerivada6(String numeroInscricaoDerivada6) {
        this.numeroInscricaoDerivada6 = numeroInscricaoDerivada6;
    }

    public DividaAtiva withNumeroInscricaoDerivada6(String numeroInscricaoDerivada6) {
        this.numeroInscricaoDerivada6 = numeroInscricaoDerivada6;
        return this;
    }

    @JsonProperty("numeroInscricaoDerivada7")
    public String getNumeroInscricaoDerivada7() {
        return numeroInscricaoDerivada7;
    }

    @JsonProperty("numeroInscricaoDerivada7")
    public void setNumeroInscricaoDerivada7(String numeroInscricaoDerivada7) {
        this.numeroInscricaoDerivada7 = numeroInscricaoDerivada7;
    }

    public DividaAtiva withNumeroInscricaoDerivada7(String numeroInscricaoDerivada7) {
        this.numeroInscricaoDerivada7 = numeroInscricaoDerivada7;
        return this;
    }

    @JsonProperty("dcomp")
    public String getDcomp() {
        return dcomp;
    }

    @JsonProperty("dcomp")
    public void setDcomp(String dcomp) {
        this.dcomp = dcomp;
    }

    public DividaAtiva withDcomp(String dcomp) {
        this.dcomp = dcomp;
        return this;
    }

    @JsonProperty("descricaoNaoCalculado")
    public String getDescricaoNaoCalculado() {
        return descricaoNaoCalculado;
    }

    @JsonProperty("descricaoNaoCalculado")
    public void setDescricaoNaoCalculado(String descricaoNaoCalculado) {
        this.descricaoNaoCalculado = descricaoNaoCalculado;
    }

    public DividaAtiva withDescricaoNaoCalculado(String descricaoNaoCalculado) {
        this.descricaoNaoCalculado = descricaoNaoCalculado;
        return this;
    }

    @JsonProperty("codigoMunicipioSPU")
    public Integer getCodigoMunicipioSPU() {
        return codigoMunicipioSPU;
    }

    @JsonProperty("codigoMunicipioSPU")
    public void setCodigoMunicipioSPU(Integer codigoMunicipioSPU) {
        this.codigoMunicipioSPU = codigoMunicipioSPU;
    }

    public DividaAtiva withCodigoMunicipioSPU(Integer codigoMunicipioSPU) {
        this.codigoMunicipioSPU = codigoMunicipioSPU;
        return this;
    }

    @JsonProperty("codigoSistemaOrigem")
    public String getCodigoSistemaOrigem() {
        return codigoSistemaOrigem;
    }

    @JsonProperty("codigoSistemaOrigem")
    public void setCodigoSistemaOrigem(String codigoSistemaOrigem) {
        this.codigoSistemaOrigem = codigoSistemaOrigem;
    }

    public DividaAtiva withCodigoSistemaOrigem(String codigoSistemaOrigem) {
        this.codigoSistemaOrigem = codigoSistemaOrigem;
        return this;
    }

    @JsonProperty("descricaoSistemaOrigem")
    public Object getDescricaoSistemaOrigem() {
        return descricaoSistemaOrigem;
    }

    @JsonProperty("descricaoSistemaOrigem")
    public void setDescricaoSistemaOrigem(Object descricaoSistemaOrigem) {
        this.descricaoSistemaOrigem = descricaoSistemaOrigem;
    }

    public DividaAtiva withDescricaoSistemaOrigem(Object descricaoSistemaOrigem) {
        this.descricaoSistemaOrigem = descricaoSistemaOrigem;
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

    public DividaAtiva withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DividaAtiva.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("inscricao");
        sb.append('=');
        sb.append(((this.inscricao == null)?"<null>":this.inscricao));
        sb.append(',');
        sb.append("processoAdministrativo");
        sb.append('=');
        sb.append(((this.processoAdministrativo == null)?"<null>":this.processoAdministrativo));
        sb.append(',');
        sb.append("situacao");
        sb.append('=');
        sb.append(((this.situacao == null)?"<null>":this.situacao));
        sb.append(',');
        sb.append("dataInscricao");
        sb.append('=');
        sb.append(((this.dataInscricao == null)?"<null>":this.dataInscricao));
        sb.append(',');
        sb.append("numeroPFNResponsavel");
        sb.append('=');
        sb.append(((this.numeroPFNResponsavel == null)?"<null>":this.numeroPFNResponsavel));
        sb.append(',');
        sb.append("nomePFNResponsavel");
        sb.append('=');
        sb.append(((this.nomePFNResponsavel == null)?"<null>":this.nomePFNResponsavel));
        sb.append(',');
        sb.append("numeroPFNInscricao");
        sb.append('=');
        sb.append(((this.numeroPFNInscricao == null)?"<null>":this.numeroPFNInscricao));
        sb.append(',');
        sb.append("nomePFNInscricao");
        sb.append('=');
        sb.append(((this.nomePFNInscricao == null)?"<null>":this.nomePFNInscricao));
        sb.append(',');
        sb.append("numeroProcessoJudicial");
        sb.append('=');
        sb.append(((this.numeroProcessoJudicial == null)?"<null>":this.numeroProcessoJudicial));
        sb.append(',');
        sb.append("numeroProcessoJudicialNovo");
        sb.append('=');
        sb.append(((this.numeroProcessoJudicialNovo == null)?"<null>":this.numeroProcessoJudicialNovo));
        sb.append(',');
        sb.append("orgaoOrigem");
        sb.append('=');
        sb.append(((this.orgaoOrigem == null)?"<null>":this.orgaoOrigem));
        sb.append(',');
        sb.append("codigoNaturezaReceita");
        sb.append('=');
        sb.append(((this.codigoNaturezaReceita == null)?"<null>":this.codigoNaturezaReceita));
        sb.append(',');
        sb.append("nomeNaturezaReceita");
        sb.append('=');
        sb.append(((this.nomeNaturezaReceita == null)?"<null>":this.nomeNaturezaReceita));
        sb.append(',');
        sb.append("codigoReceitaPrincipal");
        sb.append('=');
        sb.append(((this.codigoReceitaPrincipal == null)?"<null>":this.codigoReceitaPrincipal));
        sb.append(',');
        sb.append("nomeReceita");
        sb.append('=');
        sb.append(((this.nomeReceita == null)?"<null>":this.nomeReceita));
        sb.append(',');
        sb.append("codigoSerie");
        sb.append('=');
        sb.append(((this.codigoSerie == null)?"<null>":this.codigoSerie));
        sb.append(',');
        sb.append("nomeSerie");
        sb.append('=');
        sb.append(((this.nomeSerie == null)?"<null>":this.nomeSerie));
        sb.append(',');
        sb.append("codigoOrgaoJustica");
        sb.append('=');
        sb.append(((this.codigoOrgaoJustica == null)?"<null>":this.codigoOrgaoJustica));
        sb.append(',');
        sb.append("nomeOrgaoJustica");
        sb.append('=');
        sb.append(((this.nomeOrgaoJustica == null)?"<null>":this.nomeOrgaoJustica));
        sb.append(',');
        sb.append("numeroJuizo");
        sb.append('=');
        sb.append(((this.numeroJuizo == null)?"<null>":this.numeroJuizo));
        sb.append(',');
        sb.append("descricaoJuizo");
        sb.append('=');
        sb.append(((this.descricaoJuizo == null)?"<null>":this.descricaoJuizo));
        sb.append(',');
        sb.append("dataProtocoloJudExecucao");
        sb.append('=');
        sb.append(((this.dataProtocoloJudExecucao == null)?"<null>":this.dataProtocoloJudExecucao));
        sb.append(',');
        sb.append("dataDistribuicaoJudicial");
        sb.append('=');
        sb.append(((this.dataDistribuicaoJudicial == null)?"<null>":this.dataDistribuicaoJudicial));
        sb.append(',');
        sb.append("indicadorMoedaTotalInscrito");
        sb.append('=');
        sb.append(((this.indicadorMoedaTotalInscrito == null)?"<null>":this.indicadorMoedaTotalInscrito));
        sb.append(',');
        sb.append("valorTotalInscritoMoeda");
        sb.append('=');
        sb.append(((this.valorTotalInscritoMoeda == null)?"<null>":this.valorTotalInscritoMoeda));
        sb.append(',');
        sb.append("valorTotalInscritoIndex");
        sb.append('=');
        sb.append(((this.valorTotalInscritoIndex == null)?"<null>":this.valorTotalInscritoIndex));
        sb.append(',');
        sb.append("indicadorMoedaTotalConsolidado");
        sb.append('=');
        sb.append(((this.indicadorMoedaTotalConsolidado == null)?"<null>":this.indicadorMoedaTotalConsolidado));
        sb.append(',');
        sb.append("valorTotalConsolidadoMoeda");
        sb.append('=');
        sb.append(((this.valorTotalConsolidadoMoeda == null)?"<null>":this.valorTotalConsolidadoMoeda));
        sb.append(',');
        sb.append("indicadorMoedaTotalRemanescente");
        sb.append('=');
        sb.append(((this.indicadorMoedaTotalRemanescente == null)?"<null>":this.indicadorMoedaTotalRemanescente));
        sb.append(',');
        sb.append("valorRemanescenteMoeda");
        sb.append('=');
        sb.append(((this.valorRemanescenteMoeda == null)?"<null>":this.valorRemanescenteMoeda));
        sb.append(',');
        sb.append("valorRemanescenteIndex");
        sb.append('=');
        sb.append(((this.valorRemanescenteIndex == null)?"<null>":this.valorRemanescenteIndex));
        sb.append(',');
        sb.append("dataDevolucaoProcesso");
        sb.append('=');
        sb.append(((this.dataDevolucaoProcesso == null)?"<null>":this.dataDevolucaoProcesso));
        sb.append(',');
        sb.append("numeroAutoInfracao");
        sb.append('=');
        sb.append(((this.numeroAutoInfracao == null)?"<null>":this.numeroAutoInfracao));
        sb.append(',');
        sb.append("indicadorPrescricaoSV8");
        sb.append('=');
        sb.append(((this.indicadorPrescricaoSV8 == null)?"<null>":this.indicadorPrescricaoSV8));
        sb.append(',');
        sb.append("dataDecretacaoFalencia");
        sb.append('=');
        sb.append(((this.dataDecretacaoFalencia == null)?"<null>":this.dataDecretacaoFalencia));
        sb.append(',');
        sb.append("dataFimProcurador");
        sb.append('=');
        sb.append(((this.dataFimProcurador == null)?"<null>":this.dataFimProcurador));
        sb.append(',');
        sb.append("numeroImovelITR");
        sb.append('=');
        sb.append(((this.numeroImovelITR == null)?"<null>":this.numeroImovelITR));
        sb.append(',');
        sb.append("dataExtincaoInscricao");
        sb.append('=');
        sb.append(((this.dataExtincaoInscricao == null)?"<null>":this.dataExtincaoInscricao));
        sb.append(',');
        sb.append("motivoSuspensaoExigibilidade");
        sb.append('=');
        sb.append(((this.motivoSuspensaoExigibilidade == null)?"<null>":this.motivoSuspensaoExigibilidade));
        sb.append(',');
        sb.append("numeroRipSpu");
        sb.append('=');
        sb.append(((this.numeroRipSpu == null)?"<null>":this.numeroRipSpu));
        sb.append(',');
        sb.append("indicadorAnaliseOrgaoOrigem");
        sb.append('=');
        sb.append(((this.indicadorAnaliseOrgaoOrigem == null)?"<null>":this.indicadorAnaliseOrgaoOrigem));
        sb.append(',');
        sb.append("motivoExtincaoInscricao");
        sb.append('=');
        sb.append(((this.motivoExtincaoInscricao == null)?"<null>":this.motivoExtincaoInscricao));
        sb.append(',');
        sb.append("indicadorProtImpedAjuiz");
        sb.append('=');
        sb.append(((this.indicadorProtImpedAjuiz == null)?"<null>":this.indicadorProtImpedAjuiz));
        sb.append(',');
        sb.append("numeroAgrupamento");
        sb.append('=');
        sb.append(((this.numeroAgrupamento == null)?"<null>":this.numeroAgrupamento));
        sb.append(',');
        sb.append("numeroInscricaoOriginal");
        sb.append('=');
        sb.append(((this.numeroInscricaoOriginal == null)?"<null>":this.numeroInscricaoOriginal));
        sb.append(',');
        sb.append("numeroInscricaoDerivada1");
        sb.append('=');
        sb.append(((this.numeroInscricaoDerivada1 == null)?"<null>":this.numeroInscricaoDerivada1));
        sb.append(',');
        sb.append("numeroInscricaoDerivada2");
        sb.append('=');
        sb.append(((this.numeroInscricaoDerivada2 == null)?"<null>":this.numeroInscricaoDerivada2));
        sb.append(',');
        sb.append("numeroInscricaoDerivada3");
        sb.append('=');
        sb.append(((this.numeroInscricaoDerivada3 == null)?"<null>":this.numeroInscricaoDerivada3));
        sb.append(',');
        sb.append("numeroInscricaoDerivada4");
        sb.append('=');
        sb.append(((this.numeroInscricaoDerivada4 == null)?"<null>":this.numeroInscricaoDerivada4));
        sb.append(',');
        sb.append("numeroInscricaoDerivada5");
        sb.append('=');
        sb.append(((this.numeroInscricaoDerivada5 == null)?"<null>":this.numeroInscricaoDerivada5));
        sb.append(',');
        sb.append("numeroInscricaoDerivada6");
        sb.append('=');
        sb.append(((this.numeroInscricaoDerivada6 == null)?"<null>":this.numeroInscricaoDerivada6));
        sb.append(',');
        sb.append("numeroInscricaoDerivada7");
        sb.append('=');
        sb.append(((this.numeroInscricaoDerivada7 == null)?"<null>":this.numeroInscricaoDerivada7));
        sb.append(',');
        sb.append("dcomp");
        sb.append('=');
        sb.append(((this.dcomp == null)?"<null>":this.dcomp));
        sb.append(',');
        sb.append("descricaoNaoCalculado");
        sb.append('=');
        sb.append(((this.descricaoNaoCalculado == null)?"<null>":this.descricaoNaoCalculado));
        sb.append(',');
        sb.append("codigoMunicipioSPU");
        sb.append('=');
        sb.append(((this.codigoMunicipioSPU == null)?"<null>":this.codigoMunicipioSPU));
        sb.append(',');
        sb.append("codigoSistemaOrigem");
        sb.append('=');
        sb.append(((this.codigoSistemaOrigem == null)?"<null>":this.codigoSistemaOrigem));
        sb.append(',');
        sb.append("descricaoSistemaOrigem");
        sb.append('=');
        sb.append(((this.descricaoSistemaOrigem == null)?"<null>":this.descricaoSistemaOrigem));
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
        result = ((result* 31)+((this.dataFimProcurador == null)? 0 :this.dataFimProcurador.hashCode()));
        result = ((result* 31)+((this.situacao == null)? 0 :this.situacao.hashCode()));
        result = ((result* 31)+((this.inscricao == null)? 0 :this.inscricao.hashCode()));
        result = ((result* 31)+((this.indicadorProtImpedAjuiz == null)? 0 :this.indicadorProtImpedAjuiz.hashCode()));
        result = ((result* 31)+((this.orgaoOrigem == null)? 0 :this.orgaoOrigem.hashCode()));
        result = ((result* 31)+((this.dataDistribuicaoJudicial == null)? 0 :this.dataDistribuicaoJudicial.hashCode()));
        result = ((result* 31)+((this.codigoMunicipioSPU == null)? 0 :this.codigoMunicipioSPU.hashCode()));
        result = ((result* 31)+((this.numeroImovelITR == null)? 0 :this.numeroImovelITR.hashCode()));
        result = ((result* 31)+((this.valorRemanescenteMoeda == null)? 0 :this.valorRemanescenteMoeda.hashCode()));
        result = ((result* 31)+((this.motivoExtincaoInscricao == null)? 0 :this.motivoExtincaoInscricao.hashCode()));
        result = ((result* 31)+((this.nomeOrgaoJustica == null)? 0 :this.nomeOrgaoJustica.hashCode()));
        result = ((result* 31)+((this.dataInscricao == null)? 0 :this.dataInscricao.hashCode()));
        result = ((result* 31)+((this.nomeReceita == null)? 0 :this.nomeReceita.hashCode()));
        result = ((result* 31)+((this.indicadorAnaliseOrgaoOrigem == null)? 0 :this.indicadorAnaliseOrgaoOrigem.hashCode()));
        result = ((result* 31)+((this.valorTotalInscritoMoeda == null)? 0 :this.valorTotalInscritoMoeda.hashCode()));
        result = ((result* 31)+((this.numeroPFNInscricao == null)? 0 :this.numeroPFNInscricao.hashCode()));
        result = ((result* 31)+((this.nomeNaturezaReceita == null)? 0 :this.nomeNaturezaReceita.hashCode()));
        result = ((result* 31)+((this.indicadorMoedaTotalRemanescente == null)? 0 :this.indicadorMoedaTotalRemanescente.hashCode()));
        result = ((result* 31)+((this.nomePFNResponsavel == null)? 0 :this.nomePFNResponsavel.hashCode()));
        result = ((result* 31)+((this.descricaoJuizo == null)? 0 :this.descricaoJuizo.hashCode()));
        result = ((result* 31)+((this.codigoReceitaPrincipal == null)? 0 :this.codigoReceitaPrincipal.hashCode()));
        result = ((result* 31)+((this.numeroRipSpu == null)? 0 :this.numeroRipSpu.hashCode()));
        result = ((result* 31)+((this.dataDevolucaoProcesso == null)? 0 :this.dataDevolucaoProcesso.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.numeroAutoInfracao == null)? 0 :this.numeroAutoInfracao.hashCode()));
        result = ((result* 31)+((this.numeroInscricaoDerivada2 == null)? 0 :this.numeroInscricaoDerivada2 .hashCode()));
        result = ((result* 31)+((this.numeroPFNResponsavel == null)? 0 :this.numeroPFNResponsavel.hashCode()));
        result = ((result* 31)+((this.numeroInscricaoDerivada1 == null)? 0 :this.numeroInscricaoDerivada1 .hashCode()));
        result = ((result* 31)+((this.numeroInscricaoDerivada4 == null)? 0 :this.numeroInscricaoDerivada4 .hashCode()));
        result = ((result* 31)+((this.numeroInscricaoDerivada3 == null)? 0 :this.numeroInscricaoDerivada3 .hashCode()));
        result = ((result* 31)+((this.numeroInscricaoDerivada6 == null)? 0 :this.numeroInscricaoDerivada6 .hashCode()));
        result = ((result* 31)+((this.numeroInscricaoDerivada5 == null)? 0 :this.numeroInscricaoDerivada5 .hashCode()));
        result = ((result* 31)+((this.codigoSerie == null)? 0 :this.codigoSerie.hashCode()));
        result = ((result* 31)+((this.nomeSerie == null)? 0 :this.nomeSerie.hashCode()));
        result = ((result* 31)+((this.numeroInscricaoDerivada7 == null)? 0 :this.numeroInscricaoDerivada7 .hashCode()));
        result = ((result* 31)+((this.codigoSistemaOrigem == null)? 0 :this.codigoSistemaOrigem.hashCode()));
        result = ((result* 31)+((this.dcomp == null)? 0 :this.dcomp.hashCode()));
        result = ((result* 31)+((this.indicadorMoedaTotalConsolidado == null)? 0 :this.indicadorMoedaTotalConsolidado.hashCode()));
        result = ((result* 31)+((this.motivoSuspensaoExigibilidade == null)? 0 :this.motivoSuspensaoExigibilidade.hashCode()));
        result = ((result* 31)+((this.numeroAgrupamento == null)? 0 :this.numeroAgrupamento.hashCode()));
        result = ((result* 31)+((this.dataProtocoloJudExecucao == null)? 0 :this.dataProtocoloJudExecucao.hashCode()));
        result = ((result* 31)+((this.dataExtincaoInscricao == null)? 0 :this.dataExtincaoInscricao.hashCode()));
        result = ((result* 31)+((this.descricaoNaoCalculado == null)? 0 :this.descricaoNaoCalculado.hashCode()));
        result = ((result* 31)+((this.codigoNaturezaReceita == null)? 0 :this.codigoNaturezaReceita.hashCode()));
        result = ((result* 31)+((this.descricaoSistemaOrigem == null)? 0 :this.descricaoSistemaOrigem.hashCode()));
        result = ((result* 31)+((this.valorTotalInscritoIndex == null)? 0 :this.valorTotalInscritoIndex.hashCode()));
        result = ((result* 31)+((this.valorRemanescenteIndex == null)? 0 :this.valorRemanescenteIndex.hashCode()));
        result = ((result* 31)+((this.processoAdministrativo == null)? 0 :this.processoAdministrativo.hashCode()));
        result = ((result* 31)+((this.dataDecretacaoFalencia == null)? 0 :this.dataDecretacaoFalencia.hashCode()));
        result = ((result* 31)+((this.indicadorPrescricaoSV8 == null)? 0 :this.indicadorPrescricaoSV8 .hashCode()));
        result = ((result* 31)+((this.nomePFNInscricao == null)? 0 :this.nomePFNInscricao.hashCode()));
        result = ((result* 31)+((this.numeroProcessoJudicialNovo == null)? 0 :this.numeroProcessoJudicialNovo.hashCode()));
        result = ((result* 31)+((this.numeroInscricaoOriginal == null)? 0 :this.numeroInscricaoOriginal.hashCode()));
        result = ((result* 31)+((this.indicadorMoedaTotalInscrito == null)? 0 :this.indicadorMoedaTotalInscrito.hashCode()));
        result = ((result* 31)+((this.numeroProcessoJudicial == null)? 0 :this.numeroProcessoJudicial.hashCode()));
        result = ((result* 31)+((this.codigoOrgaoJustica == null)? 0 :this.codigoOrgaoJustica.hashCode()));
        result = ((result* 31)+((this.numeroJuizo == null)? 0 :this.numeroJuizo.hashCode()));
        result = ((result* 31)+((this.valorTotalConsolidadoMoeda == null)? 0 :this.valorTotalConsolidadoMoeda.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DividaAtiva) == false) {
            return false;
        }
        DividaAtiva rhs = ((DividaAtiva) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.dataFimProcurador == rhs.dataFimProcurador)||((this.dataFimProcurador!= null)&&this.dataFimProcurador.equals(rhs.dataFimProcurador)))&&((this.situacao == rhs.situacao)||((this.situacao!= null)&&this.situacao.equals(rhs.situacao))))&&((this.inscricao == rhs.inscricao)||((this.inscricao!= null)&&this.inscricao.equals(rhs.inscricao))))&&((this.indicadorProtImpedAjuiz == rhs.indicadorProtImpedAjuiz)||((this.indicadorProtImpedAjuiz!= null)&&this.indicadorProtImpedAjuiz.equals(rhs.indicadorProtImpedAjuiz))))&&((this.orgaoOrigem == rhs.orgaoOrigem)||((this.orgaoOrigem!= null)&&this.orgaoOrigem.equals(rhs.orgaoOrigem))))&&((this.dataDistribuicaoJudicial == rhs.dataDistribuicaoJudicial)||((this.dataDistribuicaoJudicial!= null)&&this.dataDistribuicaoJudicial.equals(rhs.dataDistribuicaoJudicial))))&&((this.codigoMunicipioSPU == rhs.codigoMunicipioSPU)||((this.codigoMunicipioSPU!= null)&&this.codigoMunicipioSPU.equals(rhs.codigoMunicipioSPU))))&&((this.numeroImovelITR == rhs.numeroImovelITR)||((this.numeroImovelITR!= null)&&this.numeroImovelITR.equals(rhs.numeroImovelITR))))&&((this.valorRemanescenteMoeda == rhs.valorRemanescenteMoeda)||((this.valorRemanescenteMoeda!= null)&&this.valorRemanescenteMoeda.equals(rhs.valorRemanescenteMoeda))))&&((this.motivoExtincaoInscricao == rhs.motivoExtincaoInscricao)||((this.motivoExtincaoInscricao!= null)&&this.motivoExtincaoInscricao.equals(rhs.motivoExtincaoInscricao))))&&((this.nomeOrgaoJustica == rhs.nomeOrgaoJustica)||((this.nomeOrgaoJustica!= null)&&this.nomeOrgaoJustica.equals(rhs.nomeOrgaoJustica))))&&((this.dataInscricao == rhs.dataInscricao)||((this.dataInscricao!= null)&&this.dataInscricao.equals(rhs.dataInscricao))))&&((this.nomeReceita == rhs.nomeReceita)||((this.nomeReceita!= null)&&this.nomeReceita.equals(rhs.nomeReceita))))&&((this.indicadorAnaliseOrgaoOrigem == rhs.indicadorAnaliseOrgaoOrigem)||((this.indicadorAnaliseOrgaoOrigem!= null)&&this.indicadorAnaliseOrgaoOrigem.equals(rhs.indicadorAnaliseOrgaoOrigem))))&&((this.valorTotalInscritoMoeda == rhs.valorTotalInscritoMoeda)||((this.valorTotalInscritoMoeda!= null)&&this.valorTotalInscritoMoeda.equals(rhs.valorTotalInscritoMoeda))))&&((this.numeroPFNInscricao == rhs.numeroPFNInscricao)||((this.numeroPFNInscricao!= null)&&this.numeroPFNInscricao.equals(rhs.numeroPFNInscricao))))&&((this.nomeNaturezaReceita == rhs.nomeNaturezaReceita)||((this.nomeNaturezaReceita!= null)&&this.nomeNaturezaReceita.equals(rhs.nomeNaturezaReceita))))&&((this.indicadorMoedaTotalRemanescente == rhs.indicadorMoedaTotalRemanescente)||((this.indicadorMoedaTotalRemanescente!= null)&&this.indicadorMoedaTotalRemanescente.equals(rhs.indicadorMoedaTotalRemanescente))))&&((this.nomePFNResponsavel == rhs.nomePFNResponsavel)||((this.nomePFNResponsavel!= null)&&this.nomePFNResponsavel.equals(rhs.nomePFNResponsavel))))&&((this.descricaoJuizo == rhs.descricaoJuizo)||((this.descricaoJuizo!= null)&&this.descricaoJuizo.equals(rhs.descricaoJuizo))))&&((this.codigoReceitaPrincipal == rhs.codigoReceitaPrincipal)||((this.codigoReceitaPrincipal!= null)&&this.codigoReceitaPrincipal.equals(rhs.codigoReceitaPrincipal))))&&((this.numeroRipSpu == rhs.numeroRipSpu)||((this.numeroRipSpu!= null)&&this.numeroRipSpu.equals(rhs.numeroRipSpu))))&&((this.dataDevolucaoProcesso == rhs.dataDevolucaoProcesso)||((this.dataDevolucaoProcesso!= null)&&this.dataDevolucaoProcesso.equals(rhs.dataDevolucaoProcesso))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.numeroAutoInfracao == rhs.numeroAutoInfracao)||((this.numeroAutoInfracao!= null)&&this.numeroAutoInfracao.equals(rhs.numeroAutoInfracao))))&&((this.numeroInscricaoDerivada2 == rhs.numeroInscricaoDerivada2)||((this.numeroInscricaoDerivada2 != null)&&this.numeroInscricaoDerivada2 .equals(rhs.numeroInscricaoDerivada2))))&&((this.numeroPFNResponsavel == rhs.numeroPFNResponsavel)||((this.numeroPFNResponsavel!= null)&&this.numeroPFNResponsavel.equals(rhs.numeroPFNResponsavel))))&&((this.numeroInscricaoDerivada1 == rhs.numeroInscricaoDerivada1)||((this.numeroInscricaoDerivada1 != null)&&this.numeroInscricaoDerivada1 .equals(rhs.numeroInscricaoDerivada1))))&&((this.numeroInscricaoDerivada4 == rhs.numeroInscricaoDerivada4)||((this.numeroInscricaoDerivada4 != null)&&this.numeroInscricaoDerivada4 .equals(rhs.numeroInscricaoDerivada4))))&&((this.numeroInscricaoDerivada3 == rhs.numeroInscricaoDerivada3)||((this.numeroInscricaoDerivada3 != null)&&this.numeroInscricaoDerivada3 .equals(rhs.numeroInscricaoDerivada3))))&&((this.numeroInscricaoDerivada6 == rhs.numeroInscricaoDerivada6)||((this.numeroInscricaoDerivada6 != null)&&this.numeroInscricaoDerivada6 .equals(rhs.numeroInscricaoDerivada6))))&&((this.numeroInscricaoDerivada5 == rhs.numeroInscricaoDerivada5)||((this.numeroInscricaoDerivada5 != null)&&this.numeroInscricaoDerivada5 .equals(rhs.numeroInscricaoDerivada5))))&&((this.codigoSerie == rhs.codigoSerie)||((this.codigoSerie!= null)&&this.codigoSerie.equals(rhs.codigoSerie))))&&((this.nomeSerie == rhs.nomeSerie)||((this.nomeSerie!= null)&&this.nomeSerie.equals(rhs.nomeSerie))))&&((this.numeroInscricaoDerivada7 == rhs.numeroInscricaoDerivada7)||((this.numeroInscricaoDerivada7 != null)&&this.numeroInscricaoDerivada7 .equals(rhs.numeroInscricaoDerivada7))))&&((this.codigoSistemaOrigem == rhs.codigoSistemaOrigem)||((this.codigoSistemaOrigem!= null)&&this.codigoSistemaOrigem.equals(rhs.codigoSistemaOrigem))))&&((this.dcomp == rhs.dcomp)||((this.dcomp!= null)&&this.dcomp.equals(rhs.dcomp))))&&((this.indicadorMoedaTotalConsolidado == rhs.indicadorMoedaTotalConsolidado)||((this.indicadorMoedaTotalConsolidado!= null)&&this.indicadorMoedaTotalConsolidado.equals(rhs.indicadorMoedaTotalConsolidado))))&&((this.motivoSuspensaoExigibilidade == rhs.motivoSuspensaoExigibilidade)||((this.motivoSuspensaoExigibilidade!= null)&&this.motivoSuspensaoExigibilidade.equals(rhs.motivoSuspensaoExigibilidade))))&&((this.numeroAgrupamento == rhs.numeroAgrupamento)||((this.numeroAgrupamento!= null)&&this.numeroAgrupamento.equals(rhs.numeroAgrupamento))))&&((this.dataProtocoloJudExecucao == rhs.dataProtocoloJudExecucao)||((this.dataProtocoloJudExecucao!= null)&&this.dataProtocoloJudExecucao.equals(rhs.dataProtocoloJudExecucao))))&&((this.dataExtincaoInscricao == rhs.dataExtincaoInscricao)||((this.dataExtincaoInscricao!= null)&&this.dataExtincaoInscricao.equals(rhs.dataExtincaoInscricao))))&&((this.descricaoNaoCalculado == rhs.descricaoNaoCalculado)||((this.descricaoNaoCalculado!= null)&&this.descricaoNaoCalculado.equals(rhs.descricaoNaoCalculado))))&&((this.codigoNaturezaReceita == rhs.codigoNaturezaReceita)||((this.codigoNaturezaReceita!= null)&&this.codigoNaturezaReceita.equals(rhs.codigoNaturezaReceita))))&&((this.descricaoSistemaOrigem == rhs.descricaoSistemaOrigem)||((this.descricaoSistemaOrigem!= null)&&this.descricaoSistemaOrigem.equals(rhs.descricaoSistemaOrigem))))&&((this.valorTotalInscritoIndex == rhs.valorTotalInscritoIndex)||((this.valorTotalInscritoIndex!= null)&&this.valorTotalInscritoIndex.equals(rhs.valorTotalInscritoIndex))))&&((this.valorRemanescenteIndex == rhs.valorRemanescenteIndex)||((this.valorRemanescenteIndex!= null)&&this.valorRemanescenteIndex.equals(rhs.valorRemanescenteIndex))))&&((this.processoAdministrativo == rhs.processoAdministrativo)||((this.processoAdministrativo!= null)&&this.processoAdministrativo.equals(rhs.processoAdministrativo))))&&((this.dataDecretacaoFalencia == rhs.dataDecretacaoFalencia)||((this.dataDecretacaoFalencia!= null)&&this.dataDecretacaoFalencia.equals(rhs.dataDecretacaoFalencia))))&&((this.indicadorPrescricaoSV8 == rhs.indicadorPrescricaoSV8)||((this.indicadorPrescricaoSV8 != null)&&this.indicadorPrescricaoSV8 .equals(rhs.indicadorPrescricaoSV8))))&&((this.nomePFNInscricao == rhs.nomePFNInscricao)||((this.nomePFNInscricao!= null)&&this.nomePFNInscricao.equals(rhs.nomePFNInscricao))))&&((this.numeroProcessoJudicialNovo == rhs.numeroProcessoJudicialNovo)||((this.numeroProcessoJudicialNovo!= null)&&this.numeroProcessoJudicialNovo.equals(rhs.numeroProcessoJudicialNovo))))&&((this.numeroInscricaoOriginal == rhs.numeroInscricaoOriginal)||((this.numeroInscricaoOriginal!= null)&&this.numeroInscricaoOriginal.equals(rhs.numeroInscricaoOriginal))))&&((this.indicadorMoedaTotalInscrito == rhs.indicadorMoedaTotalInscrito)||((this.indicadorMoedaTotalInscrito!= null)&&this.indicadorMoedaTotalInscrito.equals(rhs.indicadorMoedaTotalInscrito))))&&((this.numeroProcessoJudicial == rhs.numeroProcessoJudicial)||((this.numeroProcessoJudicial!= null)&&this.numeroProcessoJudicial.equals(rhs.numeroProcessoJudicial))))&&((this.codigoOrgaoJustica == rhs.codigoOrgaoJustica)||((this.codigoOrgaoJustica!= null)&&this.codigoOrgaoJustica.equals(rhs.codigoOrgaoJustica))))&&((this.numeroJuizo == rhs.numeroJuizo)||((this.numeroJuizo!= null)&&this.numeroJuizo.equals(rhs.numeroJuizo))))&&((this.valorTotalConsolidadoMoeda == rhs.valorTotalConsolidadoMoeda)||((this.valorTotalConsolidadoMoeda!= null)&&this.valorTotalConsolidadoMoeda.equals(rhs.valorTotalConsolidadoMoeda))));
    }

}
