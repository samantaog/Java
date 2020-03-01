package com.generation.lojaInformatica.model;

public class Loja {
	private int id;
	private String tipoProduto;
	private String marca;

	public Loja(int id, String tipoProduto, String marca) {
		super();
		this.id = id;
		this.tipoProduto = tipoProduto;
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
