package com.jacomputadores.Service.FichatecnicaServiceIMPL;

import com.jacomputadores.Entity.FichaTecnica;
import com.jacomputadores.Repository.FichatecnicaRepository;
import com.jacomputadores.Service.FichatecnicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FtSIMPL implements FichatecnicaService {

    @Autowired
    private FichatecnicaRepository repo;

    @Override
    public List<FichaTecnica> ConsultarFichatecnica() {
        return (List<FichaTecnica>) this.repo.findAll();
    }

    @Override
    public FichaTecnica CrearFichatecnica(FichaTecnica fichaTecnica) {
        fichaTecnica.setId(fichaTecnica.getId());
        return this.repo.save(fichaTecnica);
    }

    @Override
    public FichaTecnica ModificarFichatecnica(FichaTecnica fichaTecnica) {
        return this.repo.save(fichaTecnica);
    }

    @Override
    public FichaTecnica BuscarFichatecnica(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarFichatecnica(int id) {
        this.repo.deleteById(id);

    }
}
