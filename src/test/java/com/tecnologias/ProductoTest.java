package com.tecnologias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class ProductoTest {
    @Test
    public void testCreacionProductoValido() {
        Producto producto = new Producto("PROD-001", "Laptop", 15000.0, 10);
        
        assertEquals("PROD-001", producto.getCodigo());
        assertEquals("Laptop", producto.getNombre());
        assertEquals(15000.0, producto.getPrecio());
        assertEquals(10, producto.getExistencia());
    }

    @Test
    public void testRechazoPrecioNegativo() {
        try {
            Producto producto = new Producto("PROD-002", "Mouse", -100.0, 5);
            fail("Debio lanzar una excepcion por precio negativo");
        } catch (IllegalArgumentException e) {
            assertEquals("El precio no puede ser negativo", e.getMessage());
        }
    }

    @Test
    public void testRechazoExistenciaNegativa() {
        try {
            Producto producto = new Producto("PROD-003", "Teclado", 500.0, -2);
            fail("Debio lanzar una excepcion por existencia negativa");
        } catch (IllegalArgumentException e) {
            assertEquals("La existencia no puede ser negativa", e.getMessage());
        }
    }

    @Test
    public void testRechazoCodigoVacio() {
        try {
            Producto producto = new Producto("", "Monitor", 3000.0, 1);
            fail("Debio lanzar una excepcion por codigo vacio");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}
