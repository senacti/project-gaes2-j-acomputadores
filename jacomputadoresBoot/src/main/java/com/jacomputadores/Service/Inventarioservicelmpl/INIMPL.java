package com.jacomputadores.Service.Inventarioservicelmpl;

import com.jacomputadores.Entity.Inventario;
import com.jacomputadores.Repository.Inventariorepository;
import com.jacomputadores.Service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class INIMPL implements InventarioService {

    @Autowired
private Inventariorepository repo;


    @Override
    public List<Inventario> consultarinventario() {
        return (List<Inventario>) this.repo.findAll();
    }

    @Override
    public Inventario Crearinvetario(Inventario inventario) {
        Inventario.setid(inventario.getId());
        return this.repo.save(inventario);
    }

    @Override
    public Inventario Modificarinventario(Inventario inventario) {
        return this.repo.save(inventario);
    }

    @Override
    public Inventario buscarinventario(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarinventario(int id) {
        this.repo.deleteById(id);

    }
}
