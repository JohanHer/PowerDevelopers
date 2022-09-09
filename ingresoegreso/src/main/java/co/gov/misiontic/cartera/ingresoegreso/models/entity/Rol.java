package co.gov.misiontic.cartera.ingresoegreso.models.entity;


import lombok.Data;

@Data
public class Rol {

    private long idRol;
    private String descripcion;
    private boolean estado;

}
