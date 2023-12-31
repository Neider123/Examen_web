package com.example.pokemon.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pokemon.entities.Pokemon;
import com.example.pokemon.repository.PokemonRepository;
import com.example.pokemon.repository.Tipo_PokemonRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/pokemons")
@RestController
public class PokemonController {
	
	@Autowired
	PokemonRepository pokemonRepository;
	
	@Autowired
	Tipo_PokemonRepository tipo;
	
	@GetMapping
	public List<Pokemon> getCategoriaAll () {
		return pokemonRepository.findAll();
	}
	
	/**
	@GetMapping("/{id}")
	public Pokemon getPokemonbyId(@PathVariable Integer id) {
		
		Optional<Pokemon> pokemon = pokemonRepository.findById(id);
		if(pokemon.isPresent()) {
			return pokemon.get();
		}
		return null;
	}
	**/
	
	@PostMapping
	public Pokemon postCategoriasbyId(@RequestBody Pokemon pokemon) {
		
		pokemonRepository.save(pokemon);
		return pokemon;
	}
	
	
	
	
	
	@GetMapping("/{tipo}")
	 public List<Pokemon> getPokemonByTipo(@PathVariable String tipo) {
	        // Utiliza el método del repositorio para buscar vehículos por color
	        return pokemonRepository.findByTipoPokemon(tipo);
	 }
	   
	
	

}
