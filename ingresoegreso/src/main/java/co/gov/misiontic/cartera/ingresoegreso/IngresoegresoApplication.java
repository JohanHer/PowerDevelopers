package co.gov.misiontic.cartera.ingresoegreso;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.Empresa;
import co.gov.misiontic.cartera.ingresoegreso.models.entity.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IngresoegresoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IngresoegresoApplication.class, args);
		//Empresa
		Empresa emp = new Empresa();
		emp.setIdEmpresa(1);
		emp.setNombre("POWER DEVELOPERS INC.");
		emp.setDireccion("Overland Park, Kansas, 10801 Mastin St # 620, Overland Park");
		emp.setTelefoto("+1 913-323-1200");
		emp.setNIT("8300518875");
		System.out.println("Nombre compañía: " + emp.getNombre()+" NIT: "+ emp.getNIT());
		System.out.println(emp);
		//Empleado

		//Movimiento
		MovimientoDinero movimiento = new MovimientoDinero();
		movimiento.setIdMovimiento(1);
		movimiento.setMonto("100000");
		movimiento.setConcepto("Servicios");
		movimiento.setUsuario("Johan H");
		System.out.println("get monto: " + movimiento.getMonto());
		System.out.println(movimiento);
	}
}

