package com.inviilia.carsDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inviilia.carsDemo.entity.Carro;
import com.inviilia.carsDemo.service.CarroService;

@CrossOrigin(origins = "*") 
@RestController()
@RequestMapping("/carros")
public class CarroController {
	@Autowired
	CarroService service;
	
	@GetMapping(value="list",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Carro> recuperarContactos() {
		return service.findCarros();
	}
	
	@GetMapping(value="list/{valor}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Carro> recuperarContactos(@PathVariable("valor") double valor) {
		return service.findCarros(valor);
	}
	
	@PostMapping(value="save",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> guardarContacto(@RequestBody Carro carro) {		
		String response = service.saveCarro(carro);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	@PutMapping(value="update",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> actualizarContacto(@RequestBody Carro carro) {		
		String response = service.updateCarro(carro);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	@DeleteMapping(value="delete/{id}")	
	public ResponseEntity<String> eliminarContacto(@PathVariable("id") int idCarro) {
		Carro carro = new Carro();
		carro.setIdCarro(idCarro);
		String response = service.deleteCarro(carro);
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
}