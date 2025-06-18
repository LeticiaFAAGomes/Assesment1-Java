package br.edu.infnet.at8;

public abstract class Funcionario {
	
	String nome;
	double salarioBase;
	
	public Funcionario(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	abstract void calcularBonus();
	
	double getSalario() {
		return this.salarioBase;
	}
	
	String getNome() {
		return this.nome;
	}

}
