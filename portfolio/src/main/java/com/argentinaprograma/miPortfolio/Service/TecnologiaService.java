
package com.argentinaprograma.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.Model.Tecnologia;
import com.argentinaprograma.miPortfolio.Repository.ITecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService {
    
    @Autowired
    private ITecnologiaRepository tecnoRepository;

    
    @Override
    public List<Tecnologia> getTecnologia() {
          List<Tecnologia> listaTecnologias = tecnoRepository.findAll();
        return listaTecnologias;
    }


    @Override
    public void saveTecnologias(Tecnologia tecn) {
        tecnoRepository.save(tecn);
    }

    @Override
    public void deleteTecnologias(Long id) {
        tecnoRepository.deleteById(id);
    }

    @Override
    public Tecnologia findTecnologias(Long id) {
            Tecnologia tecno= tecnoRepository.findById(id).orElse(null);
        return tecno;   
    }
    
    
}
