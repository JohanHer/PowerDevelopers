package co.gov.misiontic.cartera.ingresoegreso.controller;


import co.gov.misiontic.cartera.ingresoegreso.models.entity.Empleado;
import co.gov.misiontic.cartera.ingresoegreso.service.EmpleadoService;
import co.gov.misiontic.cartera.ingresoegreso.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleado/{id}")
    public Empleado findById(@PathVariable int id){
        return EmpleadoService.findById(id);
    }

    @GetMapping("/empleado")
    public List<Empleado> findAll(){
        return this.empleadoService.findAll();
    }

    @PostMapping("/empleado")
    public Empleado createEmpleado (@RequestBody Empleado empleado){
        return this.empleadoService.createEmpleado(empleado);
    }

    @PutMapping("/empleado")
    public Empleado updateempleado(@RequestBody Empleado empleado){
        return this.empleadoService.updateEmpleado(empleado);
    }

    @DeleteMapping("/empleado/{id}")
    public void deleteEmpleado(@PathVariable long id){
        this.empleadoService.deleteEmpleado(id);
    }

}

