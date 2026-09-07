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
        return partidas.stream().mapToDouble(DetalleVenta::calcularSubtotal).sum();
    }
}