package com.example.pokemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pokemon.entities.Entrenador;
import com.example.pokemon.repository.EntrenadorRepository;

@RestController
@RequestMapping("/entrenador")
public class EntrenadorController {
	
	@Autowired
	EntrenadorRepository entrenadorRepository;
	
	  /**
	  @PostMapping("/login")
	   public Entrenador login(@RequestBody Entrenador entrenador) {
	        Optional<Entrenador> entrenador = entrenadorRepository
	        if (entrenador == null) {
	            return null;
	        }else {
	        	return entrenador.getUuid();
	        }

	        return null;
	    }
	    **/

}
