package br.edu.infnet.at7;

import java.util.List;

public class Aluno {
	
	String nome;
	int matricula;
	List<Double> notas;
	
	public Aluno(String nome, int matricula, List<Double> notas) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}
	
	double calcularMedia() {
		
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / this.notas.size();
	}
	
	String verificarAprovacao(double media) {
		
		return media >= 7? "\033[1;92mAprovado": "\033[31mReprovado";
	}

}
