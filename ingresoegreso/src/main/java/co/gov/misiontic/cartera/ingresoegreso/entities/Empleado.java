
package co.gov.misiontic.cartera.ingresoegreso.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empleado", nullable = false)
    private long idEmpleado;
    //no esta funcionando la siguiente libreria , la cual hace que el campo sea obligatorio
    //@javax.validation.constraints.NotEmpty
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "cedula", nullable = false)
    private String cedula;
    @Column(name = "correo", nullable = false)
    private String correo;
    @Column(name = "password", nullable = false)
    private String password;
    @ManyToOne
    @JoinColumn(name = "id_Empresa")
    private Empresa emp1;
    @Column(name = "estado", nullable = false)
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private TipoDocumento tipoDocumento;
    @Column(name = "perfil")
    private Perfil perfil;
    //@ManyToMany
    //@JoinColumn(name = "idMovimiento")
    //private MovimientoDinero movimiento;

}
