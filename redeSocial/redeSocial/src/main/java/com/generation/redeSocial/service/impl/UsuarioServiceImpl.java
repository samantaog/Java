package com.generation.redeSocial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.generation.redeSocial.entity.Usuario;
import com.generation.redeSocial.repository.UsuarioRepository;
import com.generation.redeSocial.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> getAll() {
		List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
		return usuarios;
	}

	@Override
	public Usuario getById(int id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public Usuario insertOrUpdate(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public void delete(int id) {
		usuarioRepository.deleteById(id);
	}

}
