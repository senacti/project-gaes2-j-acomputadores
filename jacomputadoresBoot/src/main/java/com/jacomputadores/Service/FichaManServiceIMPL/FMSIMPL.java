package com.jacomputadores.Service.FichaManServiceIMPL;

import com.jacomputadores.Entity.FichaMantenimientos;
import com.jacomputadores.Repository.FichamantenimientosRepository;
import com.jacomputadores.Service.FichaMantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FMSIMPL implements FichaMantenimientoService {

    @Autowired
    private FichamantenimientosRepository repo;

    @Override
    public List<FichaMantenimientos> ConsultarFichaMantenimientos() {
        return (List<FichaMantenimientos>) this.repo.findAll();
    }

    @Override
    public FichaMantenimientos CrearFichaMantenimientos(FichaMantenimientos fichaMantenimientos) {
        fichaMantenimientos.setId(fichaMantenimientos.getId());
        return this.repo.save(fichaMantenimientos);
    }

    @Override
    public FichaMantenimientos ModificarFichaMantenimientos(FichaMantenimientos fichaMantenimientos) {
        return this.repo.save(fichaMantenimientos);
    }

    @Override
    public FichaMantenimientos BuscarFichaMantenimientos(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarFichaMantenimientos(int id) {
        this.repo.deleteById(id);
    }
}
