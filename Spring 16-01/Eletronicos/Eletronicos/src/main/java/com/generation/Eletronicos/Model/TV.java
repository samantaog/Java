package com.generation.Eletronicos.Model;

public class TV {
	private float polegadas;
	private String modelo;
	private int anoLancamento;

	public TV(float polegadas, String modelo, int anoLancamento) {
		super();
		this.polegadas = polegadas;
		this.modelo = modelo;
		this.anoLancamento = anoLancamento;
	}

	public float getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(float polegadas) {
		this.polegadas = polegadas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

}
