package co.gov.misiontic.cartera.ingresoegreso.controller;


import co.gov.misiontic.cartera.ingresoegreso.entities.Empresa;
import co.gov.misiontic.cartera.ingresoegreso.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaRestController {
    @Autowired
    private IEmpresaService empresaService;
    @GetMapping("/enterprises/{id}")
    public Empresa busquedaId(@PathVariable int id){
        return empresaService.busquedaId(id);
    }
    @GetMapping("/enterprises")
    public List<Empresa> buscarTodo (){
        return empresaService.buscarTodo();
    }
    @PostMapping("/enterprises")
    public Empresa crearEmpresa(@RequestBody Empresa emp){
        return empresaService.crearEmpresa(emp);
    }

    @PutMapping("/enterprises/{id}")
    public Empresa actualizarEmpresaID(@PathVariable int id, @RequestBody Empresa emp){
        return empresaService.actualizarEmpresaID(id, emp);
    }

    @DeleteMapping("/enterprises/{id}")
        public void borrarEmpresaID(@PathVariable int id){
        empresaService.borrarEmpresaID(id);
    }
}
