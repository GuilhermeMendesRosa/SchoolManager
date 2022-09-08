package br.com.escola.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.escola.models.*;

public class Main {
	public static void main(String[] args) {
		int opcaoMenu;
		Scanner scan = new Scanner(System.in);

		List<Turma> listaDeTurmas = new ArrayList<Turma>();
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
		List<Professor> listaDeProfessores = new ArrayList<Professor>();
		
		//Criando algumas turmas 
		
		listaDeTurmas.add(new Turma("1º ano"));
		listaDeTurmas.add(new Turma("2º ano"));
		listaDeTurmas.add(new Turma("3º ano"));
		
		//Criandp alguns alunos
		
		listaDeAlunos.add(new Aluno("Guilheme"));
		listaDeAlunos.add(new Aluno("Luan"));
		listaDeAlunos.add(new Aluno("João"));
		listaDeAlunos.add(new Aluno("Maria"));
		listaDeAlunos.add(new Aluno("Renato"));
		listaDeAlunos.add(new Aluno("Mariana"));
		
		//Criando alguns professores
		
		listaDeProfessores.add(new Professor("Selner", "Análise de Sistemas"));
		listaDeProfessores.add(new Professor("Valmor", "Orientação a objeto"));
		listaDeProfessores.add(new Professor("Rui", "Estrutura de Dados"));
		listaDeProfessores.add(new Professor("Rafaella", "Cálculo"));	
		

		do {
			Telas.printaTelaPrincipal();
			opcaoMenu = scan.nextInt();
			scan.nextLine();

			if (opcaoMenu == 2) {
				Portal.portalDeTurmas(listaDeTurmas, listaDeAlunos, listaDeProfessores);
			} else if (opcaoMenu == 3) {
				Portal.portalDeAlunos(listaDeTurmas, listaDeAlunos, listaDeProfessores);
			} else if (opcaoMenu == 4) {
				Portal.portalDeProfessores(listaDeTurmas, listaDeAlunos, listaDeProfessores);
			}

		} while (opcaoMenu != 1);
	}

}