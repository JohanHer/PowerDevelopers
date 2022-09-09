package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.Empleado;
import co.gov.misiontic.cartera.ingresoegreso.models.entity.MovimientoDinero;
import co.gov.misiontic.cartera.ingresoegreso.models.entity.Rol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Override
    public Empleado findById(int id) {
        Empleado usuario = new Empleado();
        Rol rol = new Rol();
        usuario.setIdEmpleado(1);
        usuario.setNombre("Alfonso");
        usuario.setCorreo("dilmervelanida@gmail.com");
        usuario.setPassword("a1b2c3d4");
        rol.setIdRol(1);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        usuario.setRol(rol);
        usuario.setEmpresa("POWER DEVELOPERS INC.");
        return usuario;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        Empleado usuario = new Empleado();
        Rol rol = new Rol();
        usuario.setIdEmpleado(1);
        usuario.setNombre("Alfonso");
        usuario.setCorreo("dilmervelanida@gmail.com");
        usuario.setPassword("a1b2c3d4");
        rol.setIdRol(1);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        usuario.setRol(rol);
        usuario.setEmpresa("POWER DEVELOPERS INC.");
        return usuario;
    }

    @Override
    public Empleado updateEmpleado(int id, Empleado empleado) {
        Empleado usuario = findById(id);
        Rol rol = new Rol();
        usuario.setIdEmpleado(1);
        usuario.setNombre(usuario.getNombre());
        usuario.setCorreo(usuario.getCorreo());
        usuario.setPassword(usuario.getPassword());
        rol.setIdRol(rol.getIdRol());
        rol.setDescripcion(rol.getDescripcion());
        rol.setEstado(rol.isEstado());
        usuario.setEmpresa(empleado.getEmpresa());
        return usuario;
    }

    @Override
    public void deleteEmpleado(int id) {
        Empleado empleado = findById(id);
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = new ArrayList<>();
        for (int emp=1; emp<=200; emp++) {
            Empleado usuario = new Empleado();
            Rol rol = new Rol();
            usuario.setIdEmpleado(emp);
            usuario.setNombre("Alfonso");
            usuario.setCorreo("dilmervelanida@gmail.com");
            usuario.setPassword("a1b2c3d4");
            rol.setIdRol(1);
            rol.setDescripcion("Admin");
            rol.setEstado(true);
            usuario.setRol(rol);
            usuario.setEmpresa("POWER DEVELOPERS INC.");
            empleados.add(usuario);
        }
        return empleados;
    }

}
