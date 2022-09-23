package com.SoftwareSolutionTeams.SistemaIE.entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyUserDetail implements UserDetails {
    private String username;
    private String password;
    private List<GrantedAuthority> authorities;

    public MyUserDetail(Empleado empleado){
        this.username = empleado.getCorreoEmpleado();
        this.password = empleado.getPassword();
        List<GrantedAuthority> roles = new ArrayList<>();
        //ADMIN, EMPLEADO, APRENDIZ
        for (ROLES rol: empleado.getRoles()){
            roles.add(
                    new SimpleGrantedAuthority(rol.name())
            );
        }
        this.authorities =roles;
    }




    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}