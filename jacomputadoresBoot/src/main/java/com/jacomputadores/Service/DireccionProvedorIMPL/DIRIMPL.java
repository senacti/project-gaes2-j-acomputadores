package com.jacomputadores.Service.DireccionProvedorIMPL;


import com.jacomputadores.Entity.DireccionProvedor;
import com.jacomputadores.Repository.DireccionprovedorRepository;
import com.jacomputadores.Service.DireccionPorvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DIRIMPL  implements DireccionPorvedorService {

@Autowired
    private DireccionprovedorRepository repo;


    @Override
    public List<DireccionProvedor> Consultardirecionprovedor() {
        return null;
    }

    @Override
    public DireccionProvedor Creardirecionprovedor(DireccionProvedor DireccionProvedor) {
        return null;
    }

    @Override
    public DireccionProvedor Modificardirecionprovedor(DireccionProvedor DireccionProvedor) {
        return null;
    }

    @Override
    public DireccionProvedor Buscardirecionprovedor(int id) {
        return null;
    }

    @Override
    public void Eliminardirecionprovedor(int id) {

    }

    @Override
    public List<DireccionProvedor> ConsultarFichatecnica() {
        return (List<DireccionProvedor>) this.repo.findAll();
    }

    @Override
    public DireccionProvedor CrearFichatecnica(DireccionProvedor DireccionProvedor) {
        DireccionProvedor.setId(DireccionProvedor.getId());
        return this.repo.save(DireccionProvedor);
    }

    @Override
    public DireccionProvedor ModificarFichatecnica(DireccionProvedor DireccionProvedor) {
        return this.repo.save(DireccionProvedor);
    }

    @Override
    public DireccionProvedor BuscarFichatecnica(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarFichatecnica(int id) {
        this.repo.deleteById(id);

    }
}





