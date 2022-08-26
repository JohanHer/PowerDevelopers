package co.gov.misiontic.cartera.ingresoegreso.models.entity;

import lombok.Data;

@Data
public class MovimientoDinero {

    private long idMovimiento;
    private String monto;
    private String concepto;
    private String usuario;
}
