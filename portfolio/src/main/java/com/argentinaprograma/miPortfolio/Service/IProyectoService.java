
package com.argentinaprograma.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.Model.Proyecto;
import java.util.List;

public interface IProyectoService {
     
    public List<Proyecto> getProyecto();
    
    public void saveProyectos(Proyecto proyect);
    
    public void deleteProyecto(Long id);
     
    public Proyecto findProyecto(Long id);
}
