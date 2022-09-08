package br.com.escola.models;

public class Aluno extends PertencenteEscola {
	private String nome;
	private boolean estadoDaMatricula;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean getEstadoDaMatricula() {
		return estadoDaMatricula;
	}
	
	public void matricula() {
		this.estadoDaMatricula = !(this.estadoDaMatricula);
	}
	
	public String toString() {
		return this.nome;
	}	
}
