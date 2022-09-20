package co.gov.misiontic.cartera.ingresoegreso;

import co.gov.misiontic.cartera.ingresoegreso.entities.Empleado;
import co.gov.misiontic.cartera.ingresoegreso.entities.Empresa;
import co.gov.misiontic.cartera.ingresoegreso.entities.MovimientoDinero;
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
		emp.setTelefono("+1 913-323-1200");
		emp.setNIT("8300518875");
		System.out.println("Nombre compañía: " + emp.getNombre() + " NIT: "+ emp.getNIT());
		System.out.println(emp);


		//Empleado
		Empleado usuario = new Empleado();
		usuario.setIdEmpleado(1);
		usuario.setNombre("Alfonso");
		usuario.setCorreo("dilmervelanida@gmail.com");
		usuario.setPassword("a1b2c3d4");
		//usuario.setEmpresa("POWER DEVELOPERS INC.");
		//System.out.println("Nombre: " + usuario.getNombre()+" Correo: "+ usuario.getCorreo()+"Empresa:" + usuario.getEmpresa());
		//System.out.println("Rol:" + usuario.getRol());


		//Movimiento
		MovimientoDinero movimiento = new MovimientoDinero();
		movimiento.setIdMovimiento(1);
		movimiento.setMonto("100000");
		movimiento.setConcepto("Servicios");
		//movimiento.setUsuario("Johan H");
		System.out.println("get monto: " + movimiento.getMonto());
		System.out.println(movimiento);
	}
}

