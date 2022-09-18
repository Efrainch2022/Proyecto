package com.SoftwareSolutionTeams.SistemaIE.controller;

import com.SoftwareSolutionTeams.SistemaIE.entities.Usuarios;
import com.SoftwareSolutionTeams.SistemaIE.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UsuariosController {

    @Autowired
    UsuariosService usuariosService;

    @GetMapping("/usuarios")
    private List<Usuarios> verUsuarios() {
        return usuariosService.verUsuarios();
    }

    @PostMapping("/usuarios")
    private void crearYActualizarUsuarios(@RequestBody Usuarios usuarios) {
        usuariosService.crearYActualizarUsuarios(usuarios);
    }

    @DeleteMapping("/usuarios{id}")
    private void eliminarUsuarios(@PathVariable("id") long id) {
        usuariosService.eliminarUsuarios(id);
    }

    @GetMapping("/usuarios{idUsuarios}")
    private void buscarUsuarios(@PathVariable("idUsuarios") long idUsuarios) {
        usuariosService.buscarUsuarios(idUsuarios);
    }
    @PatchMapping("/usuarios")
    private void editarUsuarios(@RequestBody Usuarios usuarios){
        usuariosService.crearYActualizarUsuarios(usuarios);
    }
}
