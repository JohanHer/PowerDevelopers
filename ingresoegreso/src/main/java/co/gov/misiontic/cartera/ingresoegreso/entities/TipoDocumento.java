package co.gov.misiontic.cartera.ingresoegreso.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Tipo_documentos")
public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoDocumento", nullable = false)
    private long idTipoDocumento;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "siglas", nullable = false)
    private String siglas;
    @Column(name = "estado", nullable = false)
    private boolean estado;


}
