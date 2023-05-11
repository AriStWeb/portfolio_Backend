
package com.argentinaprograma.miPortfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombreApellido;
    private int edad;
    private String titulo;
    private String direccion;
    private String telefono;
    private String sobreMi;
    private String urlFotoPerfil;
  
    public Persona() {
    }

    public Persona(Long id, String nombreApellido, int edad, String titulo, String direccion, String telefono, String sobreMi, String urlFotoPerfil) {
        this.id = id;
        this.nombreApellido = nombreApellido;
        this.edad = edad;
        this.titulo = titulo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sobreMi = sobreMi;
        this.urlFotoPerfil = urlFotoPerfil;
    }
        
}
