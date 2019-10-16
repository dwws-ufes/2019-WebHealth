package br.ufes.informatica.webhealth.core.domain;

import java.util.Set;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Paciente.class)
public class Paciente_ {
	public static volatile SingularAttribute<Paciente, String> nome;
	public static volatile SingularAttribute<Paciente, String> sexo;
	public static volatile SingularAttribute<Paciente, String> endereco;
	public static volatile SingularAttribute<Paciente, String> cidade;
	public static volatile SingularAttribute<Paciente, String> estado;
	public static volatile SingularAttribute<Paciente, String> login;
	public static volatile SingularAttribute<Paciente, String> senha;
	public static volatile SingularAttribute<Paciente, Set<Ocorrencia>> ocorrencias;

	
}