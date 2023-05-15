
package com.argentinaprograma.miPortfolio.Controller;

import com.argentinaprograma.miPortfolio.Model.ExperienciaLaboral;
import com.argentinaprograma.miPortfolio.Service.IExperienciaLaboralService;
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

@CrossOrigin
@RestController
public class ExperienciaLaboralController {
    
    @Autowired
     private IExperienciaLaboralService interExpLab;
    
    @GetMapping ("/experienciaLaboral/ver")
    public List <ExperienciaLaboral> getExpLab(){
        return interExpLab.getExperienciaLaboral();
    }
    
    
    @PostMapping ("/experienciaLaboral/agregar")
    public String createExpLaboral(@RequestBody ExperienciaLaboral expLab){
        interExpLab.saveExperienciaLaboral(expLab);
        return "La experiencia laboral fue agregada con exito";
    }
    
    @DeleteMapping ("/experienciaLaboral/eliminar/{id}")
    public String deleteExpLaboral (@PathVariable Long id){
    interExpLab.deleteExperienciasLaborales(id);
        return "La experiencia laboral fue eliminada con exito";
    }
    
    @PutMapping ("/experiencia/editar/{id}")
    public ExperienciaLaboral editExpLaboral (@PathVariable Long id,
                                @RequestParam ("nombreExpLab") String nvoNombreExpLabc,
                                @RequestParam ("descripcionExpLab") String nvoDescripcionExpLab,
                                @RequestParam ("anioInicioExpLab") int nvoAnioInicioExpLab,
                                @RequestParam ("anioFinExpLab") int nvoAnioFinExpLab,
                                @RequestParam ("nombreLugarExpLab") String nvoNombreLugarExpLab,
                                @RequestParam ("imgExpLab") String nvoImgExpLab
                                ){
            ExperienciaLaboral expLab = interExpLab.findExperienciaLaboral(id);
            
            expLab.setNombreExpLab(nvoNombreExpLabc);
            expLab.setNombreLugarExpLab(nvoNombreLugarExpLab);
            expLab.setDescripcionExpLab(nvoDescripcionExpLab);
            expLab.setAnioFinExpLab(nvoAnioFinExpLab);
            expLab.setAnioFinExpLab(nvoAnioFinExpLab);
            expLab.setImgExpLab(nvoImgExpLab);
            
            interExpLab.saveExperienciaLaboral(expLab);
                      
            return expLab;
              }
}
