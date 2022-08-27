package co.gov.misiontic.cartera.ingresoegreso.models.entity;

import lombok.Data;

@Data
public class Empleado {

    private long idEmpleado;
    private String Nombre;
    private String Correo;
    private String Password;
    private String Empresa;
    private String Rol;

}
