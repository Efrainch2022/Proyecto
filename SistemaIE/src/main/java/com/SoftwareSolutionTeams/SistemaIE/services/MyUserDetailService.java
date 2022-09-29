package com.SoftwareSolutionTeams.SistemaIE.services;

import com.SoftwareSolutionTeams.SistemaIE.entities.Empleado;
import com.SoftwareSolutionTeams.SistemaIE.entities.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
        EmpleadoService empleadoService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { //busca empleado
        System.out.println(username);
        try {
            Empleado user=empleadoService.findByCorreoEmpleado(username);
            System.out.println(user);
            return new MyUserDetail(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new UsernameNotFoundException (e.getMessage());
        }

    }


}
