package net.tecgurus.spring.boot.dto;

public class Response {
	/**
	 * 
	 */
	private String token;
	private String codigo;
	private String codigo_descripcion;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCodigo_descripcion() {
		return codigo_descripcion;
	}
	public void setCodigo_descripcion(String codigo_descripcion) {
		this.codigo_descripcion = codigo_descripcion;
	}
	
}
