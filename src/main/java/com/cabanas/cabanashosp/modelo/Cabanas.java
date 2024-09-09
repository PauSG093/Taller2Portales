package com.cabanas.cabanashosp.modelo;

import java.math.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Cabanas {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Hidden
    private int id;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Money
    @Column(nullable = false) 
    private BigDecimal precio;

    @Column(nullable = false)
    @Min(value = 1, message = "La capacidad debe ser al menos 1 persona")
    private int capacidad;

    @Money
    @Column(nullable = false) 
    private BigDecimal precioTemporadaAlta;

}
