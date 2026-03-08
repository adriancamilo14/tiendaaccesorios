package com.tienda.tiendaaccesorios.controller;

import com.tienda.tiendaaccesorios.model.Producto;
import com.tienda.tiendaaccesorios.repository.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controlador REST que maneja las peticiones relacionadas con productos
@RestController
@RequestMapping("/productos")

public class ProductoController {

    // Inyección del repositorio para acceder a la base de datos
    private final ProductoRepository productoRepository;

    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Metodo para obtener todos los productos registrados
    @GetMapping
    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    // Metodo para guardar un nuevo producto
    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }
}