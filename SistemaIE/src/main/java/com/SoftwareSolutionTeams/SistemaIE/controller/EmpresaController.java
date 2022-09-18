package com.SoftwareSolutionTeams.SistemaIE.controller;

import com.SoftwareSolutionTeams.SistemaIE.entities.Empresa;
import com.SoftwareSolutionTeams.SistemaIE.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping("/empresa")
    private List<Empresa> verEmpresa() {
        return empresaService.verEmpresa();
    }

    @PostMapping("/empresa")
    private void crearYActualizarEmpresa(@RequestBody Empresa empresa) {
        empresaService.crearYActualizarEmpresa(empresa);
    }

    @DeleteMapping("/empresa{id}")
    private void eliminarEmpresa(@PathVariable("id") long id) {
        empresaService.eliminarEmpresa(id);
    }

    @GetMapping("/empresa{idEmpresa}")
    private void buscarEmpresa(@PathVariable("idEmpresa") long idEmpresa) {
        empresaService.buscarEmpresa(idEmpresa);
    }
    @PatchMapping("/empresa")

    private void editarEmpresa(@RequestBody Empresa empresa){
        empresaService.crearYActualizarEmpresa(empresa);
    }
}