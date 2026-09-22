package com.sab.dotze.Service;


import com.sab.dotze.Model.About.AboutPage;
import com.sab.dotze.Model.Home.WhatWeDo;
import com.sab.dotze.Repo.AboutPage.AboutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService {

    @Autowired
    private AboutRepo aboutRepo;


    public List<AboutPage> getAbout() {
        return aboutRepo.findAll();
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

}
