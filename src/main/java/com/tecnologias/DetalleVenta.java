package com.tecnologias;

public class DetalleVenta {
    private Producto producto;
    private int cantidad;

    public DetalleVenta(Producto producto, int cantidad) {
        if (producto == null) throw new IllegalArgumentException("Producto nulo");
        if (cantidad <= 0) throw new IllegalArgumentException("Cantidad invalida");
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }
}