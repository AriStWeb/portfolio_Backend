
package com.argentinaprograma.miPortfolio.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Banner {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String tituloBanner;
    private String fraseBanner;
    private String urlImgBanner;

    public Banner() {
    }

    public Banner(Long id, String tituloBanner, String fraseBanner, String urlImgBanner) {
        this.id = id;
        this.tituloBanner = tituloBanner;
        this.fraseBanner = fraseBanner;
        this.urlImgBanner = urlImgBanner;
    }

   
}