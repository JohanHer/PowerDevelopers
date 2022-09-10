package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.Empleado;
import co.gov.misiontic.cartera.ingresoegreso.models.entity.Rol;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IEmpleadoService {
    public Empleado findById(@PathVariable int id);

    Empleado createEmpleado(Empleado empleado);

    Empleado updateEmpleado(int id, Empleado empleado);

    void deleteEmpleado(int id);

    List<Empleado> findAll();
}
