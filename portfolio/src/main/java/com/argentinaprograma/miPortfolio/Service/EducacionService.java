
package com.argentinaprograma.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.Model.Educacion;
import com.argentinaprograma.miPortfolio.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    private IEducacionRepository educRepository;

    @Override
    public List<Educacion> getEducacion() {
          List<Educacion> listaEducaciones = educRepository.findAll();
        return listaEducaciones;
    }

    @Override
    public void saveEducaciones(Educacion educ) {
        educRepository.save(educ);
    }

    @Override
    public void deleteEducaciones(Long id) {
        educRepository.deleteById(id);
    }

    @Override
    public Educacion findEducaciones(Long id) {
        Educacion educa= educRepository.findById(id).orElse(null);
        return educa;   
    }
    
}
