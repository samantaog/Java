package com.generation.baseDados;

import com.generation.model.Teclado;

public class baseDadosTeclado {
	
	private Teclado[] listaTeclado;

	public baseDadosTeclado() {
		listaTeclado= new Teclado[3];

		listaTeclado[0] = new Teclado(true, false, false);
		listaTeclado[1] = new Teclado(false, true, false);
		listaTeclado[2] = new Teclado(false, false, true);
		
		
	}

	public Teclado[] getListaTeclado() {
		return listaTeclado;
	}

	public void setListaTeclado(Teclado[] listaTeclado) {
		this.listaTeclado = listaTeclado;
	}

}
