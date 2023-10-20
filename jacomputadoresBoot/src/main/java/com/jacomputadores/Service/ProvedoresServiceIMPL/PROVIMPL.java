package com.jacomputadores.Service.ProvedoresServiceIMPL;

import com.jacomputadores.Entity.Provedores;
import com.jacomputadores.Repository.Provedoresrepository;
import com.jacomputadores.Service.ProvedoresService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PROVIMPL  implements ProvedoresService {
    
    
    private final Provedoresrepository repo;

    public PROVIMPL(Provedoresrepository repo) {
        this.repo = repo;
    }


    @Override
    public List<Provedores> consultarprovedores() {
        
        return (List<Provedores>) this.repo.findAll();
    }

    @Override
    public Provedores crearprovedores(Provedores Provedores) {
        Provedores.setId(Provedores.getId());
        return this.repo.save(Provedores);
    }

    @Override
    public Provedores modificarprovedores(Provedores Provedores) {
        return this.repo.save(Provedores);
    }

    @Override
    public Provedores buscarprovedores(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void elminarprovedores(int id) {
        this.repo.deleteById(id);

    }
}
    
    
    
    
    
    
