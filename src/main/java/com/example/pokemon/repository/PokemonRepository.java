package com.example.pokemon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.pokemon.entities.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository< Pokemon , Integer> {
	
	@Query("SELECT p FROM Pokemon p WHERE p.tipo_pokemon.descripcion = :tipo")
    List<Pokemon> findByTipoPokemon(@Param("tipo") String tipo);
}
