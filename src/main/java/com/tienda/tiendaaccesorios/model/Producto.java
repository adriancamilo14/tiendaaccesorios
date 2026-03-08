package com.tienda.tiendaaccesorios.model;

import jakarta.persistence.*;

// Esta clase representa la entidad Producto en la base de datos
@Entity
@Table(name = "productos")
public class Producto {

    // Identificador único del producto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre del producto
    private String nombre;

    // Precio del producto
    private double precio;

    // Cantidad disponible en inventario
    private int cantidad;

    // Constructor vacío requerido por JPA
    public Producto() {}

    // Métodos getter y setter para acceder a los atributos

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}