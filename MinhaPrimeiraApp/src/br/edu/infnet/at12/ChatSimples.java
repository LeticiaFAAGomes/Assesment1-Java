package br.edu.infnet.at12;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ChatSimples {
	
	public static void main(String[] args) {
		
		List<String> historicoMensagens = new ArrayList<String>();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("\033[1;97m" + "===== Nome dos Usuários =====");	
		String username1 = inserirUsuario(in, "\033[0;93m" + "Digite o nome do primeiro usuário: " + "\033[1;93m");
		String username2 = inserirUsuario(in, "\033[0;36m" + "Digite o nome do segundo usuário: "  + "\033[1;94m");
		
		in.nextLine();
		
		iniciarChat(in, historicoMensagens, username1, username2);
		
		in.close();
		
		exibirHistorico(historicoMensagens);
		
		System.out.println("\033[1;92m" + "\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");
		
	}
	
	private static String inserirUsuario(Scanner in, String msg) {
		
		System.out.printf(msg);
		
		return in.next();
	}
	
	private static void iniciarChat(Scanner in, List<String> historicoMensagens, String username1, String username2) {
		
		System.out.println("\033[1;97m" + "\n===== Chat de Mensagens =====");
		int index = 0;
		
		while (index < 5) {
			System.out.printf("\033[0;93m" + "%s, digite sua mensagem: " + "\033[1;93m", username1);
			String user1 = in.nextLine();
			historicoMensagens.add("\033[0;93m" + username1 + ": " + user1);
			
			System.out.printf("\033[0;36m" + "%s, digite sua mensagem: " + "\033[1;94m", username2);
			String user2 = in.nextLine();
			historicoMensagens.add("\033[0;36m" + username2 + ": " + user2);
			
			index++;
		}
		
	}
	
	private static void exibirHistorico(List<String> historicoMensagens) {
		
		System.out.println("\033[1;97m" + "\n===== Histórico de Mensagens =====" + "\033[0m");
		for (String mensagem : historicoMensagens) {
			System.out.println(mensagem);
		}
	}

}
