package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.Rol;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RolService implements IRolService{
    @Override
    public Rol findById(int id) {
        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        return rol;
    }

    @Override
    public List<Rol> findAll() {
        List<Rol> roles = new ArrayList<>();
        Rol rol1 = new Rol();
        rol1.setIdRol(1);
        rol1.setDescripcion("Admin");
        rol1.setEstado(true);
        roles.add(rol1);
        Rol rol2 = new Rol();
        rol2.setIdRol(2);
        rol2.setDescripcion("User");
        rol2.setEstado(true);
        roles.add(rol2);
        return roles;
    }

    @Override
    public Rol createRol(Rol rol) {
        Rol newRol = new Rol();
        newRol.setIdRol(1);
        newRol.setDescripcion("Admin");
        newRol.setEstado(true);
        return newRol;
    }

    @Override
    public Rol updateRol(int id, @NotNull Rol rol) {
        Rol putRol = findById(id);
        putRol.setDescripcion(rol.getDescripcion());
        putRol.setEstado(rol.isEstado());
        return putRol;
    }

    @Override
    public void deleteRol(int id) {
        Rol deleteRol = findById(id);
    }
}
