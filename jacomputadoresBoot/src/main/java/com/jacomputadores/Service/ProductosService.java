package com.jacomputadores.Service;

import com.jacomputadores.Entity.Productos;

import java.util.List;

public interface ProductosService {


    public List<Productos> consultarproductos();

    public Productos crearproductos(Productos Productos);
    public  Productos modificarproductos(Productos Productos);
    public Productos buscarproductos(int id);
    public void eliminiarproductos(int id);

    void eliminarproductos(int id);
}
