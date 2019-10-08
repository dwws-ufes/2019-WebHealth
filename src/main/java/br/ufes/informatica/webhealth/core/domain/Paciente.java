package br.ufes.informatica.webhealth.core.domain;

import java.util.*;
import java.math.*;
import javax.persistence.*;
import javax.validation.constraints.*;
import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

/** TODO: generated by FrameWeb. Should be documented. */
@Entity
public class Paciente extends PersistentObjectSupport implements Comparable<Paciente> {
	/** Serialization id. */
	private static final long serialVersionUID = 1L;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	@Size(max = 50)
	private String nome;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private Long idPaciente;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	@Size(max = 30)
	private String sexo;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	@Size(max = 200)
	private String endereco;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	@Size(max = 30)
	private String cidade;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	@Size(max = 30)
	private String estado;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	@Size(max = 20)
	private String login;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	@Size(max = 10)
	private String senha;

	/** TODO: generated by FrameWeb. Should be documented. */
	@OneToMany(mappedBy = "paciente")
	private Set<Ocorrencia> ocorrencias;

	/** Getter for nome. */
	public String getNome() {
		return nome;
	}

	/** Setter for nome. */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/** Getter for idPaciente. */
	public Long getIdPaciente() {
		return idPaciente;
	}

	/** Setter for idPaciente. */
	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	/** Getter for sexo. */
	public String getSexo() {
		return sexo;
	}

	/** Setter for sexo. */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/** Getter for endereco. */
	public String getEndereco() {
		return endereco;
	}

	/** Setter for endereco. */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	/** Getter for login. */
	public String getLogin() {
		return login;
	}

	/** Setter for login. */
	public void setLogin(String login) {
		this.login = login;
	}

	/** Getter for senha. */
	public String getSenha() {
		return senha;
	}

	/** Setter for senha. */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/** Getter for Target. */
	public Set<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}

	/** Setter for Target. */
	public void setTarget(Set<Ocorrencia> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	/** @see java.lang.Comparable#compareTo(java.lang.Object) */
	@Override
	public int compareTo(Paciente o) {
		// FIXME: auto-generated method stub
		return super.compareTo(o);
	}
}