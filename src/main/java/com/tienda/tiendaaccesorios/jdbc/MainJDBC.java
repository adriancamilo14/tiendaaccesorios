package com.tienda.tiendaaccesorios.jdbc;

import com.tienda.tiendaaccesorios.dao.ProductoDAO;

public class MainJDBC {

    public static void main(String[] args) {

        ProductoDAO productoDAO = new ProductoDAO();

        productoDAO.insertarProducto(
                "Audifonos",
                35000,
                15,
                "Audifonos Bluetooth",
                10
        );

    }
}