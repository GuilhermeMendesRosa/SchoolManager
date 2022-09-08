package br.com.escola.models;

public class Professor extends PertencenteEscola {
	private String nome;
	private String materia;
	
	public Professor(String nome, String materia) {
		this.nome = nome;
		this.materia = materia;
	}

	public String getNome() {
		return this.nome;
	}

	public String getMateria() {
		return this.materia;
	}
	
	public String toString() {
		return String.format("%s - %s", nome, materia);
	}
}
