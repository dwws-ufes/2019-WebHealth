package br.ufes.informatica.webhealth.core.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

/** TODO: generated by FrameWeb. Should be documented. */
@Entity
public class Doenca extends PersistentObjectSupport implements Comparable<Doenca> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;

	/** TODO: generated by FrameWeb. Should be documented. */
	@NotNull
	private String nomeDoenca;

	/** TODO: generated by FrameWeb. Should be documented. */
	@NotNull
	private Long idDoenca;

	/** Getter for nomeDoenca. */
	public String getNomeDoenca() {
		return nomeDoenca;
	}

	/** Setter for nomeDoenca. */
	public void setNomeDoenca(String nomeDoenca) {
		this.nomeDoenca = nomeDoenca;
	}

	/** Getter for idDoenca. */
	public Long getIdDoenca() {
		return idDoenca;
	}

	/** Setter for idDoenca. */
	public void setIdDoenca(Long idDoenca) {
		this.idDoenca = idDoenca;
	}

	/** @see java.lang.Comparable#compareTo(java.lang.Object) */
	@Override
	public int compareTo(Doenca o) {
		// FIXME: auto-generated method stub
		return super.compareTo(o);
	}
}