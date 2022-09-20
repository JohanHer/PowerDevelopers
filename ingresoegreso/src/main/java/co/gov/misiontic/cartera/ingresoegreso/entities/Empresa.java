package co.gov.misiontic.cartera.ingresoegreso.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Empresas")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empresa", nullable = false)
    private long idEmpresa;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "NIT", nullable = false)
    private String NIT;
}
