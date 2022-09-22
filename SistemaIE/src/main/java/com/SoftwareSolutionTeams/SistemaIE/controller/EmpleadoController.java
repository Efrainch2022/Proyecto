package com.SoftwareSolutionTeams.SistemaIE.controller;

import com.SoftwareSolutionTeams.SistemaIE.entities.Empleado;
import com.SoftwareSolutionTeams.SistemaIE.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;


    @GetMapping("/empleado")
    private List<Empleado> verEmpleado() {

        return empleadoService.verEmpleado();
    }

    @PostMapping("/empleado")
    private void crearYActualizarEmpleado(@RequestBody Empleado empleado) {
        empleadoService.crearYActualizarEmpleado(empleado);
    }

    @DeleteMapping("/empleado{id}")
    private void eliminarEmpleado(@PathVariable("id") long id) {
        empleadoService.eliminarEmpleado(id);
    }

    @GetMapping("/empresa{idEmpleado}")
    private void buscarEmpleado(@PathVariable("id") long id) {
        empleadoService.buscarEmpresa(id);
    }
    @PatchMapping("/empleado")

    private void editarEmpleado(@RequestBody Empleado empleado){
        empleadoService.crearYActualizarEmpleado(empleado);
    }
}
