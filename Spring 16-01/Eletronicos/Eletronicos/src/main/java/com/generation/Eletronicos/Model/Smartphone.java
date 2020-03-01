package com.generation.Eletronicos.Model;

public class Smartphone {
	private String modelo;
	private String memoria;
	private float tamanhoTela;

	public Smartphone(String modelo, String memoria, float tamanhoTela) {
		super();
		this.modelo = modelo;
		this.memoria = memoria;
		this.tamanhoTela = tamanhoTela;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public float getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(float tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

}
