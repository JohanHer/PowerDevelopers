package co.gov.misiontic.cartera.ingresoegreso.models.entity;

import lombok.Data;

@Data
public class Empresa {
    private long idEmpresa;
    private String nombre;
    private String direccion;
    private String telefoto;
    private String NIT;
}
