package br.ufes.informatica.webhealth.core.application;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.informatica.webhealth.core.domain.Ocorrencia;
import br.ufes.informatica.webhealth.core.persistence.OcorrenciaDAO;

/** TODO: generated by FrameWeb. Should be documented. */
@Stateless
public class CadastroOcorrenciaServiceBean implements CadastroOcorrenciaService {
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

}