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
public class Tipo_Pokemon implements Serializable {
	
	
	@Id
	@SequenceGenerator(name="tipo_pokemon_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tipo_pokemon_id_seq")
	private Integer id;
	private String descripcion;
	private String uuid;
	
	@JsonIgnore
	@OneToMany(mappedBy="tipo")
	private List<Pokemon> pokemons;
	

}
