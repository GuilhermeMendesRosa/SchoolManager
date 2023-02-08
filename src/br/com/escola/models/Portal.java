package br.com.escola.models;

import java.util.List;
import java.util.Scanner;

public class Portal {

    public static void classPortal(List<Class> classList, List<Student> studentList, List<Teacher> teacherList) {
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            Screen.classMenu();
            option = scan.nextInt();
            scan.nextLine();

            if (option == 2) {
                System.out.println("Nome da Turma: ");
                String className = scan.nextLine();
                classList.add(new Class(className));

            } else if (option == 3) {
                System.out.println("Mostrando as turmas:");
                int index = 0;
                for (Class aClass : classList) {
                    aClass.printWithIndex(index);
                    index++;
                }

            } else if (option == 4) {
                int classIndex;
                System.out.print("Turma: ");
                classIndex = scan.nextInt();
                scan.nextLine();

                Class selectedClass = null;
                try {
                    selectedClass = classList.get(classIndex);
                } catch (Exception e) {
                    System.out.println("Turma inválida");
                    break;
                }

                System.out.println("Alunos disponíveis(não matriculados em nenhuma turma):");
                int index = 0;
                for (Student student : studentList) {
                    if (!student.getEnrolled()) {
                        student.printWithIndex(index);
                    }
                    index++;
                }

                System.out.print("Aluno escolhido: ");
                int selectedStudentIndex = scan.nextInt();
                scan.nextLine();

                try {
                    selectedClass.addStudent(studentList.get(selectedStudentIndex));
                } catch (Exception e) {
                    System.out.println("ERRO! Aluno inválido");
                }

            } else if (option == 5) {
                int selectedClassIndex;
                System.out.print("Turma: ");
                selectedClassIndex = scan.nextInt();
                scan.nextLine();

                Class classEscolhida = null;
                try {
                    classEscolhida = classList.get(selectedClassIndex);
                } catch (Exception e) {
                    System.out.println("Turma inválida");
                    break;
                }

                if (classEscolhida.getAlunos().size() == 0) {
                    System.out.println("Nenhum aluno nessa turma");
                    break;
                }

                System.out.printf("Alunos na turma %s: \n", classEscolhida.getName());
                int index = 0;
                for (Student student : classEscolhida.getAlunos()) {
                    student.printWithIndex(index);
                    index++;
                }

                System.out.print("Remover Aluno: ");
                int indexAlunoParaSerRemovido;
                indexAlunoParaSerRemovido = scan.nextInt();
                scan.nextLine();
                try {
                    Student studentParaSerRemovido = studentList.get(indexAlunoParaSerRemovido);
                    classEscolhida.removeStudent(studentParaSerRemovido);
                } catch (Exception e) {
                    System.out.println("ERRO! Aluno inválido");

                }

            } else if (option == 6) {
                int indexTurmaEscolhida;
                System.out.print("Turma: ");
                indexTurmaEscolhida = scan.nextInt();
                scan.nextLine();

                Class classEscolhida = null;
                try {
                    classEscolhida = classList.get(indexTurmaEscolhida);
                } catch (Exception e) {
                    System.out.println("Turma inválida");
                    break;
                }

                System.out.println("Professores disponíveis:");
                int index = 0;
                for (Teacher teacher : teacherList) {
                    if (!classEscolhida.getTeachers().contains(teacher))
                        teacher.printWithIndex(index);
                    index++;
                }

                System.out.print("Professor escolhido: ");
                int indexProfessorEscolhido;
                indexProfessorEscolhido = scan.nextInt();
                scan.nextLine();

                try {
                    classEscolhida.addTeacher(teacherList.get(indexProfessorEscolhido));
                } catch (Exception e) {
                    System.out.println("ERRO! Professor inválido");
                }

            } else if (option == 7) {
                System.out.print("Turma: ");
                int selectedClassIndex = scan.nextInt();
                scan.nextLine();

                Class selectedClass = null;
                try {
                    selectedClass = classList.get(selectedClassIndex);
                } catch (Exception e) {
                    System.out.println("Turma inválida");
                    break;
                }

                if (selectedClass.getTeachers().size() == 0) {
                    System.out.println("Nenhum professor nessa turma");
                    break;
                }

                System.out.printf("Professores na turma %s: \n", selectedClass.getName());
                int index = 0;
                for (Teacher teacher : selectedClass.getTeachers()) {
                    teacher.printWithIndex(index);
                    index++;
                }

                System.out.print("Remover Professor: ");
                int teacherToBeRemovedIndex = scan.nextInt();
                scan.nextLine();

                try {
                    Teacher teacherToBeRemoved = teacherList.get(teacherToBeRemovedIndex);
                    selectedClass.removerProfessor(teacherToBeRemoved);
                } catch (Exception e) {
                    System.out.println("ERRO! Professor inválido");
                }

            } else if (option == 8) {
                int selectedClassIndex;
                System.out.print("Turma: ");
                selectedClassIndex = scan.nextInt();
                scan.nextLine();

                Class selectedClass = null;
                try {
                    selectedClass = classList.get(selectedClassIndex);
                } catch (Exception e) {
                    System.out.println("Turma inválida");
                    break;
                }
                selectedClass.inspectClass();
            }
        } while (option != 1);

    }

    public static void studentClass(List<Class> listaDeClasses, List<Student> studentList, List<Teacher> listaDeProfessores) {
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            Screen.studentMenu();
            option = scan.nextInt();
            scan.nextLine();

            if (option == 2) {
                System.out.println("Nome do Aluno: ");
                String name = scan.nextLine();
                studentList.add(new Student(name));
            } else if (option == 3) {
                int index;
                System.out.print("Digite o índice do aluno que deseja excluir: ");
                index = scan.nextInt();
                scan.nextLine();
                studentList.remove(index);

            } else if (option == 4) {
                if (studentList.isEmpty()) {
                    System.out.println("Nenhum aluno cadastrado!");
                } else {
                    System.out.println("Mostrando os alunos:");
                    int index = 0;
                    for (Student student : studentList) {
                        student.printWithIndex(index);
                        index++;
                    }
                }
            }
        } while (option != 1);
    }

    public static void teacherPortal(List<Class> classList, List<Student> listaDeStudents, List<Teacher> teacherList) {
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            Screen.teacherMenu();
            option = scan.nextInt();
            scan.nextLine();

            if (option == 2) {
                System.out.println("Nome do Professor: ");
                String name = scan.nextLine();

                System.out.println("Matéria do Professor: ");
                String subject = scan.nextLine();

                teacherList.add(new Teacher(name, subject));

            } else if (option == 3) {
                int index;
                System.out.print("Digite o índice do professor que deseja excluir: ");
                index = scan.nextInt();
                scan.nextLine();
                teacherList.remove(index);

            } else if (option == 4) {
                if (teacherList.isEmpty()) {
                    System.out.println("Nenhum professor cadastrado!");
                } else {
                    System.out.println("Mostrando os professores:");
                    int index = 0;
                    for (Teacher teacher : teacherList) {
                        teacher.printWithIndex(index);
                        index++;
                    }
                }
            }
        } while (option != 1);
    }
}
