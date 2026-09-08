package com.sab.dotze.Model;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HomePage {

    private String title;
    private String homeTitle;
    private String description;
    private String trustedby;
    private List<String> brands;

}
