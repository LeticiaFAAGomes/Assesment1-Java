package br.edu.infnet.at9;

public class ContaBancaria {
	
	String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}
	
	void sacar(double valor) {
		this.saldo -= valor;
	}
	
	void exibirSaldo() {
		System.out.printf("\033[0;93m" + "Saldo: %.2f\n", this.saldo);
	}
}
