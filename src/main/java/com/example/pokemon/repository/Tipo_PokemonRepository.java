package com.example.pokemon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pokemon.entities.Pokemon;
import com.example.pokemon.entities.Tipo_Pokemon;

@Repository
public interface Tipo_PokemonRepository extends JpaRepository< Tipo_Pokemon , Integer> {


	
}
