
package com.argentinaprograma.miPortfolio.Controller;

import com.argentinaprograma.miPortfolio.Model.Proyecto;
import com.argentinaprograma.miPortfolio.Service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService interProyecto;
    
    @GetMapping ("/proyecto/ver")
    public List<Proyecto> getProyecto(){
     return interProyecto.getProyecto();
    }
    
    @PostMapping("/proyecto/agregar")
    public String createProyecto(@RequestBody Proyecto proyect){
        interProyecto.saveProyectos(proyect);
        return "El proyecto fue agregada con exito";
    }
    
    @DeleteMapping ("/proyecto/eliminar/{id}")
    public String deleteProyetco (@PathVariable Long id){
        interProyecto.deleteProyecto(id);
        return "El proyecto fue eliminada con exito";
    }
    
    @PutMapping ("/proyecto/editar/{id}")
    public Proyecto editProyecto (@PathVariable Long id,
                                @RequestParam ("nombreProyecto") String nvoNombreProyecto,
                                @RequestParam ("descripcionProyecto") int nvoDescripcionProyecto,
                                @RequestParam ("urlImgProyecto") String nvoUrlImgProyecto                               
                                ){
            Proyecto proy = interProyecto.findProyecto(id);
            
            proy.setNombreProyecto(nvoNombreProyecto);
            proy.setDescripcionProyecto(nvoUrlImgProyecto);
            proy.setUrlImgProyecto(nvoUrlImgProyecto);
            
            interProyecto.saveProyectos(proy);
          
            return proy;
              }
}

    