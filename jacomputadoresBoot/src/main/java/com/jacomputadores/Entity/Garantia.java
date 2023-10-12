package com.jacomputadores.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "garantias")
public class Garantia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_producto")
    private String nombre;
    @Column(name = "descripcion")
    private String descricion;
    @Column(name = "tiempo_establecido")
    private String tiempoestablecido;

    @Column(name = "tecnicos_id_tecnico")
    private int tecnicoId;

    @Column(name = "tipogarantias_id_tipogarantia")
    private int tipogarantia;

    @Column(name = "estadogarantias_id_estadogarantia")
    private int estadogarantia;

    public int getTecnicoId() {
        return tecnicoId;
    }

    public void setTecnicoId(int tecnicoId) {
        this.tecnicoId = tecnicoId;
    }

    public int getTipogarantia() {
        return tipogarantia;
    }

    public void setTipogarantia(int tipogarantia) {
        this.tipogarantia = tipogarantia;
    }

    public int getEstadogarantia() {
        return estadogarantia;
    }

    public void setEstadogarantia(int estadogarantia) {
        this.estadogarantia = estadogarantia;
    }

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

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public String getTiempoestablecido() {
        return tiempoestablecido;
    }

    public void setTiempoestablecido(String tiempoestablecido) {
        this.tiempoestablecido = tiempoestablecido;
    }
}
