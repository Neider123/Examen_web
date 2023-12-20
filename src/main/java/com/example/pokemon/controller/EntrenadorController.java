package com.example.pokemon.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pokemon.entities.Entrenador;
import com.example.pokemon.entities.Pokemon;
import com.example.pokemon.repository.EntrenadorRepository;

@RestController
@RequestMapping("/entrenador")
public class EntrenadorController {
	
	@Autowired
	EntrenadorRepository entrenadorRepository;
	
	
	@GetMapping
	public List<Entrenador> getCategoriaAll () {
		return entrenadorRepository.findAll();
	}
	
	  
	@GetMapping("login/{email}")
	 public List<Entrenador> getEntrenadorByEmail(@PathVariable String email) {
	        // Utiliza el método del repositorio para buscar vehículos por color
	        return entrenadorRepository.findByEmail(email);
	 }

}
