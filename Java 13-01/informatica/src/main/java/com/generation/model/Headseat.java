package com.generation.model;

public class Headseat {
	private String entradaTipo;
	private String frequencia;

	public Headseat(String entradaTipo, String frequencia) {
		super();
		this.entradaTipo = entradaTipo;
		this.frequencia = frequencia;
	}

	public String getEntradaTipo() {
		return entradaTipo;
	}

	public void setEntradaTipo(String entradaTipo) {
		this.entradaTipo = entradaTipo;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}

}
