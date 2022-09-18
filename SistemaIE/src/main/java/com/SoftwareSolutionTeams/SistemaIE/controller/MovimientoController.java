package com.SoftwareSolutionTeams.SistemaIE.controller;

import com.SoftwareSolutionTeams.SistemaIE.entities.Movimiento;
import com.SoftwareSolutionTeams.SistemaIE.services.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MovimientoController {
    @Autowired
    MovimientoService movimientoService;
    @GetMapping("/movimiento")
    private List<Movimiento> verMovimiento(){
        return movimientoService.verMovimiento();
    }

    @PostMapping("/movimiento")
    private  void CrearActualizarMovimiento(@RequestBody Movimiento movimiento){
        movimientoService.crearActualizarMovimiento(movimiento);
    }
    @DeleteMapping("/movimiento/{id}")
    private void eliminarMovimiento(@PathVariable("id") long id) {
        movimientoService.eliminarMovimiento(id);
    }
    @PutMapping("/movimiento")
    private void editarMovimiento(@RequestBody Movimiento movimiento){
        movimientoService.crearActualizarMovimiento(movimiento);
    }

}

