package net.tecgurus.spring.boot.repository;

import org.springframework.data.repository.Repository;

import net.tecgurus.spring.boot.model.TipoMovimiento;

public interface TipoMovimientoRepository extends Repository<TipoMovimiento, Long>{

	<S extends TipoMovimiento> S save(S entity);

}
