package br.edu.infnet.at4;

import java.util.Scanner;

public class EmprestimoBancario {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\033[1;97m" + "========== Simulação de Emprestimo Bancário ==========");
		
		System.out.print("\033[0;93m" + "Insira seu nome: " + "\033[1;93m");
		String nome = in.nextLine();
		
		System.out.print("\033[0;93m" + "Insira o valor desejado para o empréstimo: " + "\033[1;93m");
		double emprestimo = in.nextDouble();
		

		int qtdParcelas = validarParcelas(in);
		double valorMensal = calcularJurosMensalFixo(emprestimo, qtdParcelas);
		double valorTotal = calcularValorTotal(valorMensal, qtdParcelas);
		exibirInfo(nome, emprestimo, valorMensal, valorTotal);
		
		in.close();
		
	}
	
	public static int validarParcelas(Scanner in) {	
		int qtdParcelas = 0;
		
		while (true) {
			System.out.print("\033[0;93m" + "Insira em até quantas parcelas deseja pagar: "+ "\033[1;93m");
			qtdParcelas = in.nextInt();

			if (qtdParcelas < 6 || qtdParcelas > 48) {
				System.err.println("\033[41m" + "\nPor favor, apenas preencha um número entre 6 e 48 para a quantidade de parcelas.");
			} else {
				return qtdParcelas;
			}	
			System.err.println();
		}
	}
	
	
	public static double calcularJurosMensalFixo(double emprestimo, int qdtParcelas) {
		
		final double JUROS = 1.03;
		
		return (emprestimo / qdtParcelas) * JUROS;
	}
	
	
	public static double calcularValorTotal(double valorMensal, int qdtParcelas) {
		
		return valorMensal * qdtParcelas;
	}
	
	
	public static void exibirInfo(String nome, double emprestimo, double valorMensal, double valorTotal) {
		
		System.out.println("\033[1;97m" + "\n============================== Resultado do Empréstimo =============================");
		String info = String.format("\033[1;92m" + "| %-20s | %15s | %21s | %15s |\n", "Cliente", "Empréstimo(R$)","Parcelas Mensais(R$)", "Valor Total(R$)");
		info += String.format("\033[0;92m" + "| %-20s | %15.2f | %21.2f | %15.2f |",  nome, emprestimo, valorMensal, valorTotal);
		System.out.println(info);
	}

}
