
package com.argentinaprograma.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.Model.ExperienciaLaboral;
import java.util.List;

public interface IExperienciaLaboralService {
    
    public List<ExperienciaLaboral> getExperienciaLaboral();
    
    public void saveExperienciaLaboral (ExperienciaLaboral expLab);
    
    public void deleteExperienciasLaborales(Long id);
     
    public ExperienciaLaboral findExperienciaLaboral(Long id);
}
