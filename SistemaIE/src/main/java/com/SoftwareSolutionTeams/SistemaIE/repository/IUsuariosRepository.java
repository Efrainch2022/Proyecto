package com.SoftwareSolutionTeams.SistemaIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuariosRepository<Usuarios> extends JpaRepository<Usuarios,Long> {


}
