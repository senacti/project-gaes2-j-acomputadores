package com.jacomputadores.Service.CategoriasServiceIMPL;

import com.jacomputadores.Entity.Categorias;
import com.jacomputadores.Repository.Categoriasrepository;
import com.jacomputadores.Service.CategoriasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PROIMPL   implements CategoriasService {

    @Autowired
    private Categoriasrepository repo;








    @Override
    public List<Categorias> consultarcategoria() {
        return null;
    }

    @Override
    public Categorias crearcategoria(Categorias Categorias) {
        return null;
    }

    @Override
    public Categorias modificarcategoria(Categorias Categorias) {
        return null;
    }

    @Override
    public Categorias buscarcategoria(int id) {
        return null;
    }

    @Override
    public void eliminarcategoria(int id) {

    }
}




