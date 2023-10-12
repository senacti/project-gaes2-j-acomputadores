package com.jacomputadores.Service.GarantiaServiceIMPL;

import com.jacomputadores.Entity.Garantia;
import com.jacomputadores.Repository.GarantiaRepository;
import com.jacomputadores.Service.GarantiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GSIMPL implements GarantiaService {

    @Autowired
    private GarantiaRepository repo;

    @Override
    public List<Garantia> ConsultarGarantia() {
        return (List<Garantia>) this.repo.findAll();
    }

    @Override
    public Garantia CrearGarantia(Garantia garantia) {
        garantia.setId(garantia.getId());
        return this.repo.save(garantia);
    }

    @Override
    public Garantia ModificarGarantia(Garantia garantia) {
        return this.repo.save(garantia);
    }

    @Override
    public Garantia BuscarGarantia(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarGarantia(int id) {
        this.repo.deleteById(id);
    }
}
