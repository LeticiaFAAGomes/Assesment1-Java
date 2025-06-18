package br.edu.infnet.at9;

public class AppContaBancaria {
	
	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria("Letícia", 10000);
		
		System.out.print("\033[1;97m" + "===== Saldo Original =====\n");
		conta.exibirSaldo();
		
		System.out.print("\033[1;97m" + "\n===== Saldo Após Depósito =====\n");
		conta.depositar(200);
		conta.exibirSaldo();
		
		System.out.print("\033[1;97m" + "\n===== Saldo Após Saque =====\n");
		conta.sacar(100);
		conta.exibirSaldo();
	}

}
