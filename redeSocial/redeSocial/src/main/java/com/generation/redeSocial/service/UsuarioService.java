package com.generation.redeSocial.service;

import java.util.List;

import com.generation.redeSocial.entity.Usuario;

public interface UsuarioService {
	List<Usuario> getAll();

	Usuario getById(int id);

	Usuario insertOrUpdate(Usuario usuario);

	void delete(int id);

}
