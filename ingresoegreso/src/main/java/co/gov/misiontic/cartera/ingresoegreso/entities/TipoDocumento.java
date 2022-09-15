package co.gov.misiontic.cartera.ingresoegreso.entities;

import lombok.Data;

@Data
public class TipoDocumento {

    private long idTipoDocumento;

    private String descripcion;

    private String siglas;

    private boolean estado;


}
