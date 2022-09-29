package com.SoftwareSolutionTeams.SistemaIE.services;

import com.SoftwareSolutionTeams.SistemaIE.entities.Empleado;
import com.SoftwareSolutionTeams.SistemaIE.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    //inyeccion de dependecias
    @Autowired
    EmpleadoRepository empleadoRepository;

    public String crearYActualizarEmpleado(Empleado empleado){

        empleadoRepository.save(empleado);
        return "Empleado creado exitosamente";
    }

    public List<Empleado> verEmpleado(){
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.addAll(empleadoRepository.findAll());
        return empleados;
    }

    public String eliminarEmpleado(Long id){
        empleadoRepository.deleteById(id);
        return "Empleado Eliminado exitosamente";
    }


    public void buscarEmpleado(Long id){
        empleadoRepository.findById(id);
    }

    public Empleado getEmpleado(long id) throws Exception {
        Optional<Empleado> empleadoBd = empleadoRepository.findById(id); //opcional si encontro o no encontro
        if(empleadoBd.isPresent()){
            System.out.println(empleadoBd);
            return empleadoBd.get();
        }
        throw new Exception("Empleado no existe");
    }
    public Empleado findByCorreoEmpleado(String correo){
       return empleadoRepository.findByCorreo(correo);
    }

   // @Transactional // bloque db cuando hay dos eventos

    public Empleado updateUsuarioAll(Empleado empleado_update, Long id) throws Exception {
        empleadoRepository.update(empleado_update.getNombreEmpleado(), empleado_update.getCorreo(), empleado_update.getPassword(), id);
        return getEmpleado(id);
    }

}
