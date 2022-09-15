package co.gov.misiontic.cartera.ingresoegreso.entities;

import lombok.Data;
import javax.persistence.*;

@Data
//@Entity
public class MovimientoDinero {

    private long idMovimiento;
    private String monto;
    private String concepto;
    private String usuario;
}
