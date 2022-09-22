package com.SoftwareSolutionTeams.SistemaIE.entities;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Movimiento {
        // @GeneratedValue(strategy = GenerationType.AUTO)
        //@Column(name = "id", nullable = false)
        //private Long id;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String conceptoMovimiento;
    private float monto;

    @ManyToOne
    //@JoinColumn(name = "empleado_id")
    private Empleado empleado;

    @OneToMany(mappedBy = "movimiento")
    private List<Empresa> empresas;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    @UpdateTimestamp
    private LocalDateTime fechaActualizacion;

}


