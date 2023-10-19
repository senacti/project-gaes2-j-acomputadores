package com.jacomputadores.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "estadoseguimientos")

public class EstadoSegumiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fecha_ingreso")
    private Date ingreso;

    @Column(name = "fecha_salida")
    private Date Salida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getSalida() {
        return Salida;
    }

    public void setSalida(Date salida) {
        Salida = salida;
    }
}
