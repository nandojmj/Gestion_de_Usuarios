package com.nandomj.paneladmin.models;

//maven lombok en https://projectlombok.org/setup/maven
// Adding lombok to your pom file
// <dependency>
//		<groupId>org.projectlombok</groupId>
//		<artifactId>lombok</artifactId>
//		<version>1.18.32</version>
//		<scope>provided</scope>
//	</dependency> Y adicionarlo al pom.xml en dependencys

import lombok.*;

//o a la altura de la clase asi: @Getter @Setter
@Data
@AllArgsConstructor
public class Usuario {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

}
