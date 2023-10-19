package com.jacomputadores.Service;

import com.jacomputadores.Entity.Mantenimientos;

import java.util.List;

public interface MantenimientoService {

    public List<Mantenimientos> ConsultarMantenimientos();

    public Mantenimientos CrearMantenimientos(Mantenimientos mantenimientos);
    public Mantenimientos ModificarMantenimientos(Mantenimientos mantenimientos);
    public Mantenimientos BuscarMantenimientos(int id);
    public void EliminarMantenimientos(int id);
}
