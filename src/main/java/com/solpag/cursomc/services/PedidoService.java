package com.solpag.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solpag.cursomc.domain.Pedido;
import com.solpag.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedrepo;
	
	public Pedido buscar(Integer id){
		Optional<Pedido> obj = pedrepo.findById(id);
		return obj.orElse(null);
		
	}
}
