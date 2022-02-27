package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "calificacion_edad")
	private int calificacion_edad;
	
	@OneToMany
	@JoinColumn(name = "id_pelicula")
	private List<Sala> salas;
	
	public Pelicula() {
		
	}

	public Pelicula(int id, String nombre, int calificacion_edad, List<Sala> salas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calificacion_edad = calificacion_edad;
		this.salas = salas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalificacion_edad() {
		return calificacion_edad;
	}

	public void setCalificacion_edad(int calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", calificacion_edad=" + calificacion_edad + ", salas="
				+ salas + "]";
	}
}
