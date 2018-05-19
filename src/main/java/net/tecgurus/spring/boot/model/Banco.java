package net.tecgurus.spring.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;

//anotacion que inyecta las dependencias
//persistencia es guardar en base de datos 

@Entity

@NamedQuery(name = "Banco.buscarPorNombreSQL", query = "SELECT b FROM Banco b where b.nombre = :parametro")
@NamedStoredProcedureQuery (name = "Banco.spObtenerBancos", procedureName="sp_obtener_bancos", resultClasses = {Banco.class})

public class Banco {

	@Id 
	@Column(name="idBanco")
	private int idBanco; // nombre de la columna
	private String nombre;// nombre de la columna

	public int getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
