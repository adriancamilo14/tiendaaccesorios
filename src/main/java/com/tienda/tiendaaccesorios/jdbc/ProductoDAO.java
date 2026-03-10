package com.tienda.tiendaaccesorios.dao;

import com.tienda.tiendaaccesorios.conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductoDAO {
    public void insertarProducto(String nombre, double precio, int stock, String descripcion, int cantidad) {

        String sql = "INSERT INTO productos(nombre,precio,stock,descripcion,cantidad) VALUES(?,?,?,?,?)";

        try {

            Connection conexion = ConexionBD.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            ps.setInt(3, stock);
            ps.setString(4, descripcion);
            ps.setInt(5, cantidad);

            ps.executeUpdate();

            System.out.println("Producto insertado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}