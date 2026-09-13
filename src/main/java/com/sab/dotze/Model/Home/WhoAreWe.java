package com.sab.dotze.Model.Home;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WhoAreWe {

    @Id
    private int id;
    private String heading;
    private String description;
}
