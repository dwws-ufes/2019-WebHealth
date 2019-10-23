package br.ufes.informatica.webhealth.core.domain;

import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Ocorrencia.class)
public class Ocorrencia_ {
	public static volatile SingularAttribute<Ocorrencia, String> descricaoTratamento;
	public static volatile SingularAttribute<Ocorrencia, Doenca> doenca;
	public static volatile SingularAttribute<Ocorrencia, Paciente> paciente;
	public static volatile ListAttribute<Ocorrencia, Remedio> remedios;
	public static volatile ListAttribute<Ocorrencia, Sintoma> sintomas;
	

}