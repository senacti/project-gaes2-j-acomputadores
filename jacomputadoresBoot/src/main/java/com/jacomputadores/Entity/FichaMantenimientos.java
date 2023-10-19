package com.jacomputadores.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "fichamantenimientos")

public class FichaMantenimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "descripcion_fallas")
    private String descripcion;

    @Column(name = "total_pagar")
    private int total;

    @Column(name = "fecha_salida")
    private Date salida;

    @Column(name = "administrador_id_administrador ")
    private int idadministrador;

    @Column(name = "mantenimientos_id_mantenimiento ")
    private int idmantenimiento;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public int getIdadministrador() {
        return idadministrador;
    }

    public void setIdadministrador(int idadministrador) {
        this.idadministrador = idadministrador;
    }

    public int getIdmantenimiento() {
        return idmantenimiento;
    }

    public void setIdmantenimiento(int idmantenimiento) {
        this.idmantenimiento = idmantenimiento;
    }
}
