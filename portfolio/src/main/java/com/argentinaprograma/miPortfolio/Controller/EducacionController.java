
package com.argentinaprograma.miPortfolio.Controller;

import com.argentinaprograma.miPortfolio.Model.Educacion;
import com.argentinaprograma.miPortfolio.Service.IEducacionService;
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
public class EducacionController {
    
      @Autowired
    private IEducacionService interEducacion;
    
    @GetMapping ("/educacion/ver")
    public List <Educacion> getEducaciones(){
        return interEducacion.getEducacion();
    }
    
    @PostMapping ("/educacion/agregar")
    public String createEducacion(@RequestBody Educacion educ){
        interEducacion.saveEducaciones(educ);
        return "La educacion fue agregada con exito";
    }
    
    @DeleteMapping ("/educacion/eliminar/{id}")
    public String deleteEducacion (@PathVariable Long id){
    interEducacion.deleteEducaciones(id);
        return "La educacion fue eliminada con exito";
    }
    
    @PutMapping ("/educacion/editar/{id}")
    public Educacion editEducacion (@PathVariable Long id,
                                @RequestParam ("nombre_educ") String nvoNombre_educ,
                                @RequestParam ("descripcionEduc") String nvoDescripcionEduc,
                                @RequestParam ("anioInicioEduc") int nvoAnioInicioEduc,
                                @RequestParam ("anioFinEduc") int nvoAnioFinEduc,
                                @RequestParam ("nombreOrgEduc") String nvoNombreOrgEduc,
                                @RequestParam ("imgEduc") String nvoImgEduc
                                ){
            Educacion educ = interEducacion.findEducaciones(id);
            
            educ.setNombre_educ(nvoNombre_educ);
            educ.setDescripcionEduc(nvoDescripcionEduc);
            educ.setAnioInicioEduc(nvoAnioInicioEduc);
            educ.setAnioFinEduc(nvoAnioFinEduc);
            educ.setNombreOrgEduc(nvoNombreOrgEduc);
            educ.setImgEduc(nvoImgEduc);
            
            interEducacion.saveEducaciones(educ);
            
            return educ;
              }
}

