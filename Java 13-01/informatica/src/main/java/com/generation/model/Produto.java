package com.generation.model;

public class Produto {
	public String marca;
	private float preco;

	public Produto(String marca, float preco) {
		super();
		this.marca = marca;
		this.preco = preco;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
