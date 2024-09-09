package com.cabanas.cabanashosp.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Cliente {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Hidden
	private int id;
	
    @Column(length = 10)
    private String nombre;

    @Column(length = 10)
    private String apellido;

    @Column(length = 15)
    private String telefono;
        
    @Column(length = 50)
    private String correo;
}