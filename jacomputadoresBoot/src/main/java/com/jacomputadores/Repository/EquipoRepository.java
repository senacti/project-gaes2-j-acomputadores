package com.jacomputadores.Repository;

import com.jacomputadores.Entity.Equipos;
import org.springframework.data.repository.CrudRepository;

public interface EquipoRepository extends CrudRepository<Equipos, Integer> {
}
