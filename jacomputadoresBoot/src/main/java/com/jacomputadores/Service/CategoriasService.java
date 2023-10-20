package com.jacomputadores.Service;


import com.jacomputadores.Entity.Categorias;

import java.util.List;

public interface CategoriasService {


    public List<Categorias> consultarcategoria();

    public  Categorias crearcategoria(Categorias Categorias);
    public Categorias modificarcategoria(Categorias Categorias);
    public Categorias buscarcategoria(int id);
    public void eliminarcategoria(int id);
}
