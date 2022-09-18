package com.SoftwareSolutionTeams.SistemaIE.services;

import com.SoftwareSolutionTeams.SistemaIE.entities.Movimiento;
import com.SoftwareSolutionTeams.SistemaIE.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class MovimientoService {
    @Autowired
    MovimientoRepository movimientoRepository;

    public void  crearActualizarMovimiento(Movimiento movimiento){
        movimientoRepository.save(movimiento);
    }

    public List<Movimiento> verMovimiento(){
        List<Movimiento> movimientos = new ArrayList<Movimiento>();
        movimientos.addAll(movimientoRepository.findAll());
        return movimientos;
    }
    public void eliminarMovimiento(long id){
        movimientoRepository.deleteById(id);
    }

}



