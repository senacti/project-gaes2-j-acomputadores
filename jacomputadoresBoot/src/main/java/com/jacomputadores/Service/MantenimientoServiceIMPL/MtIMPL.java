package com.jacomputadores.Service.MantenimientoServiceIMPL;

import com.jacomputadores.Entity.Mantenimientos;
import com.jacomputadores.Repository.MantenimientoRepository;
import com.jacomputadores.Service.MantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MtIMPL  implements MantenimientoService {
    @Autowired
    private MantenimientoRepository repo;

    @Override
    public List<Mantenimientos> ConsultarMantenimientos() {
        return (List<Mantenimientos>) this.repo.findAll();
    }

    @Override
    public Mantenimientos CrearMantenimientos(Mantenimientos mantenimientos) {
        mantenimientos.setId(mantenimientos.getId());
        return this.repo.save(mantenimientos);
    }

    @Override
    public Mantenimientos ModificarMantenimientos(Mantenimientos mantenimientos) {
        return this.repo.save(mantenimientos);
    }

    @Override
    public Mantenimientos BuscarMantenimientos(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarMantenimientos(int id) {
        this.repo.deleteById(id);
    }
}
