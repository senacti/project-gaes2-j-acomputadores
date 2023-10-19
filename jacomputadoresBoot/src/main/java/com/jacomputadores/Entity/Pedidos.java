package com.jacomputadores.Entity;

import jakarta.persistence.*;

@Table (name = "pedidos")
@Entity
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fecha_pedido")
    private int fecha_pedido;

    @Column(name = "cantidad")
    private float cantidad;

    @Column(name = "cliente_id_cliente ")
    private int idcliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(int fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    @Column(name = "productos_id_producto ")
    private int idproducto;
}
