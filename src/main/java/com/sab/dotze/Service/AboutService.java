package com.sab.dotze.Service;


import com.sab.dotze.Model.About.AboutPage;
import com.sab.dotze.Model.About.WhoAreWe;
import com.sab.dotze.Model.About.dto.AboutPageResponse;
import com.sab.dotze.Repo.AboutRepo.AboutRepo;
import com.sab.dotze.Repo.AboutRepo.WhoAreWeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService {

    @Autowired
    private AboutRepo aboutRepo;

    @Autowired
    private WhoAreWeRepo whoAreWeRepo;

    public AboutPageResponse getAbout() {
        AboutPage aboutPage = aboutRepo.findAll().get(0);
        List<WhoAreWe> whoAreWe = whoAreWeRepo.findAll();
        return new AboutPageResponse(aboutPage,whoAreWe);
    }


    public AboutPage updateAbout(int id, AboutPage aboutPage) {
        AboutPage existingData = aboutRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Data not found"));

        if (aboutPage.getHeading() != null) {
            existingData.setHeading(aboutPage.getHeading());
        }

        if (aboutPage.getDescription() != null) {
            existingData.setDescription(aboutPage.getDescription());
        }

        return aboutRepo.save(existingData);
    }


    public AboutPage createAbout(AboutPage aboutPage) {
        return aboutRepo.save(aboutPage);
    }


    public WhoAreWe createWhoAreWe(WhoAreWe whoAreWe) {
        return whoAreWeRepo.save(whoAreWe);
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
}
