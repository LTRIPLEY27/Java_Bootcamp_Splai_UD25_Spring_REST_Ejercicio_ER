package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculaDAO;
import com.example.demo.dto.Pelicula;

@Service
public class PeliculaServices implements IPeliculaServices{
	
	@Autowired
	IPeliculaDAO peliDAO;

	@Override
	public Pelicula agregaPelicula(Pelicula peli) {
		return peliDAO.save(peli);
	}

	@Override
	public Pelicula ubicaPorID(int id) {
		return peliDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizaPelicula(Pelicula peli) {
		return peliDAO.save(peli);
	}

	@Override
	public void eliminaPelicula(int id) {
		peliDAO.deleteById(id);
	}

	@Override
	public List<Pelicula> totalPeliculas() {
		return peliDAO.findAll();
	}

}
