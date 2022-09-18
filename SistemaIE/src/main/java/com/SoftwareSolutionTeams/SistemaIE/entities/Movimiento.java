package com.SoftwareSolutionTeams.SistemaIE.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

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
    private long idMovimiento;
    private String conceptoMovimiento;
    private float monto;
 }


