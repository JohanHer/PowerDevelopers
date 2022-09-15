package co.gov.misiontic.cartera.ingresoegreso.controller;

import co.gov.misiontic.cartera.ingresoegreso.entities.Rol;
import co.gov.misiontic.cartera.ingresoegreso.service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RolRestController {

    @Autowired
    private IRolService RolService;

    @GetMapping("/rol/{id}")
    public Rol findById(@PathVariable int id){
        return RolService.findById(id);
    }

    @GetMapping("/rol")
    public List<Rol> findAll(){
        return RolService.findAll();
    }

    @PostMapping("/rol")
    public Rol createRol(@RequestBody Rol rol){
        return RolService.createRol(rol);
    }

    @PutMapping("/rol/{id}")
    public Rol updateRol(@PathVariable int id, @RequestBody Rol rol){
        return RolService.updateRol(id, rol);
    }

    @DeleteMapping("/rol/{id}")
    public void deleteRol(@PathVariable int id){
        RolService.deleteRol(id);

    }
}
