package co.gov.misiontic.cartera.ingresoegreso.models.entity;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.empresa.Localizacion;
import lombok.Data;

//import javax.persistence.*;

//@Entity
//@Table(name="Empresa") //Entidad enlazada a una tabla
@Data // Genera los setter and getter y constructor
public class Empresa {
    // @Id //Llave primaria
    // @GeneratedValue(strategy = GenerationType.AUTO) //Para que se autoincremente
    private String nombre;
    private Localizacion direccion;
    private String telefoto;
    private String NIT;
}
