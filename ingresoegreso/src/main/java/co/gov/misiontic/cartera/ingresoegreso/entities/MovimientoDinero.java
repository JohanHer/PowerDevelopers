package co.gov.misiontic.cartera.ingresoegreso.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Mov_dineros")

public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMovimiento", nullable = false)
    private long idMovimiento;
    @Column(name = "monto", nullable = false)
    private String monto;
    @Column(name = "concepto", nullable = false)
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "id_Empresa")
    private Empresa emp1;
    @ManyToOne
    @JoinColumn(name = "id_Empleado")
    private Empleado usuario;
}
