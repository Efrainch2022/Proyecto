package com.SoftwareSolutionTeams.SistemaIE.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreEmpresa;
    private String nitEmpresa;
    private String telefonoEmpresa;
    private String direccionEmpresa;
    @ManyToOne
    private Empleado empleado;
    @ManyToOne
    private Movimiento movimiento;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;
    @UpdateTimestamp
    private LocalDateTime fechaActualizacion;




    /*public Empresa(String nombreEmpresa, String direccionEmpresa, String nitEmpresa, long idEmpresa ) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.idEmpresa = idEmpresa;

    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }*/
}
