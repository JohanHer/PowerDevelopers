package co.gov.misiontic.cartera.ingresoegreso.repository;

import co.gov.misiontic.cartera.ingresoegreso.entities.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaRepository extends CrudRepository<Empresa,Long> {
}
