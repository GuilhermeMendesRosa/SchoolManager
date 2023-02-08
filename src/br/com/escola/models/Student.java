package br.com.escola.models;

public class Student extends Registerable {

    private String name;
    private boolean isEnrolled;

    public Student(String nome) {
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getEnrolled() {
        return isEnrolled;
    }

    public void enroll() {
        this.isEnrolled = !(this.isEnrolled);
    }

    public String toString() {
        return this.name;
    }
}
