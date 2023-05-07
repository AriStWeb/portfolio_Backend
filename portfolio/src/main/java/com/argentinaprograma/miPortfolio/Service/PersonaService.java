
package com.argentinaprograma.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.Model.Persona;
import com.argentinaprograma.miPortfolio.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private IPersonaRepository persoRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersonas(Persona perso) {
        persoRepository.save(perso);
    }

    @Override
    public void deletePersonas(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersonas(Long id) {
        Persona perso= persoRepository.findById(id).orElse(null);
        return perso;
    }
    
    
}
