package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.Empresa;
import org.springframework.web.bind.annotation.PathVariable;

public interface IEmpleadoService {
    public Empresa findById(@PathVariable int id);
}
