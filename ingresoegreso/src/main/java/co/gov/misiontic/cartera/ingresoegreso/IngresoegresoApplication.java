package co.gov.misiontic.cartera.ingresoegreso;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IngresoegresoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IngresoegresoApplication.class, args);
		//Empresa

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

