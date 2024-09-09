package com.cabanas.cabanashosp.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class ServiciosCategoria {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Hidden
	private int id;

    @Column(length = 30)
    private String nombre;  
}
