
package com.argentinaprograma.miPortfolio.Model;

import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Getter @Setter
@Entity
public class Proyecto {
    
     @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombreProyecto;
    private String descripcionProyecto;
    private String urlImgProyecto;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombreProyecto, String descripcionProyecto, String urlImgProyecto) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.urlImgProyecto = urlImgProyecto;
    }  
    
}
