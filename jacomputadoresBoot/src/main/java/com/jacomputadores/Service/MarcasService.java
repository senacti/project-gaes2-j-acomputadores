package com.jacomputadores.Service;

import com.jacomputadores.Entity.Marcas;

import java.util.List;

public interface MarcasService {




    List<Marcas> consultarmarca();

    Marcas crearmarca(Marcas Marcas);

    Marcas modificarmarca(Marcas Marcas);

    Marcas buscarmarca(int id);

    void eliminarmarca(int id);
}
