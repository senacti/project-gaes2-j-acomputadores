package com.jacomputadores.Service.MarcasServiceIMPL;


import com.jacomputadores.Entity.Marcas;
import com.jacomputadores.Repository.Marcasrepository;
import com.jacomputadores.Service.MarcasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MAIMPL implements MarcasService {

    @Autowired
    private Marcasrepository repo;


    @Override
    public List<Marcas> consultarmarca() {
        return (List<Marcas>) this.repo.findAll();
    }

    @Override
    public Marcas crearmarca(Marcas Marcas) {
        Marcas.setId(Marcas.getId());
        return this.repo.save(Marcas);
    }

    @Override
    public Marcas modificarmarca(Marcas Marcas) {
        return this.repo.save(Marcas);
    }

    @Override
    public Marcas buscarmarca(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarmarca(int id) {
        this.repo.deleteById(id);
    }
}








