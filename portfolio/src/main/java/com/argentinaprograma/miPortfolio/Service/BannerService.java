
package com.argentinaprograma.miPortfolio.Service;

import com.argentinaprograma.miPortfolio.Model.Banner;
import com.argentinaprograma.miPortfolio.Repository.IBannerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerService implements IBannerService{
    
     @Autowired
    private IBannerRepository bannerRepository;

    @Override
    public List<Banner> getBanner() {
          List<Banner> listaBanner = bannerRepository.findAll();
        return listaBanner;
    }

    @Override
    public void saveBanner(Banner banner) {
        bannerRepository.save(banner);
    }

    @Override
    public void deleteBanner(Long id) {
        bannerRepository.deleteById(id);
    }

    @Override
    public Banner findBanner(Long id) {
        Banner banner= bannerRepository.findById(id).orElse(null);
        return banner;   
    }
}
