package com.tecnologias;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private List<DetalleVenta> partidas = new ArrayList<>();

    public void agregarPartida(DetalleVenta detalle) {
        if (detalle == null) throw new IllegalArgumentException("Detalle nulo");
        partidas.add(detalle);
    }

    public double calcularTotal() {
        // Resolución del conflicto: Se aplica descuento (rama-3) y luego impuesto (rama-2)
        double subtotal = partidas.stream().mapToDouble(DetalleVenta::calcularSubtotal).sum();
        return subtotal * 0.90 * 1.16;
    }

}