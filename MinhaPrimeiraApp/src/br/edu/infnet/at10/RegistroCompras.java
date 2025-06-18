package br.edu.infnet.at10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class RegistroCompras {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		gravarDados("compras.txt");
		
		in.close();
		
		exibirTxt("compras.txt");
		
	}
	
	
	private static void gravarDados(String arquivo) {
		
		System.out.println("\033[1;97m" + "============== Cadastro de Produtos ===============");
		try (BufferedWriter gravador = new BufferedWriter(new FileWriter(arquivo))) {
		
			gravarLinha(gravador, "Produto; Quantidade; Preço");
			
			for (int i = 0; i < 3; i++) {
				
				System.out.println("\033[1;93m" + "Produto " + (i+1));
				
				String produto = inputStr("\033[0;93m" + "Insira o nome do produto: " + "\033[1;93m");
				int qtde = inputInt("\033[0;93m" + "Insira a quantidade do produto: " + "\033[1;93m");
				double preco = inputDouble("\033[0;93m" + "Insira o preço unitário do produto: " + "\033[1;93m");
				
				System.out.println("\033[1;93m" + "\n------------------------------------------------");
				
				in.nextLine();
				
				gravarLinha(gravador, String.format("%s; %d; %.2f", produto, qtde, preco));
			}
			
		} catch (IOException e) {
			System.err.print(e.getMessage());
		}
	}
	
		
	private static String inputStr(String mensagem) {
			
			System.out.print(mensagem);
			return in.nextLine();
	}
	
		
	private static int inputInt(String mensagem) {
		
		System.out.print(mensagem);
		return in.nextInt();
	}
	
	
	private static double inputDouble(String mensagem) {
		
		System.out.print(mensagem);
		return in.nextDouble();
	}
	
	
	private static void gravarLinha(BufferedWriter gravador, String linha) {

		try {
			gravador.write(linha);
			gravador.newLine();
					
		} catch (IOException e) {
	
			System.err.print(e.getMessage());
		}
			
	}
			
		
	private static void exibirTxt(String arquivo) {
		
		System.out.println("\033[1;97m" + "\n============== Compras no arquivo .txt ===============");
		try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
			
			String linha;
			while ((linha = leitor.readLine()) != null) {
				
				String[] info = linha.split("; ");	
				System.out.format("\033[0;39m" +  "| %-25s | %-10s | %-9s |\n", info[0], info[1], info[2]);
			}
			
		} catch (FileNotFoundException e) {
			System.err.print(e.getMessage());
			
		} catch (IOException e) {
			System.err.print(e.getMessage());
		}
	} 
}
