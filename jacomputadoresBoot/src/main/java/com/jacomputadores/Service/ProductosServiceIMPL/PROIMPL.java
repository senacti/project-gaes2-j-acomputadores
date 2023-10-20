package com.jacomputadores.Service.ProductosServiceIMPL;


import com.jacomputadores.Entity.Productos;
import com.jacomputadores.Repository.Productosrepository;
import com.jacomputadores.Service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PROIMPL implements ProductosService {

    @Autowired
    private Productosrepository repo;

    @Override
    public List<Productos> consultarproductos() {
        return (List<Productos>) this.repo.findAll();
    }

    @Override
    public Productos crearproductos(Productos  Productos ) {
        Productos.setId(Productos.getId());
        return this.repo.save(Productos);
    }

    @Override
    public Productos modificarproductos(Productos Productos) {
        return this.repo.save(Productos);
    }

    @Override
    public Productos buscarproductos(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminiarproductos(int id) {

    }

    @Override
    public void eliminarproductos(int id) {
        this.repo.deleteById(id);

    }




}
