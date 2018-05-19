/**
 * 
 */
package net.tecgurus.spring.boot.dto;

import java.io.Serializable;

/**
 * @author Fide
 *
 */
public class PeticionConsulta extends Request implements Serializable {
	private static final long serialVersionUID = -5167849706460512239L;
	private String id;
	private String nombre;
	private boolean estado;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}
