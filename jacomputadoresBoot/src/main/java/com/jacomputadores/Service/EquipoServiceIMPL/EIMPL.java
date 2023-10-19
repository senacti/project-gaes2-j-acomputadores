package com.jacomputadores.Service.EquipoServiceIMPL;

import com.jacomputadores.Entity.Equipos;
import com.jacomputadores.Repository.EquipoRepository;
import com.jacomputadores.Service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EIMPL implements EquipoService {

    @Autowired
    private EquipoRepository repo;

    @Override
    public List<Equipos> ConsultarEquipos() {
        return (List<Equipos>) this.repo.findAll();
    }

    @Override
    public Equipos CrearEquipos(Equipos equipos) {
        equipos.setId(equipos.getId());
        return this.repo.save(equipos);
    }

    @Override
    public Equipos ModificarEquipos(Equipos equipos) {
        return this.repo.save(equipos);
    }

    @Override
    public Equipos BuscarEquipos(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarEquipos(int id) {
        this.repo.deleteById(id);
    }
}
