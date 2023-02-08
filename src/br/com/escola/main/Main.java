package br.com.escola.main;

import br.com.escola.models.Class;
import br.com.escola.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menuOption;
        Scanner scan = new Scanner(System.in);

        List<Class> classList = new ArrayList<Class>();
        List<Student> studentList = new ArrayList<Student>();
        List<Teacher> teacherList = new ArrayList<Teacher>();

        sampleDataCreate(classList, studentList, teacherList);

        do {
            Screen.mainScreen();
            menuOption = scan.nextInt();
            scan.nextLine();

            if (menuOption == 2) {
                Portal.classPortal(classList, studentList, teacherList);
            } else if (menuOption == 3) {
                Portal.studentClass(classList, studentList, teacherList);
            } else if (menuOption == 4) {
                Portal.teacherPortal(classList, studentList, teacherList);
            }

        } while (menuOption != 1);
    }

    private static void sampleDataCreate(List<Class> classList, List<Student> studentList, List<Teacher> teacherList) {
        classList.add(new Class("1º ano"));
        classList.add(new Class("2º ano"));
        classList.add(new Class("3º ano"));

        studentList.add(new Student("Guilheme"));
        studentList.add(new Student("Luan"));
        studentList.add(new Student("João"));
        studentList.add(new Student("Maria"));
        studentList.add(new Student("Renato"));
        studentList.add(new Student("Mariana"));

        teacherList.add(new Teacher("Selner", "Análise de Sistemas"));
        teacherList.add(new Teacher("Valmor", "Orientação a objeto"));
        teacherList.add(new Teacher("Rui", "Estrutura de Dados"));
        teacherList.add(new Teacher("Rafaella", "Cálculo"));
    }
}