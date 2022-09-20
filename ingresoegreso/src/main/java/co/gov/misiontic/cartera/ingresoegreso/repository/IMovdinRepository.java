package co.gov.misiontic.cartera.ingresoegreso.repository;

import co.gov.misiontic.cartera.ingresoegreso.entities.MovimientoDinero;
import org.springframework.data.repository.CrudRepository;

public interface IMovdinRepository extends CrudRepository<MovimientoDinero,Long> {
}
