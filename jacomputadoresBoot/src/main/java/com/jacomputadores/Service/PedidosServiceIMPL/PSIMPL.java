package com.jacomputadores.Service.PedidosServiceIMPL;

import com.jacomputadores.Entity.Pedidos;
import com.jacomputadores.Repository.PedidosRepository;
import com.jacomputadores.Service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements PedidosService {

    @Autowired
    private PedidosRepository repo;

    @Override
    public List<Pedidos> ConsultarPedido(){
        return (List<Pedidos>) this.repo.findAll();

    }
    @Override
    public Pedidos CrearPedido(Pedidos pedidos){
        pedidos.setId(pedidos.getId());
        return this.repo.save(pedidos);

    }

    @Override
    public Pedidos ModificarPedido(Pedidos pedidos){
        return this.repo.save(pedidos);


    }
    @Override
    public Pedidos BuscarPedido(int id){
        return this.repo.findById(id).get();
    }
    @Override
    public void EliminarPedido(int id){
        this.repo.deleteById(id);
    }
}
