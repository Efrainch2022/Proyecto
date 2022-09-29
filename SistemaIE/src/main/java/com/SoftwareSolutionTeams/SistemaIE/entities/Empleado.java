package com.SoftwareSolutionTeams.SistemaIE.entities;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
//@Table(name="empleado")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Empleado {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id", nullable = false)
    private Long id;
    private String nombreEmpleado;
    private String correo;
    private String password;

    @OneToOne(mappedBy="empleado")
    private Profile profile;

    @OneToMany(mappedBy = "empleado") //, fetch = FetchType.EAGER)
    //@JoinColumn(name = "empresa_id")
    private List<Empresa> empresas;

    @OneToMany( mappedBy = "empleado")
    private List<Movimiento> movimientos;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = ROLES.class, fetch = FetchType.EAGER)

    private List<ROLES> roles;

   // @CollectionTable()

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    @UpdateTimestamp
    private LocalDateTime fechaActualizacion;
}
