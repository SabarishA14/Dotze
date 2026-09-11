package com.sab.dotze.Model.Home;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private String trustedby;
    private List<String> brands;

}
