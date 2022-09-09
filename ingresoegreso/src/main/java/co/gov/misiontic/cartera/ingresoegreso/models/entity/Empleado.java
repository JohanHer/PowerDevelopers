package co.gov.misiontic.cartera.ingresoegreso.models.entity;

import lombok.Data;

@Data
public class Empleado {

    private long idEmpleado;
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String password;
    private String empresa;
    private Rol rol;
    private boolean estado;

}
