package com.tienda.tiendaaccesorios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.tiendaaccesorios.model.Producto;

// Interfaz que permite realizar operaciones CRUD en la base de datos
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}