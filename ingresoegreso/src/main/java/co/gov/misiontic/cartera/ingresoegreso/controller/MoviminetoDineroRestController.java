package co.gov.misiontic.cartera.ingresoegreso.controller;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.MovimientoDinero;
import co.gov.misiontic.cartera.ingresoegreso.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MoviminetoDineroRestController  {
    @Autowired
    private IMovimientoDineroService MovimientoDineroService;
    @GetMapping("/movements/{id}")
    public MovimientoDinero findId (@PathVariable int id){
        return MovimientoDineroService.findId(id);
    }
    @GetMapping("/movements")
    public List<MovimientoDinero> findAll () { return MovimientoDineroService.findAll(); }
    @PostMapping("/movements")
    public MovimientoDinero createMovement(@RequestBody MovimientoDinero moneyMov){
        return MovimientoDineroService.createMovement(moneyMov);
    }
    @PutMapping("/movements/{id}")
    public MovimientoDinero updateMovement (@PathVariable int id, @RequestBody MovimientoDinero moneyMov){
        return MovimientoDineroService.updateMovement(id, moneyMov);
    }
    @DeleteMapping("/movements/{id}")
    public void deleteMovement(@PathVariable int id){
        MovimientoDineroService.deleteMovement(id);
    }
}