package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalaDAO;
import com.example.demo.dto.Sala;

@Service
public class SalaServices implements ISalaServices{
	
	@Autowired
	ISalaDAO salaDAO;

	@Override
	public List<Sala> totalSalas() {
		return salaDAO.findAll();
	}

	@Override
	public void eliminaSala(int id) {
		salaDAO.deleteById(id);
	}

	@Override
	public Sala actualizaSala(Sala sala) {
		return salaDAO.save(sala);
	}

	@Override
	public Sala guardaSala(Sala sala) {
		return salaDAO.save(sala);
	}

	@Override
	public Sala ubicaPorID(int id) {
		return salaDAO.findById(id).get();
	}
}
