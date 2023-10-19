package com.jacomputadores.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Servicios")
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public int getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(int tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    @Column(name = "nombre_servicio ")
    private String nombre;

    @Column(name = "ventas_id_venta ")
    private int venta;

    @Column(name = "tiposervicio_id_tiposervicio ")
    private int tiposervicio;

}
