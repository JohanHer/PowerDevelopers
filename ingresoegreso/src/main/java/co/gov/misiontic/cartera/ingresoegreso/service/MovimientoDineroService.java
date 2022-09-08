package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.MovimientoDinero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoDineroService implements IMovimientoDineroService{
    @Override
    public MovimientoDinero findId (int id) {
        MovimientoDinero movimiento = new MovimientoDinero();
        movimiento.setIdMovimiento(id);
        movimiento.setMonto("999999999");
        movimiento.setConcepto("Concepto");
        movimiento.setUsuario("User");
        return movimiento;
    }

    @Override
    public List<MovimientoDinero> findAll() {
        List<MovimientoDinero> movimientos = new ArrayList<>();
        for (int mov=1; mov<=200; mov++) {
            MovimientoDinero movimiento = new MovimientoDinero();
            movimiento.setIdMovimiento(mov);
            movimiento.setMonto("999999999");
            movimiento.setConcepto("Concepto");
            movimiento.setUsuario("User");
            movimientos.add(movimiento);
        }
        return movimientos;
    }

    @Override
    public MovimientoDinero createMovement(MovimientoDinero moneyMov) {
        MovimientoDinero movimiento = new MovimientoDinero();
        movimiento.setIdMovimiento(1);
        movimiento.setMonto("999999999");
        movimiento.setConcepto("Concepto");
        movimiento.setUsuario("User");
        return movimiento;
    }

    @Override
    public MovimientoDinero updateMovement(int id, MovimientoDinero moneyMov) {
        MovimientoDinero movimiento = findId(id);
        movimiento.setUsuario(moneyMov.getUsuario());
        movimiento.setConcepto(moneyMov.getConcepto());
        movimiento.setMonto(moneyMov.getMonto());
        return movimiento;
    }

    @Override
    public void deleteMovement(int id) {
        MovimientoDinero movimiento = findId(id);
    }
}
