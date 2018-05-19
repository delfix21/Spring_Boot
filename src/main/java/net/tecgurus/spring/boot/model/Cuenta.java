package net.tecgurus.spring.boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuenta {

	@Id
	private int idCuenta;
	private int numeroCuenta;
	private int idTipoCuenta;
	private int idCLiente;

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getIdTipoCuenta() {
		return idTipoCuenta;
	}

	public void setIdTipoCuenta(int idTipoCuenta) {
		this.idTipoCuenta = idTipoCuenta;
	}

	public int getIdCLiente() {
		return idCLiente;
	}

	public void setIdCLiente(int idCLiente) {
		this.idCLiente = idCLiente;
	}

}
