package com.example.pokemon.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pokemon.entities.Entrenador;


@Repository
public interface EntrenadorRepository extends JpaRepository< Entrenador , Integer> {

	public List<Entrenador> findByEmail(String email);

}
