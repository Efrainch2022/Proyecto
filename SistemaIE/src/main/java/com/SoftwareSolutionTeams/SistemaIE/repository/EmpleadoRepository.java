package com.SoftwareSolutionTeams.SistemaIE.repository;

import com.SoftwareSolutionTeams.SistemaIE.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long>  {
    public Empleado findByCorreo(String correo);

    @Modifying
    @Query("UPDATE Empleado u SET u.nombreEmpleado= :nombreEmpleado,u.correo= :correo, u.password= :password WHERE u.id= :id")
    public int update(String nombreEmpleado, String correo, String password, long id);

}
