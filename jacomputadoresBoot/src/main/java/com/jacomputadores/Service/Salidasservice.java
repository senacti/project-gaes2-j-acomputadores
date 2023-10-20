package com.jacomputadores.Service;

import com.jacomputadores.Entity.Salidas;

import java.util.List;

public interface Salidasservice {
    public  List<Salidas> consultarsalida();

    public Salidas crearsalidad (Salidas salidas);

    public Salidas modificarsalida (Salidas salidas);
    public Salidas buscarsalida ( int id);
     public  void eliminarsalida(int id);


}
