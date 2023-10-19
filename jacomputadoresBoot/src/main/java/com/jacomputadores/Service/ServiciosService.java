package com.jacomputadores.Service;


import com.jacomputadores.Entity.Servicios;

import java.util.List;

public interface ServiciosService {

    public List<Servicios> ConsultarServicio();

    public  Servicios CrearServicio(Servicios servicios);

    public Servicios ModificarServicio(Servicios servicios);

    public Servicios BuscarServicio(int id);

    public void EliminarServicio(int id);






}
