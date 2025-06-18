package br.edu.infnet.at8;

public class AppFuncionario {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Fátima", 6000);
		Estagiario estagiario = new Estagiario("Jorge", 2000);
		
		System.out.print("\033[1;97m" + "===== Calculo de Bônus =====\n");
		gerente.calcularBonus();
		System.out.printf("\033[0;93m" + "Gerente: %s\nSalário com bônus: R$ %f\n\n", gerente.getNome(), gerente.getSalario());
		
		estagiario.calcularBonus();
		System.out.printf("\033[0;93m" + "Estagiário: %s\nSalário com bônus: R$ %f", estagiario.getNome(), estagiario.getSalario());
	}

}
