package br.ufes.informatica.webhealth.core.controller;

import java.io.Serializable;

import javax.ejb.Local;

import br.ufes.informatica.webhealth.core.domain.Paciente;

/** TODO: generated by FrameWeb. Should be documented. */
@Local
public interface CadastroPacienteService extends Serializable {

	/** TODO: generated by FrameWeb. Should be documented. */
	public Boolean cadastrar(Paciente paciente);

}