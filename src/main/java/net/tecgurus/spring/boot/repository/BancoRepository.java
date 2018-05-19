package net.tecgurus.spring.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.tecgurus.spring.boot.model.Banco;

//CrudRepository esta contenido en el springFramework data
@Repository
public interface BancoRepository extends CrudRepository<Banco, Long> {
	
	//where nombre = _nombre
	List<Banco> findByNombre(String nombre);
	
	//where nombre = _nombre and idBanco = _idBanco
	List<Banco> findByNombreAndIdBanco(String nombre, long idBanco);
	
	// where like nombre '%busqueda%'
	List<Banco> findByNombreContains(String busqueda);
	
	//Buscar por SQL 
	List<Banco> buscarPorNombreSQL(@Param("parametro") String parametro);
	
	
	//Ejecutar SP
	@Procedure(name = "spObtenerBancos")
	List<Banco> spObtenerBancos();
	
}
