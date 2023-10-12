package com.jacomputadores.Service;

import com.jacomputadores.Entity.Garantia;

import java.util.List;

public interface GarantiaService {

    public List<Garantia> ConsultarGarantia();

    public Garantia CrearGarantia(Garantia garantia);
    public Garantia ModificarGarantia(Garantia garantia);
    public Garantia BuscarGarantia(int id);
    public void EliminarGarantia(int id);
}
