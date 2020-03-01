package com.generation.model;

public class Monitor {
	private int polegadas;
	private String resolucaoTela;

	public Monitor(int polegadas, String resolucaoTela) {
		super();
		this.polegadas = polegadas;
		this.resolucaoTela = resolucaoTela;
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}

	public String getResolucaoTela() {
		return resolucaoTela;
	}

	public void setResolucaoTela(String resolucaoTela) {
		this.resolucaoTela = resolucaoTela;
	}

}
