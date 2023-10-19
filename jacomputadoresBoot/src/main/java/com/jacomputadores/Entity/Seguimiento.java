package com.jacomputadores.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "seguimientos")

public class Seguimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name="id_pedido")
    private int idpedido;

    @Column(name="id_cliente")
    private int idcliente;

    @Column(name="id_tecnico")
    private int idtecnico;

    @Column(name="estadoseguimiento_id_estadoseguimiento")
    private int estadoseguimiento;


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

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdtecnico() {
        return idtecnico;
    }

    public void setIdtecnico(int idtecnico) {
        this.idtecnico = idtecnico;
    }

    public int getEstadoseguimiento() {
        return estadoseguimiento;
    }

    public void setEstadoseguimiento(int estadoseguimiento) {
        this.estadoseguimiento = estadoseguimiento;
    }
}
