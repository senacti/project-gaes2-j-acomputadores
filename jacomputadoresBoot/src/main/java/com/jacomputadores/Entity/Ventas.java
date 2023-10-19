package com.jacomputadores.Entity;

import jakarta.persistence.*;

@Table( name = "ventas")
@Entity
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name ="N_factura")
    private int Nfactura;

    @Column(name="descripcion")
    private int descripcion;

    @Column(name ="cantidad")
    private float cantidad;

    @Column(name="descuento")
    private float descuento;

    @Column(name="iva")
    private float iva;

    @Column(name ="total")
    private float total;

   @Column(name = "pedidos_id_pedido ")
    private int idpedido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNfactura() {
        return Nfactura;
    }

    public void setNfactura(int nfactura) {
        Nfactura = nfactura;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }
}
