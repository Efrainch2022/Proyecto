package com.SoftwareSolutionTeams.SistemaIE.services;

import com.SoftwareSolutionTeams.SistemaIE.entities.Empresa;
import com.SoftwareSolutionTeams.SistemaIE.repository.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {

    //inyeccion de dependecias
    @Autowired
    IEmpresaRepository iEmpresaRepository;

    public void crearYActualizarEmpresa(Empresa empresa){
        iEmpresaRepository.save(empresa);
     }

    public List<Empresa> verEmpresa(){
        List<Empresa> empresas = new ArrayList<Empresa>();
        empresas.addAll(iEmpresaRepository.findAll());
        return empresas;
    }

    public void eliminarEmpresa(Long id){
        iEmpresaRepository.deleteById(id);
    }
    public void buscarEmpresa(Long idEmpresa){
        iEmpresaRepository.findById(idEmpresa);
    }

}
