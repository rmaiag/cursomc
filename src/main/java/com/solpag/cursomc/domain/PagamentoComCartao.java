package com.solpag.cursomc.domain;

import com.solpag.cursomc.domain.enums.EstadoPagamento;

import jakarta.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	

	public PagamentoComCartao(Integer id, Pedido pedido, EstadoPagamento estado, Integer numeroDeParcelas) {
		super(id, pedido, estado);
		this.numeroDeParcelas = numeroDeParcelas;
	}



	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
