package br.ufes.informatica.webhealth.core.controller;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.informatica.webhealth.core.persistence.PacienteDAO;

/** TODO: generated by FrameWeb. Should be documented. */
@Stateless
public class LoginServiceBean implements LoginService {
	/** Serialization id (using default value, change if necessary). */
	private static final long serialVersionUID = 1L;
	
	
	/** TODO: generated by FrameWeb. Should be documented. */
	@EJB
	private PacienteDAO pacienteDAO;
	
	
	

	
	
	
	/** TODO: generated by FrameWeb. Should be documented. */
	@Override
	public void realizarLogin(String login, String Senha) {
		// FIXME: auto-generated method stub
		return;
	}
	
}