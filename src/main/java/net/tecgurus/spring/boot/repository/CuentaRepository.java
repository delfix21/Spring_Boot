package net.tecgurus.spring.boot.repository;

import org.springframework.data.repository.Repository;

import net.tecgurus.spring.boot.model.Cuenta;

public interface CuentaRepository extends Repository<Cuenta, Long> {

	<S extends Cuenta> S save(S entity);

}
