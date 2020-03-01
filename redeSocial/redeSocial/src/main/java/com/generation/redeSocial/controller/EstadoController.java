package com.generation.redeSocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.redeSocial.entity.Estado;
import com.generation.redeSocial.service.EstadoService;

@RestController
@CrossOrigin("*")
public class EstadoController {

	@Autowired
	EstadoService estadoService;

	@GetMapping("/estado")
	public ResponseEntity<List<Estado>> getAllEstado() {
		return ResponseEntity.ok(this.estadoService.getAll());
	}

	@GetMapping("/estado/{id}")
	public ResponseEntity<Estado> getById(@PathVariable int id) {
		return ResponseEntity.ok(estadoService.getById(id));
	}

	@PostMapping("/estado")
	public ResponseEntity<Estado> postEstado(@RequestBody Estado estado) {
		return ResponseEntity.ok(estadoService.insertOrUpdate(estado));
	}

	@PutMapping("/estado")
	public ResponseEntity<Estado> putEstado(@RequestBody Estado estado) {
		return ResponseEntity.ok(estadoService.insertOrUpdate(estado));
	}

	@DeleteMapping("/estado/{id}")
	public ResponseEntity<String> deleteEstado(@PathVariable int id) {
		estadoService.delete(id);
		return ResponseEntity.ok("Estado deletado");
	}

}
