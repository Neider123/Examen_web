package com.example.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pokemon.entities.Tipo_Pokemon;

public interface Tipo_PokemonRepository extends JpaRepository< Tipo_Pokemon , Integer> {

}
