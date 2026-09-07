package com.tecnologias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VentaTest {
    @Test
    public void testVentaTotal() {
        Producto p = new Producto("P1", "Laptop", 1000.0, 10);
        Venta v = new Venta();
        v.agregarPartida(new DetalleVenta(p, 2));
        assertEquals(2000.0, v.calcularTotal());
    }

    @Test
    public void testFallaCantidad() {
        Producto p = new Producto("P2", "Mouse", 100.0, 10);
        assertThrows(IllegalArgumentException.class, () -> new DetalleVenta(p, 0));
    }
}