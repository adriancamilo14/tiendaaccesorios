package com.tienda.tiendaaccesorios.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/tienda_accesorios";
    private static final String USER = "root";
    private static final String PASSWORD = "261402Alice+";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos");

        } catch (Exception e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }

        return conexion;
    }
}