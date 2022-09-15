package co.gov.misiontic.cartera.ingresoegreso.controller;


import co.gov.misiontic.cartera.ingresoegreso.entities.Empleado;
import co.gov.misiontic.cartera.ingresoegreso.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

    @Autowired
    private IEmpleadoService EmpleadoService;

    @GetMapping("/empleado/{id}")
    public Empleado findById(@PathVariable int id){
        return EmpleadoService.findById(id);
    }

    @GetMapping("/empleado")
    public List<Empleado> findAll(){
        return this.EmpleadoService.findAll();
    }

    @PostMapping("/empleado")
    public Empleado createEmpleado (@RequestBody Empleado empleado){
        return this.EmpleadoService.createEmpleado(empleado);
    }

    @PutMapping("/empleado/{id}")
    public Empleado updateEmpleado(@PathVariable int id, @RequestBody Empleado empleado){
        return this.EmpleadoService.updateEmpleado(id, empleado);
    }

    @DeleteMapping("/empleado/{id}")
    public void deleteEmpleado(@PathVariable int id){
        this.EmpleadoService.deleteEmpleado(id);
    }

}

