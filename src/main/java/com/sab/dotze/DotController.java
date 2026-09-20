package com.sab.dotze;


import com.sab.dotze.Model.Home.Dto.HomePageResponse;
import com.sab.dotze.Model.Home.HomePage;
import com.sab.dotze.Model.Home.WhatWeDo;
import com.sab.dotze.Model.Home.WhoAreWe;
import com.sab.dotze.Model.Home.WhyDotze;
import com.sab.dotze.Service.DotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DotController {

    @Autowired
    private DotService service;

    @GetMapping("/home")
    public HomePageResponse getHomePage(){
        return service.getHome();
    }

    @PatchMapping("/home")
    public HomePage updateHomePage(@RequestBody HomePage homePage){
        return service.updateHomePage(homePage);
    }

    @PutMapping("/what-we-do/{id}")
    public WhatWeDo updateWhatWeDo(@PathVariable int id,@RequestBody WhatWeDo whatWeDo){
        return service.updateWhatWeDo(id,whatWeDo);
    }

    @PutMapping("/who-are-we/{id}")
    public WhoAreWe updateWhoAreWe(
            @PathVariable int id,
            @RequestBody WhoAreWe whoAreWe){
        return service.updateWhoAreWe(whoAreWe,id);
    }

    @PutMapping("/why-dotze/{id}")
    public WhyDotze updateWhyDotze(
            @PathVariable int id,
            @RequestBody WhyDotze whyDotze){
        return service.updateWhyDotze(id,whyDotze);
    }







}
