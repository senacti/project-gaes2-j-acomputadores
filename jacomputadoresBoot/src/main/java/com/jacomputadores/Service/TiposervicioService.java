package com.jacomputadores.Service;

import com.jacomputadores.Entity.TipoServicio;

import java.util.List;

public interface TiposervicioService {

    public List<TipoServicio> ConsultarTipoServicio();

    public TipoServicio CrearTipoServicio(TipoServicio tipoServicio);

    public  TipoServicio ModificarTipoServicio(TipoServicio tipoServicio);

    public TipoServicio BuscarTipoServicio(int id);

    public void EliminarTipoServicio(int id);
}
