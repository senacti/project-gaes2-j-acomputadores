package com.jacomputadores.Service.VentasServiceIMPL;

import com.jacomputadores.Entity.Ventas;
import com.jacomputadores.Repository.VentasRepository;
import com.jacomputadores.Service.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VSIMPL implements VentasService {

    @Autowired
    private VentasRepository repo;
    @Override
    public List<Ventas> ConsultarVenta() {
        return (List<Ventas>) this.repo.findAll();
    }

    @Override
    public Ventas CrearVenta(Ventas ventas) {
        ventas.setId(ventas.getId());
        return this.repo.save(ventas);
    }

    @Override
    public Ventas ModificarVenta(Ventas ventas) {
        return this.repo.save(ventas);
    }

    @Override
    public Ventas BuscarVenta(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarVenta(int id) {
        this.repo.deleteById(id);

    }
}
