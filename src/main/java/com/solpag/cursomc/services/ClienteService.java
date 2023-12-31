package com.solpag.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solpag.cursomc.domain.Cliente;
import com.solpag.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clirepo;
	
	public Cliente buscar(Integer id){
		Optional<Cliente> obj = clirepo.findById(id);
		return obj.orElse(null);
		
	}
}
