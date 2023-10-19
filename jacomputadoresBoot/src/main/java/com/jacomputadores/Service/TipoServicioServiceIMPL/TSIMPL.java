package com.jacomputadores.Service.TipoServicioServiceIMPL;

import com.jacomputadores.Entity.TipoServicio;
import com.jacomputadores.Repository.TipoServicioRepository;
import com.jacomputadores.Service.TiposervicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TSIMPL implements TiposervicioService {
    @Autowired
    private TipoServicioRepository repo;

    @Override
    public List<TipoServicio> ConsultarTipoServicio(){ return (List<TipoServicio>) this.repo.findAll();}

    @Override
    public TipoServicio CrearTipoServicio(TipoServicio tipoServicio) {
        tipoServicio.setId(tipoServicio.getId());
        return this.repo.save(tipoServicio);
    }

    @Override
    public TipoServicio ModificarTipoServicio(TipoServicio tipoServicio){return this.repo.save(tipoServicio);}{
}

    @Override
    public  TipoServicio BuscarTipoServicio(int id){return this.repo.findById(id).get();}

    @Override
    public void EliminarTipoServicio(int id){
        this.repo.deleteById(id);
    }

}

