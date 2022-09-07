package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.Empresa;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IEmpresaService {
    public Empresa busquedaId(int id);
    public List<Empresa> buscarTodo ();
    public Empresa crearEmpresa(Empresa emp);
    public Empresa actualizarEmpresaID(int id, Empresa emp);
    public void borrarEmpresaID(int id);

}
