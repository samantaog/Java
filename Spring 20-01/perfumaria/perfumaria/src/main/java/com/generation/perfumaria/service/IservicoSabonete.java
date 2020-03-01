package com.generation.perfumaria.service;

import java.util.List;

import com.generation.perfumaria.model.Sabonete;

public interface IservicoSabonete {
	Sabonete insert(Sabonete sabonete);

	Sabonete update(Sabonete sabonete);

	void delete(int id);

	List<Sabonete> getAll();

	Sabonete getById(int id);

}
