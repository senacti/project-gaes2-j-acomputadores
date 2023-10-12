package com.jacomputadores.Service;

import com.jacomputadores.Entity.EstadoGarantia;

import java.util.List;

public interface EstadogarantiaService {

    public List<EstadoGarantia> ConsultarEstadogarantia();

    public EstadoGarantia CrearEstadogarantia(EstadoGarantia estadoGarantia);
    public EstadoGarantia ModificarEstadogarantia(EstadoGarantia estadoGarantia);
    public EstadoGarantia BuscarEstadogarantia(int id);
    public void EliminarEstadogarantia(int id);
}
