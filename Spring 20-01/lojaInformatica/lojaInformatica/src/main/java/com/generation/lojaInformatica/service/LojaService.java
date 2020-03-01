package com.generation.lojaInformatica.service;

import java.util.List;

import com.generation.lojaInformatica.model.Loja;

public interface LojaService {
	Loja insert(Loja lojaInformatica);

	Loja update(Loja lojaInformatica);

	void delete(Loja lojaInformatica);

	void delete(int id);

	Loja getById(int id);

	List<Loja> getAll();

}
