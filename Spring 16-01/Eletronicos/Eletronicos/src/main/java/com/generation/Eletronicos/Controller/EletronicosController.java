package com.generation.Eletronicos.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.Eletronicos.Model.Computador;
import com.generation.Eletronicos.Model.Smartphone;
import com.generation.Eletronicos.Model.TV;

@CrossOrigin("*")
@RestController

public class EletronicosController {
	List<Computador> listComputador = new ArrayList<Computador>();
	List<Smartphone> listSmartphone = new ArrayList<Smartphone>();
	List<TV> listTv = new ArrayList<TV>();

	@GetMapping("/computador")
	List<Computador> getAllComputador() {
		listComputador.add(new Computador("i5", "6Gb", 20));
		listComputador.add(new Computador("i3", "4Gb", (float) 21.5));
		listComputador.add(new Computador("i7", "8Gb", 29));
		return listComputador;
	}

	@GetMapping("/smartphone")
	List<Smartphone> getAllSmartphone() {
		listSmartphone.add(new Smartphone("Galaxy", "32GB", 5));
		listSmartphone.add(new Smartphone("Xiaomi", "128GB", 6));
		listSmartphone.add(new Smartphone("Moto G", "64GB", 6));
		return listSmartphone;
	}

	@GetMapping("/tv")
	List<TV> getAllTV() {
		listTv.add(new TV(55, "Samsung", 2019));
		listTv.add(new TV(60, "LG", 2020));
		listTv.add(new TV(49, "Panasonic", 2018));
		return listTv;
	}

}
