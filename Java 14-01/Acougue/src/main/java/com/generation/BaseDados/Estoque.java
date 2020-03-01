package com.generation.BaseDados;

import java.util.ArrayList;
import java.util.List;

import com.generation.Model.Carne;

public class Estoque {

	List<Carne> listaCarne;

	public Estoque() {
		listaCarne = new ArrayList<Carne>();
		listaCarne.add(new Carne(1, 45, "porco"));
		listaCarne.add(new Carne(1, 15, "boi"));
		listaCarne.add(new Carne(1, 10, "frango"));

	}

	public List<Carne> getListaCarne() {
		return listaCarne;
	}

	public void setListaCarne(List<Carne> listaCarne) {
		this.listaCarne = listaCarne;
	}

}
