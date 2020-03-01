package com.generation.Eletronicos.Model;

public class Computador {
	private String processador;
	private String memoriaRam;
	private float tamanhoTela;

	public Computador(String processador, String memoriaRam, float tamanhoTela) {
		super();
		this.processador = processador;
		this.memoriaRam = memoriaRam;
		this.tamanhoTela = tamanhoTela;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public float getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(float tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

}
