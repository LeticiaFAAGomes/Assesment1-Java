package br.edu.infnet.at6;

public class Veiculo {
	
	private String placa;
	private String modelo;
	private int anoFabricacao;
	private double quilometragem;
	
	public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
		
		this.placa = placa;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.quilometragem = quilometragem;
	}
	
	public void exibirDetalhes() {
		System.out.printf("\033[1;93m" + "Modelo: %s | Placa: %s | Ano: %d | Quilomêtros Rodados: %.3f\n\n", this.modelo, this.placa, this.anoFabricacao, this.quilometragem);
	}
	
	public void registrarViagem(double km) {
		this.quilometragem += km;
	}
}
