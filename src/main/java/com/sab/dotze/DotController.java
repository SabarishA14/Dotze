package com.sab.dotze;


import com.sab.dotze.Model.Home.Dto.HomePageResponse;
import com.sab.dotze.Model.Home.HomePage;
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
        return service.updateHomePage(homePage);;
    }

    @PutMapping("/what-we-do/{id}"){

    }




}
