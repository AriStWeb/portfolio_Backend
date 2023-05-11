
package com.argentinaprograma.miPortfolio.Controller;

import com.argentinaprograma.miPortfolio.Model.Persona;
import com.argentinaprograma.miPortfolio.Service.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/persona/ver")
    public List <Persona> getPersonas(){
        return interPersona.getPersonas();
    }
    
    @PostMapping ("/persona/agregar")
    public String createPersona(@RequestBody Persona perso){
        interPersona.savePersonas(perso);
        return "persona fue agregada con exito";
    }
    
    @DeleteMapping ("/persona/eliminar/{id}")
    public String deletePersona (@PathVariable Long id){
        interPersona.deletePersonas(id);
        return "La persona fue eliminada con exito";
    }
    
    @PutMapping ("/persona/editar/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestParam ("nombreApellido") String nvoNombreApellido,
                                @RequestParam ("edad") int nvoEdad,
                                @RequestParam ("titulo") String nvoTitulo,
                                @RequestParam ("direccion") String nvoDireccion,
                                @RequestParam ("telefono") String nvoTelefono,
                                @RequestParam ("sobreMi") String nvoSobreMi,
                                @RequestParam ("urlFotoPerfil") String nvoUrlFotoPerfil                                
                                ){
            Persona perso = interPersona.findPersonas(id);
            
            perso.setNombreApellido(nvoNombreApellido);
            perso.setEdad(nvoEdad);
            perso.setTitulo(nvoTitulo);
            perso.setDireccion(nvoDireccion);
            perso.setTelefono(nvoTelefono);
            perso.setSobreMi(nvoSobreMi);
            perso.setUrlFotoPerfil(nvoUrlFotoPerfil);
           
            interPersona.savePersonas(perso);
            
            return perso;
              }
}
