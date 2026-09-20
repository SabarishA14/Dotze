package com.sab.dotze.Service;

import com.sab.dotze.Model.Home.Dto.HomePageResponse;
import com.sab.dotze.Model.Home.HomePage;
import com.sab.dotze.Model.Home.WhatWeDo;
import com.sab.dotze.Model.Home.WhoAreWe;
import com.sab.dotze.Model.Home.WhyDotze;
import com.sab.dotze.Repo.HomeRepo.HomePageRepo;
import com.sab.dotze.Repo.HomeRepo.WhatWeDoRepo;
import com.sab.dotze.Repo.HomeRepo.WhoAreWeRepo;
import com.sab.dotze.Repo.HomeRepo.WhyDotzeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DotService {

    @Autowired
    private HomePageRepo homePageRepo;

    @Autowired
    private WhatWeDoRepo whatWeDoRepo;

    @Autowired
    private WhoAreWeRepo whoAreWeRepo;

    @Autowired
    private WhyDotzeRepo whyDotzeRepo;


    public HomePageResponse getHome() {
        HomePage homePage = homePageRepo.findAll().get(0);
        WhatWeDo whatWeDo = whatWeDoRepo.findAll().get(0);
        WhoAreWe whoAreWe = whoAreWeRepo.findAll().get(0);
        WhyDotze whyDotze = whyDotzeRepo.findAll().get(0);

        return new HomePageResponse(homePage,whatWeDo,whoAreWe,whyDotze);
    }

    public HomePage updateHomePage(HomePage homePage) {
        HomePage existingData = homePageRepo.findById(homePage.getTitle())
                .orElseThrow(() -> new RuntimeException("Home page data not found"));

        if (homePage.getHomeTitle() != null) {
            existingData.setHomeTitle(homePage.getHomeTitle());
        }

        if (homePage.getDescription() != null) {
            existingData.setDescription(homePage.getDescription());
        }

        if (homePage.getTrustedBy() != null) {
            existingData.setTrustedBy(homePage.getTrustedBy());
        }

        if (homePage.getBrands() != null) {
            existingData.setBrands(homePage.getBrands());
        }

        if (homePage.getWhatWeDo() != null) {
            existingData.setWhatWeDo(homePage.getWhatWeDo());
        }

        if (homePage.getWhatWeDoDesc() != null) {
            existingData.setWhatWeDoDesc(homePage.getWhatWeDoDesc());
        }

        if (homePage.getWhoAreWe() != null) {
            existingData.setWhoAreWe(homePage.getWhoAreWe());
        }

        if (homePage.getWhoAreWeDesc() != null) {
            existingData.setWhoAreWeDesc(homePage.getWhoAreWeDesc());
        }

        if (homePage.getWhyDotze() != null) {
            existingData.setWhyDotze(homePage.getWhyDotze());
        }

        if (homePage.getBrandsGrowth() != null) {
            existingData.setBrandsGrowth(homePage.getBrandsGrowth());
        }

        return homePageRepo.save(existingData);
    }

    public WhatWeDo updateWhatWeDo(int id,WhatWeDo whatWeDo){
        WhatWeDo existingData = whatWeDoRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Data not found"));

        if (whatWeDo.getHeading() != null) {
            existingData.setHeading(whatWeDo.getHeading());
        }

        if (whatWeDo.getDescription() != null) {
            existingData.setDescription(whatWeDo.getDescription());
        }

        return whatWeDoRepo.save(existingData);

    }


    public WhoAreWe updateWhoAreWe(WhoAreWe whoAreWe,int id) {
        WhoAreWe existingData = whoAreWeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Data not found"));

        if (whoAreWe.getHeading() != null) {
            existingData.setHeading(whoAreWe.getHeading());
        }

        if (whoAreWe.getDescription() != null) {
            existingData.setDescription(whoAreWe.getDescription());
        }

        return whoAreWeRepo.save(existingData);

    }

    public WhyDotze updateWhyDotze(int id, WhyDotze whyDotze) {
        WhyDotze existingData = whyDotzeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Data not found"));

        if (whyDotze.getHeading() != null) {
            existingData.setHeading(whyDotze.getHeading());
        }

        if (whyDotze.getDescription() != null) {
            existingData.setDescription(whyDotze.getDescription());
        }

        return whyDotzeRepo.save(existingData);
    }
}
