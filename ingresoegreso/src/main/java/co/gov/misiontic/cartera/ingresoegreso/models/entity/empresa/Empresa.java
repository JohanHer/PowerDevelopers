package co.gov.misiontic.cartera.ingresoegreso.models.entity.empresa;

import lombok.Data;

//import javax.persistence.Entity;

//@Entity
@Data
public class Empresa {
    private String nombre;
    private String direccion;
    private String telefoto;
    private String NIT;
}
