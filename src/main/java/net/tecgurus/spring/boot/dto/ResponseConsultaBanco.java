package net.tecgurus.spring.boot.dto;

import java.io.Serializable;
import java.util.List;

import net.tecgurus.spring.boot.model.Banco;

public class ResponseConsultaBanco extends Response implements Serializable {

	private static final long serialVersionUID = 4282279892050182628L;

	private List<Banco> lista;
	private Banco banco;

	public List<Banco> getLista() {
		return lista;
	}

	public void setLista(List<Banco> lista) {
		this.lista = lista;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

}
