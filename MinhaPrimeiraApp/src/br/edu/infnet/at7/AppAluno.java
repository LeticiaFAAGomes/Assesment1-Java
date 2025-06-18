package br.edu.infnet.at7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppAluno {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		List<Double> notas = new ArrayList<>();
		
		System.out.print("\033[1;97m" + "===== Cadastro de Aluno =====\n");
		
		System.out.print("\033[0;93m" + "Insira seu nome: " + "\033[1;93m");
		String nome = in.nextLine();
		
		System.out.print("\033[0;93m" + "Insira o número de matrícula: " + "\033[1;93m");
		int matricula = in.nextInt();
		
		System.out.print("\033[0;93m" + "Insira sua primeira nota: " + "\033[1;93m");
		notas.add(in.nextDouble());
		
		System.out.print("\033[0;93m" + "Insira sua segunda nota: " + "\033[1;93m");
		notas.add(in.nextDouble());
		
		System.out.print("\033[0;93m" + "Insira seu terceira nota: " + "\033[1;93m");
		notas.add(in.nextDouble());
		
		in.close();
		
		Aluno aluno = new Aluno(nome, matricula, notas);
		
		System.out.print("\033[1;97m" + "\n===== Verificação de Notas =====\n");
		
		System.out.print("\033[0;97m" + "Situação: ");
		double media = aluno.calcularMedia();
		System.out.println(aluno.verificarAprovacao(media));
	}
}

