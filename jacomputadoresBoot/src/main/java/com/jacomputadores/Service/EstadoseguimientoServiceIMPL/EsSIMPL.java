package com.jacomputadores.Service.EstadoseguimientoServiceIMPL;

import com.jacomputadores.Entity.EstadoSegumiento;
import com.jacomputadores.Repository.EstadosegumientoRepository;
import com.jacomputadores.Service.EstadoseguimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EsSIMPL implements EstadoseguimientoService {

    @Autowired
    private EstadosegumientoRepository repo;

    @Override
    public List<EstadoSegumiento> ConsultarEstadoSeguimiento() {
        return (List<EstadoSegumiento>) this.repo.findAll();
    }

    @Override
    public EstadoSegumiento CrearEstadoSeguimiento(EstadoSegumiento estadoSegumiento) {
        estadoSegumiento.setId(estadoSegumiento.getId());
        return this.repo.save(estadoSegumiento);
    }

    @Override
    public EstadoSegumiento ModificarEstadoSeguimiento(EstadoSegumiento estadoSegumiento) {
        return this.repo.save(estadoSegumiento);
    }

    @Override
    public EstadoSegumiento BuscarEstadoSeguimiento(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarEstadoSeguimiento(int id) {
        this.repo.deleteById(id);
    }
}
