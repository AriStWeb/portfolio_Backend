
package com.argentinaprograma.miPortfolio.Controller;

import com.argentinaprograma.miPortfolio.Model.Tecnologia;
import com.argentinaprograma.miPortfolio.Service.ITecnologiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TecnologiaController {
        
    @Autowired
    private ITecnologiaService interTecnologia;
    
    @GetMapping ("/tecnologia/ver")
    public List <Tecnologia> getTcnologia(){
        return interTecnologia.getTecnologia();
    }
    
    @PostMapping ("/tecnologia/agregar")
    public String createTecnologia(@RequestBody Tecnologia tecno){
        interTecnologia.saveTecnologias(tecno);
        return "La tecnologia fue agregada con exito";
    }
    
    @DeleteMapping ("/tecnologia/eliminar/{id}")
    public String deleteTecnologia (@PathVariable Long id){
        interTecnologia.deleteTecnologias(id);
        return "La tcnologia fue eliminada con exito";
    }
    
    @PutMapping ("/tecnologia/editar/{id}")
    public Tecnologia editTecnologia (@PathVariable Long id,
                                @RequestParam ("nombreTecn") String nvoNombreTecn,
                                @RequestParam ("nivel") int nvoNivel,
                                @RequestParam ("urlImgTecn") String nvoUrlImgTecn                               
                                ){
            Tecnologia tecno = interTecnologia.findTecnologias(id);
            
          tecno.setNombreTecn(nvoNombreTecn);
          tecno.setNivel(nvoNivel);
          tecno.getUrlImgTecn();
          
          interTecnologia.saveTecnologias(tecno);
            
            return tecno;
              }
}
