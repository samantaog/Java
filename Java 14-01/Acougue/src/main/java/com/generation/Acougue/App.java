package com.generation.Acougue;

import com.generation.BaseDados.Estoque;
import com.generation.InterfaceVenda.VendaImpl;

public class App {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		VendaImpl vendaImp = new VendaImpl();
		
		System.out.println(VendaImpl.vender);
		
	}

}