package br.com.escola.models;

import java.util.List;
import java.util.Scanner;

public class Portal {
	Scanner scan = new Scanner(System.in);

	public static void portalDeTurmas(List<Turma> listaDeTurmas, List<Aluno> listaDeAlunos, List<Professor> listaDeProfessores) {
		Scanner scan = new Scanner(System.in);
		int opcaoMenuTurmas;
		do {
			Telas.printaMenuTurma();
			opcaoMenuTurmas = scan.nextInt();
			scan.nextLine();

			if (opcaoMenuTurmas == 2) {
				System.out.println("Nome da Turma: ");
				String nomeDaTurma;
				nomeDaTurma = scan.nextLine();
				listaDeTurmas.add(new Turma(nomeDaTurma));
				
			} else if (opcaoMenuTurmas == 3) {
				int index = 0;
				System.out.println("Mostrando as turmas:");
				for (Turma turma : listaDeTurmas) {
					turma.printaComIndex(index);
					index++;
				}

			} else if (opcaoMenuTurmas == 4) {
				int indexTurmaEscolhida;
				System.out.print("Turma: ");
				indexTurmaEscolhida = scan.nextInt();
				scan.nextLine();
				
				Turma turmaEscolhida = null;
				try {
					turmaEscolhida = listaDeTurmas.get(indexTurmaEscolhida);					
				} catch (Exception e) {
					System.out.println("Turma inválida");
					break;
				}
				
				System.out.println("Alunos disponíveis(não matriculados em nenhuma turma):");
				int index = 0;
				for (Aluno aluno : listaDeAlunos) {
					if (!aluno.getEstadoDaMatricula()) {
						aluno.printaComIndex(index);
					}
					index++;
				}

				System.out.print("Aluno escolhido: ");
				int indexAlunoEscolhido;
				indexAlunoEscolhido = scan.nextInt();
				scan.nextLine();

				try {
					turmaEscolhida.adicionarAluno(listaDeAlunos.get(indexAlunoEscolhido));
				} catch (Exception e) {
					System.out.println("ERRO! Aluno inválido");
				}

			} else if (opcaoMenuTurmas == 5) {
				int indexTurmaEscolhida;
				System.out.print("Turma: ");
				indexTurmaEscolhida = scan.nextInt();
				scan.nextLine();

				Turma turmaEscolhida = null;
				try {
					turmaEscolhida = listaDeTurmas.get(indexTurmaEscolhida);					
				} catch (Exception e) {
					System.out.println("Turma inválida");
					break;
				}

				if (turmaEscolhida.getAlunos().size() == 0 ) {
					System.out.println("Nenhum aluno nessa turma");
					break;
				}
				
				System.out.printf("Alunos na turma %s: \n", turmaEscolhida.getNome());
				int index = 0;
				for (Aluno aluno : turmaEscolhida.getAlunos()) {
					aluno.printaComIndex(index);
					index++;
				}

				System.out.print("Remover Aluno: ");
				int indexAlunoParaSerRemovido;
				indexAlunoParaSerRemovido = scan.nextInt();
				scan.nextLine();
				try {
					Aluno alunoParaSerRemovido = listaDeAlunos.get(indexAlunoParaSerRemovido);
					turmaEscolhida.removerAluno(alunoParaSerRemovido);
				} catch (Exception e) {
					System.out.println("ERRO! Aluno inválido");
					
				}


			} else if (opcaoMenuTurmas == 6) {
				int indexTurmaEscolhida;
				System.out.print("Turma: ");
				indexTurmaEscolhida = scan.nextInt();
				scan.nextLine();

				Turma turmaEscolhida = null;
				try {
					turmaEscolhida = listaDeTurmas.get(indexTurmaEscolhida);					
				} catch (Exception e) {
					System.out.println("Turma inválida");
					break;
				}
				
				System.out.println("Professores disponíveis:");
				int index = 0;
				for (Professor professor : listaDeProfessores) {
					if (!turmaEscolhida.getProfessores().contains(professor))
						professor.printaComIndex(index);
					index++;
				}

				System.out.print("Professor escolhido: ");
				int indexProfessorEscolhido;
				indexProfessorEscolhido = scan.nextInt();
				scan.nextLine();

				try {
					turmaEscolhida.adicionarProfessor(listaDeProfessores.get(indexProfessorEscolhido));
				} catch (Exception e) {
					System.out.println("ERRO! Professor inválido");
				}

			} else if (opcaoMenuTurmas == 7) {
				int indexTurmaEscolhida;
				System.out.print("Turma: ");
				indexTurmaEscolhida = scan.nextInt();
				scan.nextLine();

				Turma turmaEscolhida = null;
				try {
					turmaEscolhida = listaDeTurmas.get(indexTurmaEscolhida);					
				} catch (Exception e) {
					System.out.println("Turma inválida");
					break;
				}
				
				if (turmaEscolhida.getProfessores().size() == 0 ) {
					System.out.println("Nenhum professor nessa turma");
					break;
				}


				System.out.printf("Professores na turma %s: \n", turmaEscolhida.getNome());
				int index = 0;
				for (Professor professor : turmaEscolhida.getProfessores()) {
					professor.printaComIndex(index);
					index++;
				}

				System.out.print("Remover Professor: ");
				int indexProfessorParaSerRemovido;
				indexProfessorParaSerRemovido = scan.nextInt();
				scan.nextLine();

				try {
					Professor ProfessorParaSerRemovido = listaDeProfessores.get(indexProfessorParaSerRemovido);
					turmaEscolhida.removerProfessor(ProfessorParaSerRemovido);
				} catch (Exception e) {
					System.out.println("ERRO! Professor inválido");
				}

			} else if (opcaoMenuTurmas == 8) {
				int indexTurmaEscolhida;
				System.out.print("Turma: ");
				indexTurmaEscolhida = scan.nextInt();
				scan.nextLine();
				
				Turma turmaEscolhida = null;
				try {
					turmaEscolhida = listaDeTurmas.get(indexTurmaEscolhida);					
				} catch (Exception e) {
					System.out.println("Turma inválida");
					break;
				}
				turmaEscolhida.inspecionarTurma();
			}

		} while (opcaoMenuTurmas != 1);

	}

