package com.example.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.pokemon.entities.Pokemon;

public interface PokemonRepository extends JpaRepository< Pokemon , Integer> {

}
