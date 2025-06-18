package br.edu.infnet.at11;

import java.util.Random;
import java.util.Scanner;


public class SimulacaoLoteria {

	public static void main(String[] args) {
		
		int[] numSorteados = gerarNumeros();
		
		System.out.println("\033[1;36m" + "--- Seja bem-vindo a loteria! ---\n");

		int[] chutes = chutar(numSorteados);
		System.out.print("\033[0;97m" + "\nAguarde o sorteio dos números... \n");
		
		int acertos = compararNumeros(numSorteados, chutes);
		System.out.printf("\033[0;93m" + "\n\nSeus acertos: %d\n", acertos);
	}
	
	
	private static int[] gerarNumeros() {
		
		int[] numSorteados = new int[6];
		Random gerador = new Random();

		for (int i = 0; i < numSorteados.length; i++) {
			int numAleatorio = gerador.nextInt(60) + 1;
			numSorteados[i] = numAleatorio;
		}
		
		return numSorteados;
	}
	
	
	private static int[] chutar(int[] numSorteados) {
		
		Scanner in = new Scanner(System.in);
		int[] chutes = new int[6];
		
		for(int i = 0; i < numSorteados.length; i++) {
			System.out.printf("\033[0;93m" + "Insira o %d° número: " + "\033[1;36m", i+1);
			int chute = in.nextInt();
			
			if (chute > 0 && chute < 61) {
				chutes[i] = chute;
			} else {
				i--;
				System.err.println("\033[41m" + "\n[Erro] Por favor, insira números entre 1 e 60.\n" + "\033[0;93m");
			}
		}
		
		in.close();
		
		return chutes;
	}
	
	
	private static int compararNumeros(int[] numSorteados, int[] chutes) {
		
		int acertos = 0;
		int c = 0;
		
		for(int num : numSorteados) {
			
			System.out.print("\033[1;34m" + "\033[1;32m" + num);
			
			if (c < numSorteados.length-1) {
				System.out.print(" - ");
			}
			
			pausar();
			c++;
			
			for(int palpite : chutes) {
				
				if (palpite == num) {
						acertos += 1;
				}
			}
			
		}
		
		return acertos;
	}
	
	
	private static void pausar() {
		
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
	}
}
