package br.ufes.informatica.webhealth.core.persistence;

import javax.ejb.Local;

import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.informatica.webhealth.core.domain.Paciente;

/** TODO: generated by FrameWeb. Should be documented. */
@Local
public interface PacienteDAO extends BaseDAO<Paciente> {

	public Boolean realizarLogin();

}