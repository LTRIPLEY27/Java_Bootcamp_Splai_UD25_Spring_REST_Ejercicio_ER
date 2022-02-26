package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Fabricante;
import com.example.demo.services.FabricanteSERVICES;

/*
 * @author: Isabel Calzadilla
 * UD25 : SPRING-REST-ER
 * EJRCICIO1 : TIENDA INFORMÁTICA
 * */


//INDICAR LOS DECORADORES 
@RestController
@RequestMapping("/api")
public class FabricanteCONTROLLER {

	//debemos de invocar con el @autowired a la clase service para hacer uso de sus métodos
	@Autowired
	FabricanteSERVICES fabSERVICES;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> totalFabricantes(){
		return fabSERVICES.totalFabricante();
	}
}
