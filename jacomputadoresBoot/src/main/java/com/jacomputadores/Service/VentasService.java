package com.jacomputadores.Service;

import com.jacomputadores.Entity.Ventas;

import java.util.List;

public interface VentasService {

    public List<Ventas> ConsultarVenta();

    public Ventas CrearVenta(Ventas ventas);

    public Ventas ModificarVenta(Ventas ventas);

    public Ventas BuscarVenta(int id);

    public void EliminarVenta(int id);
}
