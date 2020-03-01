package com.generation.InterfaceVenda;

import com.generation.Model.Carne;

public class VendaImpl implements IVenda {

	public String pesar(Carne carne) {
		String mensagem = "Tipo de carne: " + carne.getTipo() + "Quantidade: " + carne.getPreço();
		return mensagem;
	}

	public String vender(Carne carne) {
		String mensagem = "Quantidade: " + carne.getPreço() + "Preço: " + carne.getPreço();
		return mensagem;
	}

}
