package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Sala;

public interface ISalaServices {

	public List<Sala> totalSalas();
	public void eliminaSala(int id);
	public Sala actualizaSala(Sala sala);
	public Sala guardaSala(Sala sala);
	public Sala ubicaPorID(int id);
}
