package com.jacomputadores.Service;

import com.jacomputadores.Entity.Inventario;

import java.util.List;

public interface InventarioService {



    public List<Inventario> consultarinventario();
    public Inventario Crearinvetario(Inventario inventario);
    public Inventario Modificarinventario(Inventario inventario);
    public Inventario buscarinventario(int id);
    public void eliminarinventario(int id );
}
