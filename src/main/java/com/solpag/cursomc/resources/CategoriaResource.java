package com.solpag.cursomc.resources;


import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.solpag.cursomc.domain.Categoria;
import com.solpag.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService catservice;
	
	@GetMapping(value="/{id}")	
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = catservice.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Categoria obj){
		obj = catservice.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> update(@RequestBody Categoria obj, @PathVariable Integer id){
		obj.setId(id);
		obj = catservice.update(obj);
		return ResponseEntity.noContent().build();
	}
}
