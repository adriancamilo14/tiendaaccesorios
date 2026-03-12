package com.tienda.tiendaaccesorios.controller;

import com.tienda.tiendaaccesorios.model.Producto;
import com.tienda.tiendaaccesorios.repository.ProductoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin
public class ProductoController {

    private final ProductoRepository productoRepository;

    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // LISTAR PRODUCTOS
    @GetMapping
    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    // GUARDAR PRODUCTO
    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {

        // el stock se calcula automáticamente
        producto.setStock(producto.getCantidad());

        return productoRepository.save(producto);
    }

    // ACTUALIZAR PRODUCTO
    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {

        Producto p = productoRepository.findById(id).orElse(null);

        if (p != null) {

            p.setNombre(producto.getNombre());
            p.setDescripcion(producto.getDescripcion());
            p.setPrecio(producto.getPrecio());
            p.setCantidad(producto.getCantidad());
            p.setStock(producto.getCantidad());

            return productoRepository.save(p);
        }

        return null;
    }

    // ELIMINAR PRODUCTO
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoRepository.deleteById(id);
    }

}