package com.jacomputadores.Service.SeguimientoServiceIMPL;

import com.jacomputadores.Entity.Seguimiento;
import com.jacomputadores.Repository.SeguimientoRepository;
import com.jacomputadores.Service.SeguimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class SsIMPL implements SeguimientoService {

    @Autowired
    private SeguimientoRepository repo;

    @Override
    public List<Seguimiento> ConsultarSeguimiento() {
        return (List<Seguimiento>) this.repo.findAll();
    }

    @Override
    public Seguimiento CrearSeguimiento(Seguimiento seguimiento) {
        seguimiento.setId(seguimiento.getId());
        return this.repo.save(seguimiento);
    }

    @Override
    public Seguimiento ModificarSeguimiento(Seguimiento seguimiento) {
        return this.repo.save(seguimiento);
    }

    @Override
    public Seguimiento BuscarSeguimiento(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarSeguimiento(int id) {
        this.repo.deleteById(id);
    }
}
