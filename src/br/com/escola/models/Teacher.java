package br.com.escola.models;

public class Teacher extends Registerable {
    private String name;
    private String subject;

    public Teacher(String nome, String materia) {
        this.name = nome;
        this.subject = materia;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public String toString() {
        return String.format("%s - %s", name, subject);
    }
}
