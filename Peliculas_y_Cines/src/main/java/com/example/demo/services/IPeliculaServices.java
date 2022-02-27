package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Pelicula;

public interface IPeliculaServices {

	public Pelicula agregaPelicula(Pelicula peli);		//CREATE
	public Pelicula ubicaPorID(int id);					//READ
	public Pelicula actualizaPelicula(Pelicula peli);	//UPDATE
	public void eliminaPelicula(int id);				//DELETE
	public List<Pelicula> totalPeliculas();
	
}
