package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.Empleado;
import co.gov.misiontic.cartera.ingresoegreso.models.entity.Empresa;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IEmpleadoService {
    public Empresa findById(@PathVariable int id);

    Empleado createEmpleado(Empleado empleado);

    Empleado updateEmpleado(Empleado empleado);

    void deleteEmpleado(long id);

    List<Empleado> findAll();
}
