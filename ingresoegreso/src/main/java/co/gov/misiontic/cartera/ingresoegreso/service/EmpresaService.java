package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.entities.Empresa;
import co.gov.misiontic.cartera.ingresoegreso.repository.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements IEmpresaService {

    @Autowired
    private IEmpresaRepository empresaRepository;
    @Override
    public Empresa busquedaId(int id) {
        Optional<Empresa> empresa = empresaRepository.findById((long)id);
        return empresa.get();
    }

    @Override
    public List<Empresa> buscarTodo() {
        List<Empresa> empresas =(List<Empresa>) empresaRepository.findAll();
        return empresas;
    }

    @Override
    public Empresa crearEmpresa(Empresa emp) {
        Empresa newempresa  = empresaRepository.save(emp);

        return newempresa;
    }

    @Override
    public Empresa actualizarEmpresaID(int id, Empresa emp) {
        Empresa ActEmp = empresaRepository.save(emp);

        return ActEmp;
    }

    @Override
    public void borrarEmpresaID(int id) {empresaRepository.deleteById((long)id);

    }
}
