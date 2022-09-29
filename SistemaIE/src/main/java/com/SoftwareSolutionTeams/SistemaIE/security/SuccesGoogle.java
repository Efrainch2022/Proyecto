package com.SoftwareSolutionTeams.SistemaIE.security;

import com.SoftwareSolutionTeams.SistemaIE.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component

public class SuccesGoogle implements AuthenticationSuccessHandler {
    @Autowired
    EmpleadoService empleadoService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
       DefaultOidcUser user= (DefaultOidcUser) authentication.getPrincipal(); //usuario por default trae el correo
        String correoUser= user.getEmail();
        try {
            empleadoService.findByCorreoEmpleado(correoUser);
            response.sendRedirect("/welcome");
        } catch (Exception e) {
            new SecurityContextLogoutHandler().logout(request,response,authentication);
            //logout()
            //response.sendRedirect("/login");
        }

    }
}
