package br.ufes.informatica.webhealth.core.application;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.informatica.webhealth.core.domain.Doenca;
import br.ufes.informatica.webhealth.core.domain.Ocorrencia;
import br.ufes.informatica.webhealth.core.domain.Remedio;
import br.ufes.informatica.webhealth.core.domain.Sintoma;
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
	public List<Ocorrencia> filtrar(List<String> doencas, String cidade, List<Sintoma> sintomas, String estado, List<Remedio> remedios) {
		List<Ocorrencia>ocorrencias= ocorrenciaDAO.filtrar(doencas, cidade, estado);
		List<Ocorrencia> listaAux= new ArrayList();
		if(ocorrencias!=null) {
			for(Ocorrencia oc:ocorrencias) {
				for(Sintoma sint:oc.getSintomas()) {
					if(sintomas.contains(sint)) {
						listaAux.add(oc);
					}
				}
			}
			for(Ocorrencia oc:listaAux) {
				for(Remedio sint:oc.getRemedios()) {
					if(!remedios.contains(sint)) {
						listaAux.remove(oc);
					}
				}
			}
		}
		return listaAux;
	}

}