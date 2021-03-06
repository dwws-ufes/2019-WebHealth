package br.ufes.informatica.webhealth.core.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

/** TODO: generated by FrameWeb. Should be documented. */
@Entity
public class Ocorrencia extends PersistentObjectSupport implements Comparable<Ocorrencia> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;

	/** TODO: generated by FrameWeb. Should be documented. */
	@NotNull
	private String descricaoTratamento;

	/** TODO: generated by FrameWeb. Should be documented. */
	@NotNull
	private Doenca doenca;

	/** TODO: generated by FrameWeb. Should be documented. */
	@NotNull
	private List remedios;

	/** TODO: generated by FrameWeb. Should be documented. */
	@NotNull
	private Long idOcorrencia;

	/** TODO: generated by FrameWeb. Should be documented. */
	@NotNull
	private List sintomas;

	/** Getter for descricaoTratamento. */
	public String getDescricaoTratamento() {
		return descricaoTratamento;
	}

	/** Setter for descricaoTratamento. */
	public void setDescricaoTratamento(String descricaoTratamento) {
		this.descricaoTratamento = descricaoTratamento;
	}

	/** Getter for doenca. */
	public Doenca getDoenca() {
		return doenca;
	}

	/** Setter for doenca. */
	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}

	/** Getter for remedios. */
	public List getRemedios() {
		return remedios;
	}

	/** Setter for remedios. */
	public void setRemedios(List remedios) {
		this.remedios = remedios;
	}

	/** Getter for idOcorrencia. */
	public Long getIdOcorrencia() {
		return idOcorrencia;
	}

	/** Setter for idOcorrencia. */
	public void setIdOcorrencia(Long idOcorrencia) {
		this.idOcorrencia = idOcorrencia;
	}

	/** Getter for sintomas. */
	public List getSintomas() {
		return sintomas;
	}

	/** Setter for sintomas. */
	public void setSintomas(List sintomas) {
		this.sintomas = sintomas;
	}

	/** @see java.lang.Comparable#compareTo(java.lang.Object) */
	@Override
	public int compareTo(Ocorrencia o) {
		// FIXME: auto-generated method stub
		return super.compareTo(o);
	}
}