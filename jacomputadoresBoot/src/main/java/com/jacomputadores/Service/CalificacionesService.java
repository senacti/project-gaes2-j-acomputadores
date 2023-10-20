package com.jacomputadores.Service;

import com.jacomputadores.Entity.Calificaciones;

import java.util.List;

public interface CalificacionesService

{



    public List<Calificaciones> consultarcalificaciones();

    public Calificaciones crearcalificaiones(Calificaciones calificaciones);


    public Calificaciones modificarcalifiaciones(Calificaciones calificaciones);

    public  Calificaciones buscarcalificaciones(int id);


    public  void  eliminarcalificaciones (int id);



}




