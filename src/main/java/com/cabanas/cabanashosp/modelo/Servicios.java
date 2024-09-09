package com.cabanas.cabanashosp.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Servicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private int id;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private ServiciosCategoria categoria;

    @Column(length = 100, nullable = false)
    private String actividad;

    @Money
    @Column(nullable = false)
    private BigDecimal precio;
}
