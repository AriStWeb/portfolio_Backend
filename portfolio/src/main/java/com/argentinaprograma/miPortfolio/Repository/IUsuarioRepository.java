
package com.argentinaprograma.miPortfolio.Repository;

import com.argentinaprograma.miPortfolio.Model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario,Long> {
    
    Optional<Usuario> findOneByEmail(final String email);
}
