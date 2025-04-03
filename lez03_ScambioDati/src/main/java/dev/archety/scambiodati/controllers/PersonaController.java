package dev.archety.scambiodati.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.archety.scambiodati.models.Persona;

@RestController
@RequestMapping("persona")
public class PersonaController {
	
	@GetMapping("dettaglio")
	public Persona restituisciPersona() {
		Persona per = new Persona("Giovanni", "Pace", 36);
		
		return per;
	}
	
	@GetMapping("elenco")
	public List<Persona> elencoPersone(){
		List<Persona> elenco = new ArrayList<Persona>();
		
		elenco.add(new Persona("Giovanni", "Pace", 36));
		elenco.add(new Persona("Valeria", "Verdi", 35));
		elenco.add(new Persona("Marika", "Mariko", 24));
		
		return elenco;			
	}
	
	@GetMapping("nuova")
	public Persona nuovaPersona(
			@RequestParam(name="nom") String varNome,
			@RequestParam(name="cog") String varCognome,
			@RequestParam(name="eta") int varEta) {
		
		Persona per = new Persona(varNome, varCognome, varEta);
		return per;
	}
	
	@PostMapping("inserisci")
	public Persona inserisciPersona(@RequestBody Persona per) {
		return per;
	}

}
