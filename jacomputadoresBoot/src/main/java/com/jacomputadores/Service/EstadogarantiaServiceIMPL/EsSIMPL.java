package com.jacomputadores.Service.EstadogarantiaServiceIMPL;

import com.jacomputadores.Entity.EstadoGarantia;
import com.jacomputadores.Repository.EstadogarantiaRepository;
import com.jacomputadores.Service.EstadogarantiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class EsSIMPL implements EstadogarantiaService {

    @Autowired
    private EstadogarantiaRepository repo;

    @Override
    public List<EstadoGarantia> ConsultarEstadogarantia() {
       return (List<EstadoGarantia>) this.repo.findAll();
    }

    @Override
    public EstadoGarantia CrearEstadogarantia(EstadoGarantia estadoGarantia) {
        estadoGarantia.setId(estadoGarantia.getId());
        return this.repo.save(estadoGarantia);
    }

    @Override
    public EstadoGarantia ModificarEstadogarantia(EstadoGarantia estadoGarantia) {
        return this.repo.save(estadoGarantia);
    }

    @Override
    public EstadoGarantia BuscarEstadogarantia(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarEstadogarantia(int id) {
        this.repo.deleteById(id);
    }
}
