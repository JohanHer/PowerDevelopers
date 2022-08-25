package co.gov.misiontic.cartera.ingresoegreso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/usuario")
public class RestUsuarioController {

    @GetMapping("/")
    public String test() {
        return "Hola mundo";
    }
}
