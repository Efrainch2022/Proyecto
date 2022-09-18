package com.SoftwareSolutionTeams.SistemaIE.repository;

import com.SoftwareSolutionTeams.SistemaIE.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa,Long> {


}