	public static void portalDeAlunos(List<Turma> listaDeTurmas, List<Aluno> listaDeAlunos, List<Professor> listaDeProfessores) {
		Scanner scan = new Scanner(System.in);
		int opcaoMenuAlunos;
		do {
			Telas.printaMenuAluno();
			opcaoMenuAlunos = scan.nextInt();
			scan.nextLine();

			if (opcaoMenuAlunos == 2) {
				System.out.println("Nome do Aluno: ");
				String nome = scan.nextLine();
				listaDeAlunos.add(new Aluno(nome));
			} else if (opcaoMenuAlunos == 3) {
				int index;
				System.out.print("Digite o índice do aluno que deseja excluir: ");
				index = scan.nextInt();
				scan.nextLine();
				listaDeAlunos.remove(index);

			} else if (opcaoMenuAlunos == 4) {
				if (listaDeAlunos.isEmpty()) {
					System.out.println("Nenhum aluno cadastrado!");
				} else {
					int index = 0;
					System.out.println("Mostrando os alunos:");
					for (Aluno aluno : listaDeAlunos) {
						aluno.printaComIndex(index);
						index++;
					}
				}
			}
		} while (opcaoMenuAlunos != 1);

	}

	public static void portalDeProfessores(List<Turma> listaDeTurmas, List<Aluno> listaDeAlunos,List<Professor> listaDeProfessores) {
		Scanner scan = new Scanner(System.in);
		int opcaoMenuProfessores;

		do {
			Telas.printaMenuProfessor();
			opcaoMenuProfessores = scan.nextInt();
			scan.nextLine();

			if (opcaoMenuProfessores == 2) {
				System.out.println("Nome do Professor: ");
				String nome = scan.nextLine();
				System.out.println("Matéria do Professor: ");
				String materia = scan.nextLine();

				listaDeProfessores.add(new Professor(nome, materia));

			} else if (opcaoMenuProfessores == 3) {
				int index;
				System.out.print("Digite o índice do professor que deseja excluir: ");
				index = scan.nextInt();
				scan.nextLine();
				listaDeProfessores.remove(index);

			} else if (opcaoMenuProfessores == 4) {
				if (listaDeProfessores.isEmpty()) {
					System.out.println("Nenhum professor cadastrado!");

				} else {
					int index = 0;
					System.out.println("Mostrando os professores:");
					for (Professor professor : listaDeProfessores) {
						professor.printaComIndex(index);
						index++;
					}

				}
			}

		} while (opcaoMenuProfessores != 1);

	}
}
