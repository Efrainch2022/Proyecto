package com.SoftwareSolutionTeams.SistemaIE.services;

import com.SoftwareSolutionTeams.SistemaIE.entities.Empresa;
import com.SoftwareSolutionTeams.SistemaIE.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {

    //inyeccion de dependecias
    @Autowired
    EmpresaRepository empresaRepository;

    public void crearYActualizarEmpresa(Empresa empresa) {
        empresaRepository.save(empresa);
    }

    public List<Empresa> verEmpresa() {
        List<Empresa> empresas = new ArrayList<Empresa>();
        empresas.addAll(empresaRepository.findAll());
        return empresas;
    }

    public void eliminarEmpresa(Long id) {
        empresaRepository.deleteById(id);
    }

    public void buscarEmpresa(Long idEmpresa) {
        empresaRepository.findById(idEmpresa);
    }

}

