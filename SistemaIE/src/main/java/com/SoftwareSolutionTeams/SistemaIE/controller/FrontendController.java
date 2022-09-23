package com.SoftwareSolutionTeams.SistemaIE.controller;

import com.SoftwareSolutionTeams.SistemaIE.entities.Empleado;
import com.SoftwareSolutionTeams.SistemaIE.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FrontendController {
    @Autowired
    private EmpleadoService empleadoService;
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
    @GetMapping("/login")
    public String getLogin(Model model){
        model.addAttribute("formEmpleado", new Empleado());
        return "login";
    }

    @GetMapping("/welcome")
    public String getWelcome(Model model){
        model.addAttribute("empleados", empleadoService.verEmpleado());
        return "welcome";
    }


    @PostMapping("/login")
    public String login(@ModelAttribute("formEmpleado") Empleado empleado){
        System.out.println(empleado);
        return "redirect:/welcome";

    }



}
