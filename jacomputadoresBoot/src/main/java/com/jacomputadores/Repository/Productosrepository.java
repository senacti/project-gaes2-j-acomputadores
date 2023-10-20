package com.jacomputadores.Repository;

import com.jacomputadores.Entity.Productos;
import org.springframework.data.repository.CrudRepository;

public interface Productosrepository  extends CrudRepository<Productos , Integer> {

}
