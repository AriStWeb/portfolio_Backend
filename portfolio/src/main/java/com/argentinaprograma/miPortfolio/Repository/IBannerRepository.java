
package com.argentinaprograma.miPortfolio.Repository;

import com.argentinaprograma.miPortfolio.Model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBannerRepository extends JpaRepository <Banner, Long> {
    
}
