package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.AbstractFallbackSQLExceptionTranslator;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Sala;
import com.example.demo.services.SalaServices;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServices salaSERV;
	
	@DeleteMapping("/salas/{id}/elimina")
	public void eliminaSala(@PathVariable (name = "id") int id) {
		salaSERV.eliminaSala(id);
	}
	
	@GetMapping("/salas/{id}")
	public Sala ubicaPorId(@PathVariable (name = "id") int id) {
		return salaSERV.ubicaPorID(id);
	}
	@PostMapping("/salas/add")
	public Sala agregaSala(@RequestBody Sala sala) {
		return salaSERV.guardaSala(sala);
	}
	
	@PutMapping("/salas/{id}/actualiza")
	public Sala actualizaSala(@PathVariable (name = "id") int id, @RequestBody Sala sala) {
		Sala salaSEL = new Sala();
		Sala salaACTUAL = new Sala();
		
		salaSEL = salaSERV.ubicaPorID(id);
		salaSEL.setNombre(sala.getNombre());
		salaSEL.setPelicula(sala.getPelicula());
		
		salaACTUAL = salaSEL;
		
		return salaACTUAL;
	}
	
	@GetMapping("/salas")
	public List<Sala> totalSalas(){
		return salaSERV.totalSalas();
	}
}
