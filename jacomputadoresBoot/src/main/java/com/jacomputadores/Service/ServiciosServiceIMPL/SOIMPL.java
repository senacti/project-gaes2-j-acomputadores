package com.jacomputadores.Service.ServiciosServiceIMPL;



import com.jacomputadores.Entity.Servicios;
import com.jacomputadores.Repository.ServiciosRepository;
import com.jacomputadores.Service.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SOIMPL implements ServiciosService {

    @Autowired
    private ServiciosRepository repo;
    @Override
    public List<Servicios> ConsultarServicio() {
        return (List<Servicios>) this.repo.findAll();
    }

    @Override
    public Servicios CrearServicio(Servicios servicios) {
        servicios.setId(servicios.getId());
        return this.repo.save(servicios);
    }

    @Override
    public Servicios ModificarServicio(Servicios servicios) {
        return this.repo.save(servicios);
    }

    @Override
    public Servicios BuscarServicio(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarServicio(int id) {
        this.repo.deleteById(id);

    }
}




