package com.solpag.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solpag.cursomc.domain.Categoria;
import com.solpag.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository catrepo;
	
	public Categoria buscar(Integer id){
		Optional<Categoria> obj = catrepo.findById(id);
		return obj.orElse(null);
		
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return catrepo.save(obj);
	}
}
