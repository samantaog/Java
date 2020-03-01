package com.generation.baseDados;

import com.generation.model.Monitor;

public class baseDadosMonitor {
	private Monitor[] listaMonitor;

	public baseDadosMonitor() {
		listaMonitor = new Monitor[3];

		listaMonitor[0] = new Monitor(20, "1680 × 1050");
		listaMonitor[1] = new Monitor(21, "1680 × 1050");
		listaMonitor[2] = new Monitor(22, "1680 × 1050");

	}

	public Monitor[] getListaMonitor() {
		return listaMonitor;
	}

	public void setListaMonitor(Monitor[] listaMonitor) {
		this.listaMonitor = listaMonitor;
	}
}
