package com.SoftwareSolutionTeams.SistemaIE.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Profile {
    @Id
    private String id;
    private String imageProfile;
    private String phone;
    @OneToOne
    private Empleado empleado;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    @UpdateTimestamp
    private LocalDateTime fechaActualizacion;

}
