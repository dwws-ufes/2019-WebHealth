package br.ufes.informatica.webhealth.core.application;

import javax.annotation.security.PermitAll;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudServiceBean;
import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.informatica.webhealth.core.domain.Paciente;
import br.ufes.informatica.webhealth.core.persistence.PacienteDAO;

@Stateless @PermitAll
public class CadastroPacienteServiceBean extends CrudServiceBean<Paciente> implements CadastroPacienteService {
		private static final long serialVersionUID = 1L;
		
		@EJB
		private PacienteDAO pacienteDAO;
		
		@Override
		public BaseDAO<Paciente> getDAO() {
				return pacienteDAO;
		}
}