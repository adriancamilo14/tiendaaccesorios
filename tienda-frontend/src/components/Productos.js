import React, { useState } from "react";

// Componente que gestiona los productos
function Productos() {

    // Lista de productos
    const [productos, setProductos] = useState([]);

    // Estados del formulario
    const [nombre, setNombre] = useState("");
    const [precio, setPrecio] = useState("");
    const [stock, setStock] = useState("");
    const [descripcion, setDescripcion] = useState("");
    const [cantidad, setCantidad] = useState("");

    // Función para agregar producto
    const agregarProducto = () => {

        const nuevoProducto = {
            nombre,
            precio,
            stock,
            descripcion,
            cantidad
        };

        setProductos([...productos, nuevoProducto]);

        // limpiar formulario
        setNombre("");
        setPrecio("");
        setStock("");
        setDescripcion("");
        setCantidad("");
    };

    return (
        <div>

            <h2>Gestión de Productos</h2>

            <input
                placeholder="Nombre"
                value={nombre}
                onChange={(e) => setNombre(e.target.value)}
            />

            <input
                placeholder="Precio"
                value={precio}
                onChange={(e) => setPrecio(e.target.value)}
            />

            <input
                placeholder="Stock"
                value={stock}
                onChange={(e) => setStock(e.target.value)}
            />

            <input
                placeholder="Descripción"
                value={descripcion}
                onChange={(e) => setDescripcion(e.target.value)}
            />

            <input
                placeholder="Cantidad"
                value={cantidad}
                onChange={(e) => setCantidad(e.target.value)}
            />

            <button onClick={agregarProducto}>
                Agregar Producto
            </button>

            <h3>Lista de productos</h3>

            <ul>
                {productos.map((producto, index) => (
                    <li key={index}>
                        {producto.nombre} - ${producto.precio} - Stock: {producto.stock} - {producto.descripcion} - Cantidad: {producto.cantidad}
                    </li>
                ))}
            </ul>

        </div>
    );
}

export default Productos;