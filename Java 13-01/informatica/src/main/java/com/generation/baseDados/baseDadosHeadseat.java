package com.generation.baseDados;

import com.generation.model.Headseat;

public class baseDadosHeadseat {
	private Headseat[] listaHeadseats;

	public baseDadosHeadseat() {
		listaHeadseats = new Headseat[3];

		listaHeadseats[0] = new Headseat("P2", "20 Hz");
		listaHeadseats[1] = new Headseat("P3", "20 Hz");
		listaHeadseats[2] = new Headseat("P10", "100 Hz");

	}

	public Headseat[] getListaHeadseats() {
		return listaHeadseats;
	}

	public void setListaHeadseats(Headseat[] listaHeadseats) {
		this.listaHeadseats = listaHeadseats;
	}
}
