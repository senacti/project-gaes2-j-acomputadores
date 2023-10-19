package com.jacomputadores.Entity;

import jakarta.persistence.*;


@Table( name = "TipoServicio")
@Entity
public class TipoServicio {
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

    public int getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(int tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    @Column(name = "tipo_servicio")
    private int tiposervicio;




}
