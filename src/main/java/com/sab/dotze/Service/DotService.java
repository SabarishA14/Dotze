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
        return homePageRepo.save(homePage);
    }

    public void updateWhatWeDo(WhatWeDo whatWeDo){
        whatWeDoRepo.save(whatWeDo);
    }
}
