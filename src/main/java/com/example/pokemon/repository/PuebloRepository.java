package com.example.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pokemon.entities.Pueblo;

@Repository
public interface PuebloRepository extends JpaRepository< Pueblo , Integer> {

}
