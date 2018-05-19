package net.tecgurus.spring.boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoMovimiento {

	@Id
	private int idTipoMovimiento;
	private String nombre;

	public int getIdTipoMovimiento() {
		return idTipoMovimiento;
	}

	public void setIdTipoMovimiento(int idTipoMovimiento) {
		this.idTipoMovimiento = idTipoMovimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
