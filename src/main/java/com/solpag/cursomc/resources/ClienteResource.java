package com.solpag.cursomc.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solpag.cursomc.domain.Cliente;
import com.solpag.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService cliservice;
	
	@GetMapping(value="/{id}")	
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = cliservice.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
