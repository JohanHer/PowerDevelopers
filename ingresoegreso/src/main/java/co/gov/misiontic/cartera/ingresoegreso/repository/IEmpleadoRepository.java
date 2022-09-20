package co.gov.misiontic.cartera.ingresoegreso.repository;

import co.gov.misiontic.cartera.ingresoegreso.entities.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends CrudRepository<Empleado,Long> {
}
