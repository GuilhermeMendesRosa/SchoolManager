package br.com.escola.models;

public class Registerable {
	public void printWithIndex(int index) {
		System.out.printf("[%d] - %s\n", index, this.toString());
	}
}
