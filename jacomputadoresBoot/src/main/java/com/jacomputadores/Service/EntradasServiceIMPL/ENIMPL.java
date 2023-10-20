package com.jacomputadores.Service.EntradasServiceIMPL;

import com.jacomputadores.Entity.Entradas;

import com.jacomputadores.Repository.Entradasrepository;

import com.jacomputadores.Service.Entradasservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class ENIMPL implements Entradasservice {


    @Autowired
    private Entradasrepository repo;


    @Override

    public List<Entradas> consultarentradas(){

        return (List<Entradas>) this.repo.findAll();
    }

    @Override
    public Entradas crearentradas(Entradas Entradas) {
        return null;
    }

    @Override
    public Entradas modificarentradas(Entradas Entradas) {
        return null;
    }


    @Override
    public Entradas Crearentradas(Entradas Entradas) {
        Entradas.setId(Entradas.getId());
        return this.repo.save(Entradas);
    }

    @Override
    public Entradas Modificarentradas(Entradas Entradas) {
        return this.repo.save(Entradas);
    }

    @Override
    public Entradas buscarentradas(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarentradas(int id) {
        this.repo.deleteById(id);

    }
}
