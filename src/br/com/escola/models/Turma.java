package br.com.escola.models;

import java.util.ArrayList;
import java.util.List;

public class Turma extends PertencenteEscola {
	private int id;
	private String nome;
	private List<Professor> professores = new ArrayList<Professor>();
	private List<Aluno> alunos = new ArrayList<Aluno>();

	public Turma(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void mostrarAlunos() {
		int index = 0;
		System.out.printf("Listando alunos na turma %s:\n", nome);
		for (Aluno aluno : alunos) {
			System.out.printf("[%d] - ", index);
			System.out.println(aluno.getNome());
			index++;
		}

	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
		aluno.matricula();
	}

	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
		aluno.matricula();

	}

	public void adicionarProfessor(Professor professor) {
		if (!professores.contains(professor)) {
			professores.add(professor);
			
		} else {
			System.out.println("Professor já cadastrado!");
		}
	}

	public void removerProfessor(Professor professor) {
		professores.remove(professor);	
	}

	public void mostrarProfessores() {

		int index = 0;
		System.out.printf("Listando professores da turma %s:\n", nome);
		for (Professor professor : professores) {
			System.out.printf("[%d] - %s - %s\n", index, professor.getNome(), professor.getMateria());
			index++;
		}		
	}
	
	public void inspecionarTurma() {

		System.out.println("-----------------------------");
		System.out.printf("\nTurma: %s\n", nome);
		System.out.println("\nProfessores:");
		professores.forEach(professor -> {
			System.out.println(professor.toString());
		});
		System.out.println("\nAlunos:");
		alunos.forEach(aluno -> {
			System.out.println(aluno.getNome());
		});
		System.out.println("-----------------------------");
		
		
	}
	
	public String toString() {
		return this.nome;
	}
}
