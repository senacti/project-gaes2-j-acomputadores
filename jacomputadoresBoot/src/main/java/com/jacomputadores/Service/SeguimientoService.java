package com.jacomputadores.Service;

import com.jacomputadores.Entity.Seguimiento;

import java.util.List;

public interface SeguimientoService {

    public List<Seguimiento> ConsultarSeguimiento();

    public Seguimiento CrearSeguimiento(Seguimiento seguimiento);

    public Seguimiento ModificarSeguimiento(Seguimiento seguimiento);

    public Seguimiento BuscarSeguimiento(int id);

    public void EliminarSeguimiento(int id);
}
