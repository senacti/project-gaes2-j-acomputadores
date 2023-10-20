package com.jacomputadores.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import static jakarta.persistence.GenerationType.*;

@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "productos_id_producto")
    private int productos_id_producto;
    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "entradas_id_entrada")
    private int entradas_id_entrada;

    public static void setid(int id) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductos_id_producto() {
        return productos_id_producto;
    }

    public void setProductos_id_producto(int productos_id_producto) {
        this.productos_id_producto = productos_id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEntradas_id_entrada() {
        return entradas_id_entrada;
    }

    public void setEntradas_id_entrada(int entradas_id_entrada) {
        this.entradas_id_entrada = entradas_id_entrada;
    }
}
