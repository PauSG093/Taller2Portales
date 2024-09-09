package com.cabanas.cabanashosp.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Reservas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "cabana_id", nullable = false)
    private Cabanas cabana;

    @ManyToMany
    @JoinTable(
        name = "reserva_servicios",
        joinColumns = @JoinColumn(name = "reserva_id"),
        inverseJoinColumns = @JoinColumn(name = "servicio_id")
    )
    Collection<Servicios> servicios = new ArrayList<>();

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    @Column
    private LocalDate fecha;

    @TextArea
    private String observacion;
}


