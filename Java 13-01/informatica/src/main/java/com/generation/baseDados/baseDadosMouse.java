package com.generation.baseDados;

import com.generation.model.Mouse;

public class baseDadosMouse {
	private Mouse[] listaMouse;

	public baseDadosMouse() {
		listaMouse = new Mouse[3];

		listaMouse[0] = new Mouse("Comfio", "NãoSeAplica", "NãoSeAplica");
		listaMouse[1] = new Mouse("Comfio", "NãoSeAplica", "NãoSeAplica");
		listaMouse[2] = new Mouse("Comfio", "NãoSeAplica", "NãoSeAplica");

	}

	public Mouse[] getListaMouse() {
		return listaMouse;
	}

	public void setListaMouse(Mouse[] listaMouse) {
		this.listaMouse = listaMouse;
	}
}
