package br.edu.infnet.at2;

import java.util.Scanner;

public class ValidacaoSenha {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean ehValida = false;
		
		System.out.println("\033[1;97m" + "========== Cadastro de Senha ==========");
		
		do {
			
			String senha = entrar(in);
			
			ehValida = validarSenha(senha);
		
		} while (!ehValida);
		
		in.close();
	}
	
	private static String entrar(Scanner in) {
		
		System.out.print("\033[0;93m" + "Digite sua senha: " + "\033[1;93m");
		return in.nextLine();
	}
	
	private static boolean validarQtdCaracteres(String senha) {
		
		return senha.length() >= 8; 
	}
	
	private static boolean validarLetraMaiuscula(String senha) {
		
		for (int i = 0; i < senha.length(); i++) {
			
			char letra = senha.charAt(i);
			
			if (Character.isUpperCase(letra)) {
				return true;
			}
		}
		
		return false;
	}
	
	private static boolean validarNumero(String senha) {
		
		for (int i = 0; i < senha.length(); i++) {
			
			char caractere = senha.charAt(i);
			
			if (Character.isDigit(caractere)) {
				return true;
			}
		}
		
		return false;
	}
	
	private static boolean validarCaractereEspecial(String senha) {
			
		String caracteresEspeciais = ".*[^a-zA-Z0-9].*";
			
		if (senha.matches(caracteresEspeciais)) {
				return true;
		}
		
		return false;
	}
	
	private static boolean validarSenha(String senha) {
		
		if (validarQtdCaracteres(senha)) {
			if (validarLetraMaiuscula(senha)) {
				if (validarNumero(senha)) {
					if (validarCaractereEspecial(senha)) {
						System.out.println("\033[42m" + "\n[Sucesso] A senha foi cadastrada com sucesso!" + "\033[0m");
						return true;
						
					} else {
						System.err.println("\033[41m" + "\n [Erro] A senha deve conter ao menos um caracteres especial." + "\033[0m");
					}
				} else {
					System.err.println("\033[41m" + "\n[Erro] A senha deve conter ao menos um número." + "\033[0m");
				}
			} else {
				System.err.println("\033[41m" + "\n[Erro] A senha deve conter ao menos uma letra maiúscula." + "\033[0m");
			}
		} else {
			System.err.println("\033[41m" + "\n[Erro] A senha deve conter ao menos 8 caracteres." + "\033[0m");
		}
		
		System.out.println();
		
		return false;
	}

}
