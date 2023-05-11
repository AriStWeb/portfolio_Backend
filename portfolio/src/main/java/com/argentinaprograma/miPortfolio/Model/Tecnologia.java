
package com.argentinaprograma.miPortfolio.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologia {
    
      @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombreTecn;
    private int nivel;
    private String urlImgTecn;

    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombreTecn, int nivel, String urlImgTecn) {
        this.id = id;
        this.nombreTecn = nombreTecn;
        this.nivel = nivel;
        this.urlImgTecn = urlImgTecn;
    }
   
    

}
