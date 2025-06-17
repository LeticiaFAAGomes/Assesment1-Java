package br.edu.infnet.at6;

public class AppVeiculos {
	
	public static void main(String[] args) {
		
		System.out.printf("\033[1;97m" + "===== Cadastro de Veículos =====\n");
		
		Veiculo v1 = new Veiculo("ABC231", "Jeep Compass", 2025, 0);
		Veiculo v2 = new Veiculo("ABC321", "Corsa Hatch", 2010, 28.000);
		
	    v1.registrarViagem(1.000);
	    v1.exibirDetalhes();
	    
	    v2.registrarViagem(5.000);
	    v2.exibirDetalhes();
	}
}
