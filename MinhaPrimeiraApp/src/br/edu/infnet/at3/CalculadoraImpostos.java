package br.edu.infnet.at3;

import java.util.Scanner;

public class CalculadoraImpostos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("\033[1;97m" + "========== Simulação de Impostos ==========");
		System.out.print("\033[0;93m" + "Insira seu nome: " + "\033[1;93m");
		String nome = in.nextLine();
		
		System.out.print("\033[0;93m" + "Insira seu salário mensal: " + "\033[1;93m");
		double salarioMensal = in.nextInt();
		
		in.close();
		
		System.out.print("\033[1;93m" + "---------------------------------------------\n");
		
		double taxa = calcularTaxa(salarioMensal);
		double salarioLiquido = calcularSalarioLiquido(salarioMensal, taxa);
		exibirInformacoes(nome, salarioMensal, taxa, salarioLiquido);
		
	}
	
	
	public static double calcularTaxa(double salarioMensal) {
		
		final double SALARIO_TAXA1 = 22847.76;
		final double SALARIO_TAXA2 = 33919.80;
		final double SALARIO_TAXA3 = 45012.60;
		
		final double TAXA1 = 0.075;
		final double TAXA2 = 0.15;
		final double TAXA3 = 0.275;
		
		if (salarioMensal > SALARIO_TAXA3 ) {
			return salarioMensal * TAXA3;
			
		} else if (salarioMensal > SALARIO_TAXA2) {
			return salarioMensal * TAXA2;
			
		} else if (salarioMensal > SALARIO_TAXA1) {
			return salarioMensal * TAXA1;
			
		} else {
			return 0;
		}
	}
	
	
	public static double calcularSalarioLiquido(double salarioMensal, double taxa) {
		return salarioMensal - taxa;
	}
	
	public static void exibirInformacoes(String nome, double salarioMensal, double taxa, double salarioLiquido) {
		System.out.printf("\033[0;96m" + "\nOlá, %s!\n\nOs imposto cobrados sobre seu salário de R$ %.2f foram R$ %.2f, resultando em um salário líquido de R$ %.2f", nome, salarioMensal, taxa, salarioLiquido);
	}
}
