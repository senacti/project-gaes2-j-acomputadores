package com.jacomputadores.Service;

import com.jacomputadores.Entity.Equipos;

import java.util.List;

public interface EquipoService {

    public List<Equipos> ConsultarEquipos();

    public Equipos CrearEquipos(Equipos equipos);
    public Equipos ModificarEquipos(Equipos equipos);
    public Equipos BuscarEquipos(int id);
    public void EliminarEquipos(int id);
}
