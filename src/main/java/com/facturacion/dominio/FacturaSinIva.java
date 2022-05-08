package com.facturacion.dominio;

import java.time.LocalDate;

public class FacturaSinIva extends Factura {
    public FacturaSinIva (long valor, String cliente, LocalDate fechaVenvimiento){
        super(valor,cliente,fechaVenvimiento);
    }

    @Override
    public long calculartotal() {
        return this.getValor();
    }
}
