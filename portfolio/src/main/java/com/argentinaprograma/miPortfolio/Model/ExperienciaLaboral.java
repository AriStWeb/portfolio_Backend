
package com.argentinaprograma.miPortfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExperienciaLaboral {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombreExpLab;
    private String descripcionExpLab;
    private int anioInicioExpLab;
    private int anioFinExpLab;
    private String nombreLugarExpLab;
    private String imgExpLab;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long id, String nombreExpLab, String descripcionExpLab, int anioInicioExpLab, int anioFinExpLab, String nombreLugarExpLab, String imgExpLab) {
        this.id = id;
        this.nombreExpLab = nombreExpLab;
        this.descripcionExpLab = descripcionExpLab;
        this.anioInicioExpLab = anioInicioExpLab;
        this.anioFinExpLab = anioFinExpLab;
        this.nombreLugarExpLab = nombreLugarExpLab;
        this.imgExpLab = imgExpLab;
    }
    
    
}
