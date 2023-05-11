
package com.argentinaprograma.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.Model.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
    
    public List<Tecnologia> getTecnologia();
    
    public void saveTecnologias(Tecnologia tecn);
    
    public void deleteTecnologias(Long id);
     
    public Tecnologia findTecnologias(Long id);
}
