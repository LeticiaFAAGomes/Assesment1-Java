package br.edu.infnet.at8;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	@Override
	void calcularBonus() {
		this.salarioBase *= 1.20;
	}
}