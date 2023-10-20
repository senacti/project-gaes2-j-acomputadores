package com.jacomputadores.Entity;


import jakarta.persistence.*;

@Entity
@Table(name ="calificaciones" )

public class Calificaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;



    @Column(name = "nombre_proveedor")
    private String nombre_proveedor;
    @Column(name = "comentarios")
    private String comentarios;
    @Column(name = "estrellas_C")
    private int estrellas_C;
    @Column(name = "proveedor_id_proveedor ")
    private int proveedor_id_proveedor ;







}
