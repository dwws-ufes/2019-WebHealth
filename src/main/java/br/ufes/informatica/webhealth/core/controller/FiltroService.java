package br.ufes.informatica.webhealth.core.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Local;

import br.ufes.informatica.webhealth.core.domain.Doenca;
import br.ufes.informatica.webhealth.core.domain.Ocorrencia;

/** TODO: generated by FrameWeb. Should be documented. */
@Local
public interface FiltroService extends Serializable {

	/** TODO: generated by FrameWeb. Should be documented. */
	public List<Ocorrencia> filtrar(List<Doenca> doencas, String cidade, List<String> sintomas, String estado, List<String> remedios);

}