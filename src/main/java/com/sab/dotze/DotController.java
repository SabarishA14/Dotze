package com.sab.dotze;


import com.sab.dotze.Service.DotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DotController {

    @Autowired
    private DotService service;

    @GetMapping("/home")
    public static




}
