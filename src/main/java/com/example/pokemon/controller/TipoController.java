package com.example.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.pokemon.entities.Pokemon;
import com.example.pokemon.entities.Tipo_Pokemon;
import com.example.pokemon.repository.Tipo_PokemonRepository;

@RestController
@RequestMapping("/tipo")
public class TipoController {
	
	@Autowired
	Tipo_PokemonRepository tipo_PokemonRepository;
	
	/**
	@GetMapping("/{tipo_pokemon}/pokemons")
	public List<Pokemon> getPokemonsbyTipo(@PathVariable String tipo) {
		
		List<Tipo_Pokemon> tipoPokemon = tipoRepository.findByTipo(tipo);
		
		if (!tipoPokemon.isEmpty()) {
			return tipoPokemon.get(0).getPokemons();
		}
		
		return null;

	}
	*/

}
