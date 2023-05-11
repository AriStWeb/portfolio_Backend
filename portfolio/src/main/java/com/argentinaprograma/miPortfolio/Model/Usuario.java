
package com.argentinaprograma.miPortfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Usuario {
   
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String correo;
    private int contrasenia;
    
    public Usuario() {
    }

    public Usuario(Long id, String correo, int contrasenia) {
        this.id = id;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }
    
    
    
}
