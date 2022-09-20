package co.gov.misiontic.cartera.ingresoegreso.repository;

import co.gov.misiontic.cartera.ingresoegreso.entities.TipoDocumento;
import org.springframework.data.repository.CrudRepository;

public interface ITipodocRepository extends CrudRepository<TipoDocumento,Long> {
}
