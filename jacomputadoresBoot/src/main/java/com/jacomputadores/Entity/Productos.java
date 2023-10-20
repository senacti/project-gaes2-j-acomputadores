package com.jacomputadores.Entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Table(name = "productos")

public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "nombre_producto")
    private String nombre_producto;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "marca_producto")
    private String marca_producto;
    @Column(name = "precio_U")
    private int precio_U;
    @Column(name = "imagenes")
    private String imagenes;
    @Column(name = "categorias_id_categoria ")
    private int categorias_id_categoria ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca_producto() {
        return marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }

    public int getPrecio_U() {
        return precio_U;
    }

    public void setPrecio_U(int precio_U) {
        this.precio_U = precio_U;
    }

    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }

    public int getCategorias_id_categoria() {
        return categorias_id_categoria;
    }

    public void setCategorias_id_categoria(int categorias_id_categoria) {
        this.categorias_id_categoria = categorias_id_categoria;
    }

    public int getMarcas_id_marca() {
        return marcas_id_marca;
    }

    public void setMarcas_id_marca(int marcas_id_marca) {
        this.marcas_id_marca = marcas_id_marca;
    }

    @Column(name = "marcas_id_marca ")
    private int marcas_id_marca ;


}
