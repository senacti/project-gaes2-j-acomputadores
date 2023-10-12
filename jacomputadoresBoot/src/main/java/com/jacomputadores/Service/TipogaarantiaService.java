package com.jacomputadores.Service;

import com.jacomputadores.Entity.TipoGarantia;

import java.util.List;

public interface TipogaarantiaService {

    public List<TipoGarantia> ConsultarTipoGarantia();

    public TipoGarantia CrearTipoGarantia(TipoGarantia tipoGarantia);
    public TipoGarantia ModificarTipoGarantia(TipoGarantia tipoGarantia);
    public TipoGarantia BuscarTipoGarantia(int id);
    public void EliminarTipoGarantia(int id);
}
