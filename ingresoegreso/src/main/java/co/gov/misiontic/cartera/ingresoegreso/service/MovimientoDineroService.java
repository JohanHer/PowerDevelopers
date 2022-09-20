package co.gov.misiontic.cartera.ingresoegreso.service;

import co.gov.misiontic.cartera.ingresoegreso.entities.MovimientoDinero;
import co.gov.misiontic.cartera.ingresoegreso.repository.IMovdinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientoDineroService implements IMovimientoDineroService{
    @Autowired
    private IMovdinRepository movdinRepository;
    @Override
    public MovimientoDinero findId (int id) {
        Optional<MovimientoDinero> movimiento = movdinRepository.findById((long)id);

        return movimiento.get();
    }

    @Override
    public List<MovimientoDinero> findAll() {
        List<MovimientoDinero> movimientos = (List<MovimientoDinero>) movdinRepository.findAll();

        return movimientos;
    }

    @Override
    public MovimientoDinero createMovement(MovimientoDinero moneyMov) {
        MovimientoDinero newmovimiento = movdinRepository.save(moneyMov);

        return newmovimiento;
    }

    @Override
    public MovimientoDinero updateMovement(int id, MovimientoDinero moneyMov) {
        MovimientoDinero actmovimiento = movdinRepository.save(moneyMov);

        return actmovimiento;
    }

    @Override
    public void deleteMovement(int id) { movdinRepository.deleteById((long)id); }
}
