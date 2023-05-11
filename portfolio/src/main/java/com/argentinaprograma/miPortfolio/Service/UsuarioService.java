
package com.argentinaprograma.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.Model.Usuario;
import com.argentinaprograma.miPortfolio.Repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private IUsuarioRepository userRepository;
    
    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> listaUsuarios = userRepository.findAll();
        return listaUsuarios;
    }

    @Override
    public void saveUsuario(Usuario user) {
            userRepository.save(user);
    }

    @Override
    public void deleteUsuario(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
               Usuario user= userRepository.findById(id).orElse(null);
        return  user;   
    }
    
    
}
