package com.solpag.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.solpag.cursomc.domain.Categoria;
import com.solpag.cursomc.repositories.CategoriaRepository;
import com.solpag.cursomc.services.exceptions.DataIntegrityException;
import com.solpag.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository catrepo;
	
	public Categoria buscar(Integer id){
		Optional<Categoria> obj = catrepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id: " + id + " Tipo: " + Categoria.class.getName()));
		
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return catrepo.save(obj);
	}
	public Categoria update(Categoria obj) {
		buscar(obj.getId());
		return catrepo.save(obj);
	}
	
	public void delete (Integer id) {
		try {
		catrepo.deleteById(id);
		}
		catch (DataIntegrityViolationException e){
			throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos");
			
		}
	}
	
	public List<Categoria> fndAll(){
		return catrepo.findAll();
	}
}
