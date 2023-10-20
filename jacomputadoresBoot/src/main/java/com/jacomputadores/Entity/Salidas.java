package com.jacomputadores.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Salidas {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int  id;

    @Column(name = "productos_id_producto")
    private  int productos_id_producto;

    @Column(name="fecha_salida")
    private Date fecha_salida;

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

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }



}

