package com.sab.dotze.Model.Home;

import jakarta.persistence.Id;

import java.util.List;

public class WhyDotze {


    @Id
    private String whyDotze;
    private String brandsGrowth;
    private List<String> points;

}
