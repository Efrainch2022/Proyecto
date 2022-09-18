package com.SoftwareSolutionTeams.SistemaIE.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombreUsuarios;
    private String correoUsuarios;
    private String empresaUsuarios;
    private long   idUsuarios;
}
