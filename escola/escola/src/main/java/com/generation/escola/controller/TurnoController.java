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

import com.generation.escola.entity.Turno;
import com.generation.escola.service.TurnoService;

@RestController
@CrossOrigin("*")
public class TurnoController {
	
	@Autowired
	TurnoService turnoService;
	
	@GetMapping("/turno")
	public ResponseEntity<List<Turno>> getAllTurno() {
		return ResponseEntity.ok(this.turnoService.getAll());
	}
	@GetMapping("/turno/{id}")
	public ResponseEntity<Turno> getById (@PathVariable int id){
		return ResponseEntity.ok(turnoService.getById(id));
	}
	
	@PostMapping("/turno")
	public ResponseEntity<Turno> postTurno (@RequestBody Turno turno){
		return ResponseEntity.ok(turnoService.insertOrUpdate(turno));
		
	}
	@PutMapping("/turno")
	public ResponseEntity<Turno> putTurno (@RequestBody Turno turno){
		return ResponseEntity.ok(turnoService.insertOrUpdate(turno));
	}
	@DeleteMapping("/turno/{id}")
	public ResponseEntity<String> deleteTurno(@PathVariable int id) {
		turnoService.delete(id);
		return ResponseEntity.ok("Turno deletado");
	}

}
