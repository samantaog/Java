package com.generation.perfumaria.model;

public class Sabonete {
	private int id;
	private String marca;
	private String perfume;
	private float gramas;

	public Sabonete() {
		super();
	}

	public Sabonete(int id, String marca, String perfume, float gramas) {
		super();
		this.id = id;
		this.marca = marca;
		this.perfume = perfume;
		this.gramas = gramas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPerfume() {
		return perfume;
	}

	public void setPerfume(String perfume) {
		this.perfume = perfume;
	}

	public float getGramas() {
		return gramas;
	}

	public void setGramas(float gramas) {
		this.gramas = gramas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}