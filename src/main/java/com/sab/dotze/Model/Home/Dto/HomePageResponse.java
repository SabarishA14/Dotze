package com.sab.dotze.Model.Home.Dto;

import com.sab.dotze.Model.Home.HomePage;
import com.sab.dotze.Model.Home.WhatWeDo;
import com.sab.dotze.Model.Home.WhoAreWe;
import com.sab.dotze.Model.Home.WhyDotze;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class HomePageResponse {

    private HomePage homePage;
    private WhatWeDo whatWeDo;
    private WhoAreWe whoAreWe;
    private WhyDotze whyDotze;

}
