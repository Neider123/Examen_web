package com.example.pokemon.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;


@Entity
@Data
public class Entrenador implements Serializable {
	
	
	@Id
	@SequenceGenerator(name="entrenador_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="entrenador_id_seq")
	private Integer id;
	private String nombre;
	private String apellido;
	private String email;
	private Date fecha_nacimiento;
	private Date fecha_vinculacion;
	@ManyToOne
	@JoinColumn(name="pueblo_id")
	private Pueblo pueblo;
	private String uuid;
	
	@ManyToMany
	@JoinTable(
	    name = "entrenador_captura",
	    joinColumns = @JoinColumn(name = "entrenador_id"),
	    inverseJoinColumns = @JoinColumn(name = "pokemon_id")
	)
	private List<Pokemon> pokemons;
	
	
	
	

}
