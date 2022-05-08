package com.facturacion.app;

import com.facturacion.dominio.Factura;
import com.facturacion.dominio.Facturacion;

import java.time.LocalDate;
import java.util.Optional;

public class factuAPP {
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();
        facturacion.GenerarFactura("Alejandro", 99900, LocalDate.of(2022, 6, 30));
        facturacion.GenerarFactura("Diana", 12000, LocalDate.of(2022, 4, 30));
        facturacion.GenerarFactura("Jorge", 100000, LocalDate.of(2022, 1, 1));

        facturacion.FacturasVencidas().forEach(fsi -> System.out.println(fsi.calculartotal()));

    }
}
