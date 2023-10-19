package com.jacomputadores.Service;

import com.jacomputadores.Entity.FichaMantenimientos;

import java.util.List;

public interface FichaMantenimientoService {

    public List<FichaMantenimientos> ConsultarFichaMantenimientos();

    public FichaMantenimientos CrearFichaMantenimientos(FichaMantenimientos fichaMantenimientos);
    public FichaMantenimientos ModificarFichaMantenimientos(FichaMantenimientos fichaMantenimientos);
    public FichaMantenimientos BuscarFichaMantenimientos(int id);
    public void EliminarFichaMantenimientos(int id);
}
