
package com.argentinaprograma.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.Model.ExperienciaLaboral;
import com.argentinaprograma.miPortfolio.Repository.IExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService{
    
    @Autowired
    private IExperienciaLaboralRepository expLabRepository;

    @Override
    public List<ExperienciaLaboral> getExperienciaLaboral() {
        List<ExperienciaLaboral> listaExperienciasLaborales = expLabRepository.findAll();
        return listaExperienciasLaborales;
    }

    @Override
    public void saveExperienciaLaboral(ExperienciaLaboral expLab) {
        expLabRepository.save(expLab);
    }

    @Override
    public void deleteExperienciasLaborales(Long id) {
        expLabRepository.deleteById(id);
    }

    @Override
    public ExperienciaLaboral findExperienciaLaboral(Long id) {
         ExperienciaLaboral expLab= expLabRepository.findById(id).orElse(null);
        return expLab;   
    }
    
}
