package com.sab.dotze.Model.Home;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HomePage {

    @Id
    private String title;
    private String homeTitle;
    private String description;
    private String trustedBy;
    private List<String> brands;
    @Lob
    private byte[] Photos;

    private String whatWeDo;
    private String whatWeDoDesc;

    private String whyDotze;
    private String brandsGrowth;


}
