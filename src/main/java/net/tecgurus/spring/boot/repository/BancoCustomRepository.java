package net.tecgurus.spring.boot.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.tecgurus.spring.boot.model.Banco;

@Repository
public class BancoCustomRepository {

	@Autowired
	private EntityManager entityManager;
	
	public List<Banco> obtenerBancosSP(){
		StoredProcedureQuery spq = entityManager.createStoredProcedureQuery("sp_obtener_bancos", Banco.class);
		return spq.getResultList();			
	}
}
