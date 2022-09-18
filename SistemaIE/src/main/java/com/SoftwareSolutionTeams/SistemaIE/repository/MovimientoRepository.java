package com.SoftwareSolutionTeams.SistemaIE.repository;

import com.SoftwareSolutionTeams.SistemaIE.entities.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
}
