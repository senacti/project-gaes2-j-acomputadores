package com.jacomputadores.Service;

import com.jacomputadores.Entity.DireccionProvedor;


import java.util.List;

public interface DireccionPorvedorService {


    List<DireccionProvedor> Consultardirecionprovedor();

    DireccionProvedor Creardirecionprovedor(DireccionProvedor DireccionProvedor);

    DireccionProvedor Modificardirecionprovedor(DireccionProvedor DireccionProvedor);

    DireccionProvedor Buscardirecionprovedor(int id);

}






