package br.ufes.informatica.webhealth.core.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;

import br.ufes.informatica.webhealth.core.domain.Remedio;
import br.ufes.informatica.webhealth.core.domain.Doenca;
import br.ufes.informatica.webhealth.core.domain.Ocorrencia;
import br.ufes.informatica.webhealth.core.domain.Sintoma;
import br.ufes.informatica.webhealth.core.persistence.DoencaDAO;
import br.ufes.informatica.webhealth.core.persistence.OcorrenciaDAO;


@WebServlet(urlPatterns = { "/data/Ocorrencia" })
public class ProduceOcorrenciaInRdfServlet extends HttpServlet {
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	@EJB
	private OcorrenciaDAO ocorrenciaDAO;

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduceOcorrenciaInRdfServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml");
		
		List<Ocorrencia> ocorrencias = ocorrenciaDAO.retrieveAll();
		
		
		
		Model model = ModelFactory.createDefaultModel();
		String myNS = "http://localhost:8080/webhealth/data/Ocorrencia/";
		String healthOntologyNS = "http://webhealthontology.orgfree.com/HealthOntology.owl";
		model.setNsPrefix("ho", healthOntologyNS);
		Resource ocorrencia = ResourceFactory.createResource(healthOntologyNS + "Occurency");
		Resource doenca = ResourceFactory.createResource(healthOntologyNS + "Disease");
		Resource sintoma = ResourceFactory.createResource(healthOntologyNS + "Sympthon");
		Resource paciente = ResourceFactory.createResource(healthOntologyNS + "Patient");
		Resource remedio = ResourceFactory.createResource(healthOntologyNS + "Medicine");
		
		Property hasSymptom = ResourceFactory.createProperty(healthOntologyNS + "hasSymptom");
		Property hasPatient = ResourceFactory.createProperty(healthOntologyNS + "hasPatient");
		Property hasMedicine = ResourceFactory.createProperty(healthOntologyNS + "hasMedicine");
		Property hasDisease = ResourceFactory.createProperty(healthOntologyNS + "hasDisease");
		List<Statement> modelListSyptom =new ArrayList();
		for (Ocorrencia oc : ocorrencias) {
			Resource ocor = model.createResource(myNS + oc.getId())
			.addProperty(RDF.type, ocorrencia)
			.addProperty(RDFS.label, oc.getId().toString())
			.addProperty(hasDisease, model.createResource()
					.addProperty(RDF.type, doenca)
					.addProperty(RDFS.label, oc.getDoenca().getNomeDoenca()))
			.addProperty(hasPatient, model.createResource()
					.addProperty(RDF.type, paciente)
					.addProperty(RDFS.label, oc.getPaciente().getNome()));
			// Model de sintomas
			for(Sintoma sint:oc.getSintomas()) {
				Resource modelSint = model.createResource();
				modelSint.addProperty(RDF.type, sintoma);
				modelSint.addProperty(RDFS.label, sint.getDescricaoSintoma());
				model.add(ocor, hasSymptom, modelSint);
			}
			
			// Model de Remedios
			for(Remedio rem:oc.getRemedios()) {
				Resource modelRem = model.createResource();
				modelRem.addProperty(RDF.type, remedio);
				modelRem.addProperty(RDFS.label, rem.getNomeRemedio());
				model.add(ocor, hasMedicine, modelRem);
			}
			
			//System.out.println("Added TourPackage/" + pack.getId() + " to the RDF model");
		}
		
		try (PrintWriter out = response.getWriter()) {
			model.write(out, "RDF/XML");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
