
package com.argentinaprograma.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.Model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
     public List<Usuario> getUsuario();
    
    public void saveUsuario (Usuario user);
    
    public void deleteUsuario(Long id);
     
    public Usuario findUsuario(Long id);
    
}
