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
        usuario.setIdEmpleado(id);
        usuario.setNombre("marco");
        usuario.setApellido("perez");
        usuario.setCedula("123456789");
        usuario.setEstado(true);
        usuario.setCorreo("ejemplo@gmail.com");
        usuario.setPassword("a1b2c3d4");
        rol.setIdRol(1);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        usuario.setRol(rol);
        usuario.setEmpresa("POWER DEVELOPERS INC.");
        return usuario;
    }


    public Empleado createEmpleado(Empleado empleado) {
        Empleado newUser = new Empleado();
        Rol newRol = new Rol();
        Rol rol = empleado.getRol();
        newUser.setIdEmpleado(empleado.getIdEmpleado());
        newUser.setNombre(empleado.getNombre());
        newUser.setApellido(empleado.getApellido());
        newUser.setCedula(empleado.getCedula());
        newUser.setEstado(empleado.isEstado());
        newUser.setCorreo(empleado.getCorreo());
        newUser.setPassword(empleado.getPassword());
        newUser.setEmpresa(empleado.getEmpresa());
        newRol.setIdRol(rol.getIdRol());
        newRol.setDescripcion(rol.getDescripcion());
        newRol.setEstado(rol.isEstado());
        newUser.setRol(newRol);
        return newUser;
    }

    @Override
    public Empleado updateEmpleado(int id, Empleado empleado) {
        Empleado usuario = findById(id);
        Rol updateRol = new Rol();
        Rol rol = empleado.getRol();
        usuario.setIdEmpleado(id);
        usuario.setNombre(empleado.getNombre());
        usuario.setApellido(empleado.getApellido());
        usuario.setCedula(empleado.getCedula());
        usuario.setCorreo(empleado.getCorreo());
        usuario.setPassword(empleado.getPassword());
        usuario.setEstado(empleado.isEstado());
        updateRol.setIdRol(rol.getIdRol());
        updateRol.setDescripcion(rol.getDescripcion());
        updateRol.setEstado(rol.isEstado());
        usuario.setRol(updateRol);
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
            usuario.setApellido("Velandia");
            usuario.setCedula("152707033");
            usuario.setEstado(true);
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
