package com.generation.lojaInformatica.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojaInformatica.model.Loja;
import com.generation.lojaInformatica.service.LojaService;
import com.generation.lojaInformatica.service.impl.LojaServiceImpl;

@CrossOrigin("*")
@RestController

public class LojaController {
	LojaService lojaService = new LojaServiceImpl();

	@GetMapping("/loja/")
	public List<Loja> getAll() {
		return lojaService.getAll();
	}

	@PostMapping("/loja")
	public ResponseEntity<Loja> insert(@RequestBody Loja loja) {
		return ResponseEntity.ok(lojaService.insert(loja));
		

	}

}
