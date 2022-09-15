package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.entities.Empresa;

import java.util.List;

public interface IEmpresaService {
    public Empresa busquedaId(int id);
    public List<Empresa> buscarTodo ();
    public Empresa crearEmpresa(Empresa emp);
    public Empresa actualizarEmpresaID(int id, Empresa emp);
    public void borrarEmpresaID(int id);

}
