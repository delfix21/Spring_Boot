/**
 * 
 */
package net.tecgurus.spring.boot.dto;

import java.util.Date;

/**
 * @author Fide
 *
 */
public class Request {
	
	/**
	 * 
	 */
	private String token;
	private String usuario;
	private String operacion;
	private String ip;
	private Date fecha;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
