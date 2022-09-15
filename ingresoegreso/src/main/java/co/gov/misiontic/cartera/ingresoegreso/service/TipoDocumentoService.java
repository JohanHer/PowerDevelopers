package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.entities.TipoDocumento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TipoDocumentoService implements ITipoDocumentoService{

    @Override
    public TipoDocumento findId(int id) {
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setIdTipoDocumento(id);
        tipoDocumento.setDescripcion("Cédula de ciudadania");
        tipoDocumento.setSiglas("CC");
        tipoDocumento.setEstado(true);
        return tipoDocumento;
    }

    @Override
    public List<TipoDocumento> findAll() {
        List<TipoDocumento> tiposDeDocumento = new ArrayList<TipoDocumento>();
        TipoDocumento tipoDocumento1 = new TipoDocumento();
        tipoDocumento1.setIdTipoDocumento(1);
        tipoDocumento1.setDescripcion("Cédula de ciudadania");
        tipoDocumento1.setSiglas("CC");
        tipoDocumento1.setEstado(true);
        tiposDeDocumento.add(tipoDocumento1);
        TipoDocumento tipoDocumento2 = new TipoDocumento();
        tipoDocumento2.setIdTipoDocumento(2);
        tipoDocumento2.setDescripcion("Tarjeta de identidad");
        tipoDocumento2.setSiglas("TI");
        tipoDocumento2.setEstado(true);
        tiposDeDocumento.add(tipoDocumento2);
        return tiposDeDocumento;
    }

    @Override
    public TipoDocumento createDocType(TipoDocumento docType) {
        TipoDocumento newTipoDocumento = new TipoDocumento();
        newTipoDocumento.setDescripcion(newTipoDocumento.getDescripcion());
        newTipoDocumento.setSiglas(newTipoDocumento.getSiglas());
        newTipoDocumento.setEstado(newTipoDocumento.isEstado());
        return newTipoDocumento;
    }

    @Override
    public TipoDocumento updateDocType(int id, TipoDocumento docType) {
        TipoDocumento putTipoDocumento = findId(id);
        putTipoDocumento.setDescripcion(putTipoDocumento.getDescripcion());
        putTipoDocumento.setSiglas(putTipoDocumento.getSiglas());
        putTipoDocumento.setEstado(putTipoDocumento.isEstado());
        return putTipoDocumento;
    }

    @Override
    public void deleteDocType(int id) {
        TipoDocumento tipoDocumento = findId(id);
    }
}
