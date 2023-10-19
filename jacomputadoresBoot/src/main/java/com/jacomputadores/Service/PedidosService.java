package com.jacomputadores.Service;

import com.jacomputadores.Entity.Pedidos;

import java.util.List;

public interface PedidosService {

    public List<Pedidos> ConsultarPedido();

    public  Pedidos CrearPedido(Pedidos pedidos);

    public Pedidos ModificarPedido(Pedidos pedidos);

    public Pedidos BuscarPedido(int id);

    public void EliminarPedido(int id);
}
