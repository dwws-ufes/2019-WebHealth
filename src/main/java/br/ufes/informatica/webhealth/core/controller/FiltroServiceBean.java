package br.ufes.informatica.webhealth.core.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.informatica.webhealth.core.domain.Doenca;
import br.ufes.informatica.webhealth.core.persistence.OcorrenciaDAO;

/** TODO: generated by FrameWeb. Should be documented. */
@Stateless
public class FiltroServiceBean implements FiltroService {
	/** Serialization id (using default value, change if necessary). */
	private static final long serialVersionUID = 1L;

	/** TODO: generated by FrameWeb. Should be documented. */
	@EJB
	private OcorrenciaDAO ocorrenciaDAO;

	/** TODO: generated by FrameWeb. Should be documented. */
	@Override
	public List filtrar(List<Doenca> doencas, String cidade, List<String> sintomas, String estado, List<String> remedios) {
		// FIXME: auto-generated method stub
		return null;
	}

}