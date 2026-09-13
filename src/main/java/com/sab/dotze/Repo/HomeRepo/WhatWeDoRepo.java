package com.sab.dotze.Repo.HomeRepo;

import com.sab.dotze.Model.Home.WhatWeDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WhatWeDoRepo extends JpaRepository<WhatWeDo ,Integer> {
}
