package com.generation.escola.service;

import java.util.List;

import com.generation.escola.entity.Aluno;

public interface AlunoService {
	List<Aluno> getAll();

	Aluno getById(int id);

	Aluno insertOrUpdate(Aluno aluno);

	void delete(int id);

}
