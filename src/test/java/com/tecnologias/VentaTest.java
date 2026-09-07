package com.tecnologias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VentaTest {
    @Test
    public void testVentaTotal() {
        Producto p = new Producto("P1", "Laptop", 1000.0, 10);
        Venta v = new Venta();
        v.agregarPartida(new DetalleVenta(p, 2));
        // Esperamos 2088.0 debido al descuento del 10% y el impuesto del 16%
        assertEquals(2088.0, v.calcularTotal(), 0.01);
    }

    @Test
    public void testFallaCantidad() {
        Producto p = new Producto("P2", "Mouse", 100.0, 10);
        assertThrows(IllegalArgumentException.class, () -> new DetalleVenta(p, 0));
    }
}