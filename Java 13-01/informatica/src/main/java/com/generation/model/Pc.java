package com.generation.model;

public class Pc {
	private boolean placaVideo;
	private String modelo;

	public Pc(String modelo, boolean placaVideo) {
		super();
		this.setModelo(modelo);
		this.placaVideo = placaVideo;
	}

	public boolean isPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(boolean placaVideo) {
		this.placaVideo = placaVideo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
