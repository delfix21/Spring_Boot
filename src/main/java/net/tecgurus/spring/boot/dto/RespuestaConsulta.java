/**
 * 
 */
package net.tecgurus.spring.boot.dto;

import java.io.Serializable;

/**
 * @author Fide
 *
 */
public class RespuestaConsulta extends Response implements Serializable {
	private static final long serialVersionUID = -2375917247886054189L;
	private String id;
	private String nombre;
	private String apellido;
	private int edad;
	private String nacionalidad;
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
}
