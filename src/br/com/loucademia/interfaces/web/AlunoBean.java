package br.com.loucademia.interfaces.web;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.loucademia.domain.aluno.Aluno;

@Named
@RequestScoped //Faz com que o objeto s� exista no tempo de submiss�o
public class AlunoBean implements Serializable{

	private Aluno aluno = new Aluno();
	
	public String gravar() {
		System.err.println("ALUNO ==>" + aluno);
		return null;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	

}
