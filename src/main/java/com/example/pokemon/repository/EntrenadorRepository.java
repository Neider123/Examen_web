package com.example.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pokemon.entities.Entrenador;


@Repository
public interface EntrenadorRepository extends JpaRepository< Entrenador , Integer> {

}
