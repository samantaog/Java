package com.generation.escola.service;

import java.util.List;

import com.generation.escola.entity.Turma;

public interface TurmaService {
	List<Turma> getAll();

	Turma getById(int id);

	Turma insertOrUpdate(Turma turma);

	void delete(int id);

}
