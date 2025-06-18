package br.edu.infnet.at8;

class Estagiario extends Funcionario {

	public Estagiario(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	@Override
	void calcularBonus() {
		this.salarioBase *= 1.10;
	}
}
