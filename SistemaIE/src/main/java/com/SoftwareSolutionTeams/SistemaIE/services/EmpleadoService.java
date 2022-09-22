package com.SoftwareSolutionTeams.SistemaIE.services;

import com.SoftwareSolutionTeams.SistemaIE.entities.Empleado;
import com.SoftwareSolutionTeams.SistemaIE.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

    //inyeccion de dependecias
    @Autowired
    EmpleadoRepository empleadoRepository;

    public void crearYActualizarEmpleado(Empleado empleado){

        empleadoRepository.save(empleado);
    }

    public List<Empleado> verEmpleado(){
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.addAll(empleadoRepository.findAll());
        return empleados;
    }

    public void eliminarEmpleado(Long id){
        empleadoRepository.deleteById(id);
    }
    public void buscarEmpresa(Long id){
        empleadoRepository.findById(id);
    }

}
