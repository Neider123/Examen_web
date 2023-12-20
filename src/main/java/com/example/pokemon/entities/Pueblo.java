package com.example.pokemon.entities;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Pueblo implements Serializable {
	
	@Id
	@SequenceGenerator(name="pueblo_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pueblo_id_seq")
	private Integer id;
	private String nombre;
	private String uuid;
	
	@JsonIgnore
	@OneToMany(mappedBy="pueblo")
	private List<Entrenador> entrenadores;
}
