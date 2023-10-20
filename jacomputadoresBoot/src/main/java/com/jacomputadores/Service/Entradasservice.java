package com.jacomputadores.Service;

import com.jacomputadores.Entity.Entradas;

import java.util.List;

public interface Entradasservice {


    public List<Entradas> consultarentradas();

    public Entradas crearentradas (Entradas Entradas);

    public Entradas modificarentradas (Entradas Entradas);

    Entradas Crearentradas(Entradas Entradas);

    Entradas Modificarentradas(Entradas Entradas);

    public Entradas buscarentradas (int id);
    public  void eliminarentradas(int id);

}
