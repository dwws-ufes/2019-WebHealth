package br.ufes.informatica.webhealth.core.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.inject.*;

import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.PieChartModel;

import br.ufes.inf.nemo.jbutler.ejb.controller.JSFController;
import br.ufes.informatica.webhealth.core.application.FiltroService;
import br.ufes.informatica.webhealth.core.domain.Doenca;
import br.ufes.informatica.webhealth.core.domain.Ocorrencia;
import br.ufes.informatica.webhealth.core.domain.Remedio;
import br.ufes.informatica.webhealth.core.domain.Sintoma;

/** TODO: generated by FrameWeb. Should be documented. */
@Model
public class DashboardController extends JSFController {
	/** Serialization id (using default value, change if necessary). */
	private static final long serialVersionUID = 1L;

	
	/** TODO: generated by FrameWeb. Should be documented. */
	@EJB
	private FiltroService filtroService;
	

	
	/** TODO: generated by FrameWeb. Should be documented. */
	private List<Doenca> doencas;
	
	/** TODO: generated by FrameWeb. Should be documented. */
	private List<Sintoma> sintomas;
	
	/** TODO: generated by FrameWeb. Should be documented. */
	private List<Remedio> remedios;
	
	/** TODO: generated by FrameWeb. Should be documented. */
	private String cidade;
	
	/** TODO: generated by FrameWeb. Should be documented. */
	private String estado;
	
	/** TODO: generated by FrameWeb. Should be documented. */
	private String nomeDoenca;
	
	/** TODO: generated by FrameWeb. Should be documented. */
	private BarChartModel sintomasChart;
	
	/** TODO: generated by FrameWeb. Should be documented. */
	private LineChartModel  tratamentoChart;
	
	/** TODO: generated by FrameWeb. Should be documented. */
	private PieChartModel remediosChart;
	
	@PostConstruct
    public void init() {
        criaCharts();
    }
	
	/** TODO: generated by FrameWeb. Should be documented. */
	public void filtrar() {
		List<String> listaNomeDoenca=doencas.stream().map(d-> d.getNomeDoenca()).collect(Collectors.toList());
		List<Ocorrencia> ocorrencias=filtroService.filtrar(listaNomeDoenca, cidade, sintomas, estado, remedios);
		criaCharts();
	}
	
	/** TODO: generated by FrameWeb. Should be documented. */
	public void criaCharts() {
        this.tratamentoChart = new LineChartModel();
        this.remediosChart= new PieChartModel();
        this.sintomasChart= new BarChartModel();
		return;
	}
	
	
	
	/** Getter for doencas. */
	public List<Doenca> getDoencas() {
		return doencas;
	}

	/** Setter for doencas. */
	public void setDoencas(List<Doenca> doencas) {
		this.doencas = doencas;
	}
	
	/** Getter for sintomas. */
	public List<Sintoma> getSintomas() {
		return sintomas;
	}

	/** Setter for sintomas. */
	public void setSintomas(List<Sintoma> sintomas) {
		this.sintomas = sintomas;
	}
	
	/** Getter for remedios. */
	public List<Remedio> getRemedios() {
		return remedios;
	}

	/** Setter for remedios. */
	public void setRemedios(List remedios) {
		this.remedios = remedios;
	}
	
	/** Getter for cidade. */
	public String getCidade() {
		return cidade;
	}

	/** Setter for cidade. */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	/** Getter for estado. */
	public String getEstado() {
		return estado;
	}

	/** Setter for estado. */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	/** Getter for nomeDoenca. */
	public String getNomeDoenca() {
		return nomeDoenca;
	}

	/** Setter for nomeDoenca. */
	public void setNomeDoenca(String nomeDoenca) {
		this.nomeDoenca = nomeDoenca;
	}
	
	/** Getter for sintomasChart. */
	public BarChartModel getSintomasChart() {
		return sintomasChart;
	}

	/** Setter for sintomasChart. */
	public void setSintomasChart(BarChartModel sintomasChart) {
		this.sintomasChart = sintomasChart;
	}
	
	/** Getter for tratamentoChart. */
	public LineChartModel getTratamentoChart() {
		return tratamentoChart;
	}

	/** Setter for tratamentoChart. */
	public void setTratamentoChart(LineChartModel tratamentoChart) {
		this.tratamentoChart = tratamentoChart;
	}
	
	/** Getter for remediosChart. */
	public PieChartModel getRemediosChart() {
		return remediosChart;
	}

	/** Setter for remediosChart. */
	public void setRemediosChart(PieChartModel remediosChart) {
		this.remediosChart = remediosChart;
	}
	
}