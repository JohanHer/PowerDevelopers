package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.models.entity.Empresa;
import co.gov.misiontic.cartera.ingresoegreso.models.entity.MovimientoDinero;

import java.util.List;

public interface IMovimientoDineroService {

    public MovimientoDinero findId(int id);
    public List<MovimientoDinero> findAll ();
    public MovimientoDinero createMovement(MovimientoDinero moneyMov);
    public MovimientoDinero updateMovement(int id, MovimientoDinero moneyMov);
    public void deleteMovement (int id);

}
