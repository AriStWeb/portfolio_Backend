
package com.argentinaprograma.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.Model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> getEducacion();
    
    public void saveEducaciones(Educacion educ);
    
    public void deleteEducaciones(Long id);
     
    public Educacion findEducaciones(Long id);
}
