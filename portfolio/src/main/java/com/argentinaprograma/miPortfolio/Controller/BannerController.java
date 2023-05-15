package com.argentinaprograma.miPortfolio.Controller;

import com.argentinaprograma.miPortfolio.Model.Banner;
import com.argentinaprograma.miPortfolio.Service.IBannerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
public class BannerController {
    
      @Autowired
    private IBannerService interBanner;
    
    @GetMapping ("banner/ver")
    public List <Banner> getBanner(){
        return interBanner.getBanner();
    }
    
    @PostMapping ("/banner/agregar")
    public String createBanner(@RequestBody Banner banner){
        interBanner.saveBanner(banner);
        return "La frase Banner fue agregada con exito";
    }
    
    @DeleteMapping ("/banner/eliminar/{id}")
    public String deleteBanner (@PathVariable Long id){
    interBanner.deleteBanner(id);
        return "La frase Banner fue eliminada con exito";
    }
    
    @PutMapping ("/banner/editar/{id}")
    public Banner editEducacion (@PathVariable Long id,
                                @RequestParam ("tituloBanner") String nvoTituloBanner,
                                @RequestParam ("fraseBanner") String nvoFraseBanner,
                                @RequestParam ("urlImgBanner") String nvoUrlImgBanner
                                ){
            Banner banner = interBanner.findBanner(id);
            
           banner.setTituloBanner(nvoTituloBanner);
           banner.setFraseBanner(nvoFraseBanner);
           banner.setUrlImgBanner(nvoUrlImgBanner);
           
           interBanner.saveBanner(banner);
            
            return banner;
              }
}
