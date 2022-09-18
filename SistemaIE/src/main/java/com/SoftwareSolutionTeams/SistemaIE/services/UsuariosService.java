package com.SoftwareSolutionTeams.SistemaIE.services;

import com.SoftwareSolutionTeams.SistemaIE.entities.Usuarios;
import com.SoftwareSolutionTeams.SistemaIE.repository.IUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuariosService {

    //inyeccion de dependecias
    @Autowired
    IUsuariosRepository iUsuariosRepository;

    public void crearYActualizarUsuarios(Usuarios usuarios){
        iUsuariosRepository.save(usuarios);
    }

    public List<Usuarios> verUsuarios(){
        List<Usuarios> usuarios = new ArrayList<Usuarios>();
        usuarios.addAll(iUsuariosRepository.findAll());
        return usuarios;
    }

    public void eliminarUsuarios(Long id){
        iUsuariosRepository.deleteById(id);
    }
    public void buscarUsuarios(Long idUsuarios){
        iUsuariosRepository.findById(idUsuarios);
    }

}
