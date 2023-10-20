package com.jacomputadores.Service.SalidasServiceIMPL;


import com.jacomputadores.Entity.Salidas;
import com.jacomputadores.Repository.Salidasrepository;
import com.jacomputadores.Service.Salidasservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SLIMPL  implements Salidasservice {

    @Autowired
    private Salidasrepository repo;

    @Override
    public List<Salidas> consultarsalida() {
        return (List<Salidas>) this.repo.findAll();
    }

    @Override
    public Salidas crearsalidad(Salidas Salidas) {
        Salidas.setId(Salidas.getId());
        return this.repo.save(Salidas);
    }

    @Override
    public Salidas modificarsalida(Salidas Salidas) {
        return this.repo.save(Salidas);
    }

    @Override
    public Salidas buscarsalida(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarsalida(int id) {
        this.repo.deleteById(id);
    }
}
