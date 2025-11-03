package model;
public class Morador {
	private int apartamento;
	private String nomeMorador;
	private String modeloCarro;
	private String corCarro;
	private String placaCarro;
	
	
	public Morador () {
		apartamento = 0;
		nomeMorador = "";
		modeloCarro = "";
		corCarro = "";
		placaCarro = ""; 
	}
	
	public Morador (int apartamento, String nomeMorador, String modeloCarro, String corCarro, String placaCarro) {
		this.apartamento = apartamento;
		this.nomeMorador = nomeMorador;
		this.modeloCarro = modeloCarro;
		this.corCarro = corCarro;
		this.placaCarro = placaCarro; 
	}
	
	public int getApartamento() {
		return apartamento;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}

	public String getNomeMorador() {
		return nomeMorador;
	}

	public void setNomeMorador(String nomeMorador) {
		this.nomeMorador = nomeMorador;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}


	
	public int hash(int tamanhoTabela) {
		int andar = apartamento / 100;
		return andar % tamanhoTabela;
	}
	
	
}
