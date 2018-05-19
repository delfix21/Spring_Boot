package net.tecgurus.spring.boot.dto;

import java.io.Serializable;

import net.tecgurus.spring.boot.model.Banco;

public class PeticionCrearBanco extends Request  implements Serializable{
		
	private static final long serialVersionUID = -7430205423512874174L;
	private Banco banco;

		public Banco getBanco() {
			return banco;
		}

		public void setBanco(Banco banco) {
			this.banco = banco;
		}
		
		
}
