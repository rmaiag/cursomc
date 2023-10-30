package com.solpag.cursomc.domain;

import java.util.Date;

import com.solpag.cursomc.domain.enums.EstadoPagamento;

import jakarta.persistence.Entity;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;
	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		
	}

	public PagamentoComBoleto(Integer id, Pedido pedido, EstadoPagamento estado, Date dataVencimento, Date dataPagamento) {
		super(id, pedido, estado);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}



	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}