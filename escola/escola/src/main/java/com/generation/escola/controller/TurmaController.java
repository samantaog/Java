package com.generation.escola.controller;

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

import com.generation.escola.entity.Turma;
import com.generation.escola.service.TurmaService;

@RestController
@CrossOrigin("*")
public class TurmaController {

	@Autowired
	private TurmaService turmaService;

	@GetMapping("/turma")
	public ResponseEntity<List<Turma>> getAllTurma() {
		return ResponseEntity.ok(this.turmaService.getAll());
	}

	@GetMapping("/turma/{id}")
	public ResponseEntity<Turma> getByIdTurma(@PathVariable int id) {
		return ResponseEntity.ok(turmaService.getById(id));
	}

	@PostMapping("/turma")
	public ResponseEntity<Turma> postTurma(@RequestBody Turma turma) {
		return ResponseEntity.ok(turmaService.insertOrUpdate(turma));
	}

	@PutMapping("/turma")
	public ResponseEntity<Turma> putTurma(@RequestBody Turma turma) {
		return ResponseEntity.ok(turmaService.insertOrUpdate(turma));
	}

	@DeleteMapping("/turma/{id}")
	public ResponseEntity<String> deleteTurma(@PathVariable int id) {
		turmaService.delete(id);
		return ResponseEntity.ok("Turma deletada");
	}

}
