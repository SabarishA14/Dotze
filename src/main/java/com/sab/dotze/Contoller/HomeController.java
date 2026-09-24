package com.sab.dotze.Contoller;


import com.sab.dotze.Model.Home.Dto.HomePageResponse;
import com.sab.dotze.Model.Home.HomePage;
import com.sab.dotze.Model.Home.WhatWeDo;
import com.sab.dotze.Model.About.WhoAreWe;
import com.sab.dotze.Model.Home.WhyDotze;
import com.sab.dotze.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private HomeService service;

    @GetMapping("/home")
    public HomePageResponse getHomePage(){
        return service.getHome();
    }

    @PatchMapping("/home")
    public HomePage updateHomePage(@RequestBody HomePage homePage){
        return service.updateHomePage(homePage);
    }

    @PatchMapping("/what-we-do/{id}")
    public WhatWeDo updateWhatWeDo(@PathVariable int id,@RequestBody WhatWeDo whatWeDo){
        return service.updateWhatWeDo(id,whatWeDo);
    }



    @PatchMapping("/why-dotze/{id}")
    public WhyDotze updateWhyDotze(
            @PathVariable int id,
            @RequestBody WhyDotze whyDotze){
        return service.updateWhyDotze(id,whyDotze);
    }

    @PostMapping("/what-we-do")
    public WhatWeDo createWhatWeDo(@RequestBody WhatWeDo whatWeDo){
        return service.createWhatWeDo(whatWeDo);
    }


    @PostMapping("why-dotze")
    public WhyDotze createWhyDotze(@RequestBody WhyDotze whyDotze){
        return service.createWhyDotze(whyDotze);
    }








}
