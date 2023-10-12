package com.jacomputadores.Service.TipogarantiaServiceIMPL;

import com.jacomputadores.Entity.TipoGarantia;
import com.jacomputadores.Repository.TipogarantiaRepository;
import com.jacomputadores.Service.TipogaarantiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TgSIMPL implements TipogaarantiaService {
    @Autowired
    private TipogarantiaRepository repo;


    @Override
    public List<TipoGarantia> ConsultarTipoGarantia() {
        return (List<TipoGarantia>) this.repo.findAll();
    }

    @Override
    public TipoGarantia CrearTipoGarantia(TipoGarantia tipoGarantia) {
        tipoGarantia.setId(tipoGarantia.getId());
        return this.repo.save(tipoGarantia);
    }

    @Override
    public TipoGarantia ModificarTipoGarantia(TipoGarantia tipoGarantia) {
        return this.repo.save(tipoGarantia);
    }

    @Override
    public TipoGarantia BuscarTipoGarantia(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarTipoGarantia(int id) {
        this.repo.deleteById(id);

    }
}
