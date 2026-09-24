package com.sab.dotze.Model.About.dto;

import com.sab.dotze.Model.About.AboutPage;
import com.sab.dotze.Model.About.WhoAreWe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AboutPageResponse {

    private AboutPage aboutPage;
    private List<WhoAreWe> whoAreWe;

}
