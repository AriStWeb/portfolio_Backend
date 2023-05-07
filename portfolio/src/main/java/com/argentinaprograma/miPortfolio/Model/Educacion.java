
package com.argentinaprograma.miPortfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
      
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre_educ;
    private String descripcionEduc;
    private int anioInicioEduc;
    private int anioFinEduc;
    private String nombreOrgEduc;
    private String imgEduc;

    public Educacion() {
    }

    public Educacion(Long id, String nombre_educ, String descripcionEduc, int anioInicioEduc, int anioFinEduc, String nombreOrgEduc, String imgEduc) {
        this.id = id;
        this.nombre_educ = nombre_educ;
        this.descripcionEduc = descripcionEduc;
        this.anioInicioEduc = anioInicioEduc;
        this.anioFinEduc = anioFinEduc;
        this.nombreOrgEduc = nombreOrgEduc;
        this.imgEduc = imgEduc;
    }

    
}
