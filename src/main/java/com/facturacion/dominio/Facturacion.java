package com.facturacion.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Facturacion {
    private String cliente;
    private long valor;
    private List<Factura> facturas;

    public Facturacion() {
        facturas = new ArrayList<>();
    }


    public void GenerarFactura(String cliente, int valor, LocalDate fecha) {
        Factura factura;

        if (fecha.isBefore(LocalDate.now())) {
            factura = new FacturaVencida(valor, cliente, fecha);
        } else {
            if (valor >= 100000 && (cliente.toLowerCase().startsWith("a")||
                    cliente.toLowerCase().startsWith("e")||
                    cliente.toLowerCase().startsWith("i")||
                    cliente.toLowerCase().startsWith("o")||
                    cliente.toLowerCase().startsWith("u"))) {
                factura = new FacturaConDescuento(valor, cliente, fecha);
            }
            else if (valor>=100000){
                factura = new FacturaConIva(valor, cliente, fecha);

            }
            else {
                factura = new FacturaSinIva(valor, cliente, fecha);
            }
        }

        facturas.add(factura);
    }

    public long TotalFacturacion() {

        return facturas.stream().mapToLong(fac -> fac.calculartotal()).sum();
    }

    public Factura facturaMasCara() {

        return this.facturas.stream().max(Comparator.comparing(Factura::calculartotal)).get();
    }

    public LocalDate vencimiento = LocalDate.of(2022, 5, 5);

    public List<FacturaSinIva> FacturasSinIva() {
        return this.facturas.stream()
                .filter(fac -> fac instanceof FacturaSinIva)
                .map(fac -> (FacturaSinIva) fac)
                .collect(Collectors.toList());

    }

    public List<FacturaConIva> FacturasConIva() {
        return this.facturas.stream()
                .filter(fac -> fac instanceof FacturaConIva)
                .map(fac -> (FacturaConIva) fac)
                .collect(Collectors.toList());

    }

    public List<FacturaVencida> FacturasVencidas() {
        return this.facturas.stream()
                .filter(fac -> fac instanceof FacturaVencida)
                .map(fac -> (FacturaVencida) fac)
                .collect(Collectors.toList());
    }
    public List<FacturaConIva> FacturasConDescuento() {
        return this.facturas.stream()
                .filter(fac -> fac instanceof FacturaConDescuento)
                .map(fac -> (FacturaConIva) fac)
                .collect(Collectors.toList());
    }
}