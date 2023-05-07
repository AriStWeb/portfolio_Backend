
package com.argentinaprograma.miPortfolio.Repository;

import com.argentinaprograma.miPortfolio.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository <Educacion, Long>{
    
}
