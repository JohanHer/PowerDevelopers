package co.gov.misiontic.cartera.ingresoegreso.controller;

import co.gov.misiontic.cartera.ingresoegreso.entities.TipoDocumento;
import co.gov.misiontic.cartera.ingresoegreso.service.ITipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class TipoDocumentoRestcontroller {

    @Autowired
    private ITipoDocumentoService docTypeService;

    @GetMapping("/tipoDocumento/{id}")
    public TipoDocumento findById(@PathVariable int id){
        return docTypeService.findId(id);
    }

    @GetMapping("/tipoDocumento")
    public List<TipoDocumento> findAll(){
        return docTypeService.findAll();
    }

    @PostMapping("/tipoDocumento")
    public TipoDocumento createDocType(@RequestBody TipoDocumento tipoDocumento){
        return docTypeService.createDocType(tipoDocumento);
    }

    @PutMapping("/tipoDocumento/{id}")
    public TipoDocumento updateDocType(@PathVariable int id, @RequestBody TipoDocumento tipoDocumento){
        return docTypeService.updateDocType(id, tipoDocumento);
    }

    @DeleteMapping("/tipoDocumento/{id}")
    public void deleteRol(@PathVariable int id){
        docTypeService.deleteDocType(id);
    }
}
