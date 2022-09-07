package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.Empresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmpresaService implements IEmpresaService {

    @Override
    public Empresa busquedaId(int id) {
        Empresa emp1 = new Empresa ();
        emp1.setIdEmpresa(id);
        emp1.setNombre("IMA SAS");
        emp1.setDireccion("Clle 24 A # 112-25");
        emp1.setTelefono("601 2922211");
        emp1.setNIT("860002122-1");
        return emp1;
    }

    @Override
    public List<Empresa> buscarTodo() {
        List<Empresa> empresas = new ArrayList<Empresa>();
        Empresa emp2 = new Empresa ();
        emp2.setIdEmpresa(2);
        emp2.setNombre("IMA SAS");
        emp2.setDireccion("Clle 24 A # 112-25");
        emp2.setTelefono("601 2922211");
        emp2.setNIT("860002122-1");
        empresas.add(emp2);
        Empresa emp3 = new Empresa ();
        emp3.setIdEmpresa(3);
        emp3.setNombre("CITYPARKING LTDA");
        emp3.setDireccion("Clle 123 A # 12-25");
        emp3.setTelefono("601 5467894");
        emp3.setNIT("860877488-6");
        empresas.add(emp3);
        return empresas;
    }

    @Override
    public Empresa crearEmpresa(Empresa emp) {
        Empresa emp4 = new Empresa ();
        emp4.setIdEmpresa(4);
        emp4.setNombre(emp.getNombre());
        emp4.setDireccion(emp.getDireccion());
        emp4.setTelefono(emp.getTelefono());
        emp4.setNIT(emp.getNIT());
        return emp4;
    }

    @Override
    public Empresa actualizarEmpresaID(int id, Empresa emp) {
        Empresa ActEmp = busquedaId(id);
        ActEmp.setNombre(emp.getNombre());
        ActEmp.setDireccion(emp.getDireccion());
        ActEmp.setTelefono(emp.getTelefono());
        ActEmp.setNIT(emp.getNIT());
        return ActEmp;
    }

    @Override
    public void borrarEmpresaID(int id) {
        Empresa borrarEmp = busquedaId(id);

    }
}
