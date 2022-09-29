package com.SoftwareSolutionTeams.SistemaIE.controller;

import com.SoftwareSolutionTeams.SistemaIE.entities.Empleado;
import com.SoftwareSolutionTeams.SistemaIE.entities.ROLES;
import com.SoftwareSolutionTeams.SistemaIE.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FrontendEmpleado {

    @Autowired
    EmpleadoService empleadoService;

    @PostMapping("/empleado/front")
    public String postEmpleado(@ModelAttribute("user") Empleado empleado){
        try {
            String mensaje = empleadoService.crearYActualizarEmpleado(empleado);
            return "redirect:/welcome";

        } catch (Exception e) {
        }
        return "redirect:/error";
    }

    @GetMapping("/addEmpleado")
    public String getAddEmpleado(Model model){
        model.addAttribute("user", new Empleado());
        model.addAttribute("ROLES", ROLES.values());

        return "addEmpleado";
    }

    @GetMapping("/updateempleado")//Muestra actualización
    public  String getUpdateEmpleado(Model model){
        return "updateempleado";
    }


    @GetMapping("/empleado/front/{id}")// actualizar empleado metodo trae el empleado a actualizar
    public String getEmpleado(@PathVariable Long id, Model model){
        try {
            model.addAttribute("userUpdate", empleadoService.getEmpleado(id));
            model.addAttribute("ROLES", ROLES.values());
            return "redirect:/updateempleado";
        } catch (Exception e) {

            return "redirect:/error";
        }

    }



    @DeleteMapping("/empleado/front/{id}") // borrar empleado
    public String deleteEmpleado(@PathVariable Long id, Model model){
        try {
            empleadoService.eliminarEmpleado(id);
            return "redirect:/welecome";
        }catch(Exception e){
              return "redirect:/error";
        }
    }
    @PutMapping("/empleado/front/update")
    public String putEmpleado(@ModelAttribute("userUpdate") Empleado empleado){
        try {
            empleadoService.updateUsuarioAll(empleado, empleado.getId());
            return "redirect:/welecome";
        } catch (Exception e) {
            return "redirect:/error";
        }
    }

}
