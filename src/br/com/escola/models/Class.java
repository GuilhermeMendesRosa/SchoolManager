package br.com.escola.models;

import java.util.ArrayList;
import java.util.List;

public class Class extends Registerable {
    private String name;
    private List<Teacher> teachers = new ArrayList<Teacher>();
    private List<Student> students = new ArrayList<Student>();

    public Class(String nome) {
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public List<Student> getAlunos() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.enroll();
    }

    public void removeStudent(Student student) {
        students.remove(student);
        student.enroll();
    }

    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);

        } else {
            System.out.println("Professor já cadastrado!");
        }
    }

    public void removerProfessor(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void inspectClass() {
        System.out.println("-----------------------------");
        System.out.printf("\nTurma: %s\n", name);
        System.out.println("\nProfessores:");
        teachers.forEach(teacher -> {
            System.out.println(teacher.toString());
        });
        System.out.println("\nAlunos:");
        students.forEach(student -> {
            System.out.println(student.getName());
        });
        System.out.println("-----------------------------");
    }

    public String toString() {
        return this.name;
    }
}
