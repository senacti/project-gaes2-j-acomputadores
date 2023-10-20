package com.jacomputadores.Service.CalificacionesServiceIMPL;


import com.jacomputadores.Entity.Calificaciones;
import com.jacomputadores.Repository.CalificacionesRepository;
import com.jacomputadores.Service.CalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CALIMPL implements CalificacionesService {

    @Autowired
    private CalificacionesRepository repo;

    public List<Calificaciones> consultarcalificaciones () {
        return (List<Calificaciones>) this.repo.findAll();
    }

    @Override
    public Calificaciones crearcalificaiones (Calificaciones  Calificaciones  ) {
        Calificaciones.setId(Calificaciones.getId());
        return this.repo.save(Calificaciones);
    }

    @Override
    public Calificaciones modificarcalifiaciones(Calificaciones Calificaciones) {
        return this.repo.save(Calificaciones);
    }

    @Override
    public Calificaciones buscarcalificaciones(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarcalificaciones(int id) {
        this.repo.deleteById(id);

    }
}


