package com.jacomputadores.Service;

import com.jacomputadores.Entity.EstadoSegumiento;
import java.util.List;

public interface EstadoseguimientoService {

    public List<EstadoSegumiento> ConsultarEstadoSeguimiento();

    public EstadoSegumiento CrearEstadoSeguimiento(EstadoSegumiento estadoSegumiento);

    public EstadoSegumiento ModificarEstadoSeguimiento(EstadoSegumiento estadoSegumiento);

    public EstadoSegumiento BuscarEstadoSeguimiento(int id);

    public void EliminarEstadoSeguimiento(int id);
}
