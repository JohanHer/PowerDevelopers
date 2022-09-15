package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.entities.TipoDocumento;

import java.util.List;

public interface ITipoDocumentoService {

    public TipoDocumento findId(int id);
    public List<TipoDocumento> findAll ();
    public TipoDocumento createDocType(TipoDocumento docType);
    public TipoDocumento updateDocType(int id, TipoDocumento docType);
    public void deleteDocType (int id);


}
