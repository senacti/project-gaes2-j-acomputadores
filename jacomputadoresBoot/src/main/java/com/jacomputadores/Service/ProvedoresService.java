package com.jacomputadores.Service;

import com.jacomputadores.Entity.Provedores;

import java.util.List;

public interface ProvedoresService {






    public List<Provedores> consultarprovedores();

    public Provedores crearprovedores(Provedores provedores);
    public Provedores modificarprovedores(Provedores provedores);
;

    Provedores buscarprovedores(int id);

    void elminarprovedores(int id);
}
