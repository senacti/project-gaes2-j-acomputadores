package com.jacomputadores.Repository;

import com.jacomputadores.Entity.Ventas;
import org.springframework.data.repository.CrudRepository;

public interface VentasRepository extends CrudRepository<Ventas, Integer> {
}
