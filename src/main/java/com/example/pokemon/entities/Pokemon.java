package com.example.pokemon.entities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Pokemon implements Serializable {
	
	
	@Id
	@SequenceGenerator(name="pokemon_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pokemon_id_seq")
	private Integer id;
	private String nombre;
	private String descripcion;
	@ManyToOne
	@JoinColumn(name="tipo_pokemon")
	private Tipo_Pokemon tipo_pokemon;
	private Date fecha_descubrimiento;
	private Integer generacion;
	private String uuid;
	

}
