package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Pelicula;
import com.example.demo.services.PeliculaServices;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServices peliSERV;
	
	@GetMapping("/peliculas")
	public List<Pelicula> totaPeliculas(){
		return peliSERV.totalPeliculas();
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula ubicaPorId(@PathVariable (name = "id") int id) {
		return peliSERV.ubicaPorID(id);
	}
	
	@PostMapping("/peliculas/add")
	public Pelicula guardaPelicula(@RequestBody Pelicula pelicula) {
		return peliSERV.agregaPelicula(pelicula);
	}
	
	@DeleteMapping("/peliculas/{id}/elimina")
	public void eliminaPelicula(@PathVariable (name = "id") int id) {
		peliSERV.eliminaPelicula(id);
	}
	
	@PutMapping("/peliculas/{id}/actualiza")
	public Pelicula actualizaPelicula(@PathVariable(name = "id") int id, @RequestBody Pelicula pelicula) {
		Pelicula pelSEL = new Pelicula();
		Pelicula pelACTUAL = new Pelicula();
		
		pelSEL = peliSERV.ubicaPorID(id);
		pelSEL.setNombre(pelicula.getNombre());
		pelSEL.setCalificacion_edad(pelicula.getCalificacion_edad());
		pelACTUAL = pelSEL;
		return pelACTUAL;
	}
}
