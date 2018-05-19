package net.tecgurus.spring.boot.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movimiento {

	@Id
	private int idMoviemiento;
	private Date fecha;
	private BigDecimal monto;
	private int idTipoMovimiento;
	private int idCuenta;

	public int getIdMoviemiento() {
		return idMoviemiento;
	}

	public void setIdMoviemiento(int idMoviemiento) {
		this.idMoviemiento = idMoviemiento;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public int getIdTipoMovimiento() {
		return idTipoMovimiento;
	}

	public void setIdTipoMovimiento(int idTipoMovimiento) {
		this.idTipoMovimiento = idTipoMovimiento;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

}
