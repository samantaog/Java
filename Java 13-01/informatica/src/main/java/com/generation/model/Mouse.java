package com.generation.model;

public class Mouse {
	private String comFio;
	private String bluetooth;
	private String tipoGamer;
	
	
	
	
	public Mouse(String comFio, String bluetooth, String tipoGamer) {
		super();
		this.comFio = comFio;
		this.bluetooth = bluetooth;
		this.tipoGamer = tipoGamer;
	}
	public String getComFio() {
		return comFio;
	}
	public void setComFio(String comFio) {
		this.comFio = comFio;
	}
	public String getBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}
	public String getTipoGamer() {
		return tipoGamer;
	}
	public void setTipoGamer(String tipoGamer) {
		this.tipoGamer = tipoGamer;
	}

	
}
