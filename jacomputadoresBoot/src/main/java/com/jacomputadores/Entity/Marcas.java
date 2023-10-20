package com.jacomputadores.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "marcas")
public class Marcas {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;



    @Column(name = "nombre")
    private String nombre;


    }

