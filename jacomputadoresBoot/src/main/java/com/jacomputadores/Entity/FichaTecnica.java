package com.jacomputadores.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "fichatecnicas")

public class FichaTecnica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_empresa")
    private String nombre;
    @Column(name = "nombre_producto")
    private String producto;
    @Column(name = "cliente")
    private String cliente;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "imagenes")
    private String imagenes;
    @Column(name = "fecha_realizacion")
    private Date fecha;
    @Column(name = "garantias_id_garantia")
    private int garantia;

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

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
