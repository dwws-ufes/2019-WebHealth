package br.ufes.informatica.webhealth.core.application;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudException;
import br.ufes.inf.nemo.jbutler.ejb.application.CrudServiceBean;
import br.ufes.inf.nemo.jbutler.ejb.application.filters.Filter;
import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.informatica.webhealth.core.domain.Ocorrencia;
import br.ufes.informatica.webhealth.core.domain.Paciente;
import br.ufes.informatica.webhealth.core.persistence.OcorrenciaDAO;

/** TODO: generated by FrameWeb. Should be documented. */
@Stateless
public class CadastroOcorrenciaServiceBean extends CrudServiceBean<Ocorrencia> implements CadastroOcorrenciaService {
	/** Serialization id (using default value, change if necessary). */
	private static final long serialVersionUID = 1L;

	/** TODO: generated by FrameWeb. Should be documented. */
	@EJB
	private OcorrenciaDAO ocorrenciaDAO;

	/** TODO: generated by FrameWeb. Should be documented. */
	@Override
	public Boolean salvaOcorrencia(Ocorrencia ocorrencia) {
		// FIXME: auto-generated method stub
		return null;
	}

	@Override
	public void validateCreate(Ocorrencia entity) throws CrudException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateUpdate(Ocorrencia entity) throws CrudException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateDelete(Ocorrencia entity) throws CrudException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Ocorrencia entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ocorrencia retrieve(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Ocorrencia entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Ocorrencia entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BaseDAO<Ocorrencia> getDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void authorize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long countFiltered(Filter<?> filterType, String filter) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Ocorrencia> list(int... interval) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ocorrencia> filter(Filter<?> filter, String filterParam, int... interval) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ocorrencia fetchLazy(Ocorrencia entity) {
		// TODO Auto-generated method stub
		return null;
	}

}