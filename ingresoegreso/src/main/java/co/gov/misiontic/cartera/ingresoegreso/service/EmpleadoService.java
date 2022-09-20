package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.entities.Empleado;
import co.gov.misiontic.cartera.ingresoegreso.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService {
    @Autowired
    private IEmpleadoRepository empleadoRepository;
    @Override
    public Empleado findById(int id) {
        Optional<Empleado> usuario= empleadoRepository.findById((long) id);
        return usuario.get();
    }
    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = (List<Empleado>) empleadoRepository.findAll();

        return empleados;
    }

    public Empleado createEmpleado(Empleado empleado) {
        Empleado newUser = empleadoRepository.save(empleado);
        return newUser;
    }

    @Override
    public Empleado updateEmpleado(int id, Empleado empleado) {
        Empleado upusuario = empleadoRepository.save(empleado);
        return upusuario;
    }

    @Override
    public void deleteEmpleado(int id) {empleadoRepository.deleteById((long)id);
    }



}
