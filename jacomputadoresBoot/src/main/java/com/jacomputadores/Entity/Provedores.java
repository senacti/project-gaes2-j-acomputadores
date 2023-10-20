package com.jacomputadores.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "provedores")
public class Provedores {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;



    @Column(name = "nombre_proveedor")
    private String nombre_proveedor;
    @Column(name = "correo_electronico")
    private String correo_electronico;

    @Column(name = "celular")
    private int celular;

    @Column(name = "direccionproveedor_id_direccionP ")
    private int direccionproveedor_id_direccionP ;



}
