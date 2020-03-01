package com.generation.lojaInformatica.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.generation.lojaInformatica.model.Loja;
import com.generation.lojaInformatica.service.LojaService;

public class LojaServiceImpl implements LojaService{
	static List<Loja> lojas = new ArrayList<Loja> ();	
	private static int incr = 0;

	@Override
	public Loja insert(Loja lojaInformatica) {
		incr++;
		lojaInformatica.setId(incr);
		this.lojas.add(lojaInformatica);
		return lojaInformatica;
	}

	@Override
	public Loja update(Loja lojaInformatica) {
		Loja aux = getById(lojaInformatica.getId());
			aux.setMarca(lojaInformatica.getMarca());
			aux.setTipoProduto(lojaInformatica.getTipoProduto());
		
		return aux;
	}

	@Override
	public void delete(Loja lojaInformatica) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Loja getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loja> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
