package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.entities.TipoDocumento;
import co.gov.misiontic.cartera.ingresoegreso.repository.ITipodocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoService implements ITipoDocumentoService{
    @Autowired
    private ITipodocRepository tipodocRepository;
    @Override
    public TipoDocumento findId(int id) {
        Optional<TipoDocumento> tipoDocumento =tipodocRepository.findById((long)id);
        return tipoDocumento.get();
    }

    @Override
    public List<TipoDocumento> findAll() {
        List<TipoDocumento> tiposDeDocumento = (List<TipoDocumento>) tipodocRepository.findAll();

        return tiposDeDocumento;
    }

    @Override
    public TipoDocumento createDocType(TipoDocumento docType) {
        TipoDocumento newTipoDocumento = tipodocRepository.save(docType);
        return newTipoDocumento;
    }

    @Override
    public TipoDocumento updateDocType(int id, TipoDocumento docType) {
        TipoDocumento putTipoDocumento = tipodocRepository.save(docType);
        return putTipoDocumento;
    }

    @Override
    public void deleteDocType(int id) {tipodocRepository.deleteById((long)id); }
}
