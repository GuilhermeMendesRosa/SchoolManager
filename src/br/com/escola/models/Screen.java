package br.com.escola.models;

public class Screen {

    public static void classMenu() {
        System.out.println("-----------------------------");
        System.out.println("Portal de Turmas: ");
        System.out.println("1 - Voltar");
        System.out.println("2 - Criar de turma");
        System.out.println("3 - Listar turmas");
        System.out.println("4 - Adicionar Aluno");
        System.out.println("5 - Remover Aluno");
        System.out.println("6 - Adicionar Professor");
        System.out.println("7 - Remover Professor");
        System.out.println("8 - Inspecionar Turma");
        System.out.println("-----------------------------");
    }

    public static void mainScreen() {
        System.out.println("-----------------------------");
        System.out.println("Digite uma opção do menu: ");
        System.out.println("1 - sair");
        System.out.println("2 - Portal de turmas");
        System.out.println("3 - Portal do aluno");
        System.out.println("4 - Portal do professor");
        System.out.println("-----------------------------");

    }

    public static void studentMenu() {
        System.out.println("-----------------------------");
        System.out.println("Portal do Aluno: ");
        System.out.println("1 - Voltar");
        System.out.println("2 - Criar aluno");
        System.out.println("3 - Excluir Aluno");
        System.out.println("4 - Listar alunos");
        System.out.println("-----------------------------");

    }

    public static void teacherMenu() {
        System.out.println("-----------------------------");
        System.out.println("Portal do Professor: ");
        System.out.println("1 - Voltar");
        System.out.println("2 - Criar Professor");
        System.out.println("3 - Excluir Professor");
        System.out.println("4 - Listar Professor");
        System.out.println("-----------------------------");
    }
}
