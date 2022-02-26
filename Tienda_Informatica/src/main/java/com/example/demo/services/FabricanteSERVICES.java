package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricanteDAO;
import com.example.demo.dto.Fabricante;

// INDICAR CON EL DECORADOR @SERVICE ES IMPERATIVO

@Service
public class FabricanteSERVICES implements IFabricanteSERVICES {//IMPLEMENTA LA INTERFAZ ISERVICES
	
	@Autowired  ///DEBEMOS DE INVOCAR A LA INTEFAZ DAO DE LA CLASE PARA ACCEDER A SUS MÉTODOS Y ATRIBUTOS
	IFabricanteDAO fabricanteDAO;

	@Override
	public List<Fabricante> totalFabricante() {
		
		return fabricanteDAO.findAll();
	} 

}
