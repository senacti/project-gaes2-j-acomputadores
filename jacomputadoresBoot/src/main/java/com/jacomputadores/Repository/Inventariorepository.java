package com.jacomputadores.Repository;

import com.jacomputadores.Entity.Inventario;
import org.springframework.data.repository.CrudRepository;

public interface Inventariorepository extends CrudRepository<Inventario, Integer> {
}
