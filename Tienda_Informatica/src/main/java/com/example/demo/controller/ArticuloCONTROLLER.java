package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Articulo;
import com.example.demo.services.ArticuloSERVICES;

@RestController
@RequestMapping("/api")
public class ArticuloCONTROLLER {

	@Autowired
	ArticuloSERVICES articuloSERVICES;
	
	@GetMapping("/articulos")
	public List<Articulo> totalArticulo(){
		return articuloSERVICES.totalArticulos();
	}
}
