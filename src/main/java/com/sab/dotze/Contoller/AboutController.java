package com.sab.dotze.Contoller;


import com.sab.dotze.Model.About.AboutPage;
import com.sab.dotze.Model.About.WhoAreWe;
import com.sab.dotze.Model.About.dto.AboutPageResponse;
import com.sab.dotze.Service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AboutController {

    @Autowired
    private AboutService service;

    @GetMapping("/about")
    public AboutPageResponse getAbout(){
        return service.getAbout();
    }

    @PutMapping("/about/{id}")
    public AboutPage updateAbout(
            @PathVariable int id,
            @RequestBody AboutPage aboutPage){
        return service.updateAbout(id,aboutPage);
    }

    @PostMapping("/about")
    public AboutPage createAbout(@RequestBody AboutPage aboutPage){
        return service.createAbout(aboutPage);
    }

    @PostMapping("/who-are-we")
    public WhoAreWe createWhoAreWe(@RequestBody WhoAreWe whoAreWe){
        return service.createWhoAreWe(whoAreWe);
    }

    @PatchMapping("/who-are-we/{id}")
    public WhoAreWe updateWhoAreWe(
            @PathVariable int id,
            @RequestBody WhoAreWe whoAreWe){
        return service.updateWhoAreWe(whoAreWe,id);
    }

}
