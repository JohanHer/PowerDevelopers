package co.gov.misiontic.cartera.ingresoegreso.entities;

import lombok.Data;

@Data
public class Empresa {
    private long idEmpresa;
    private String nombre;
    private String direccion;
    private String telefono;
    private String NIT;
}
