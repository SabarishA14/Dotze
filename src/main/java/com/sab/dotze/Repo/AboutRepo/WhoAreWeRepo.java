package com.sab.dotze.Repo.AboutRepo;

import com.sab.dotze.Model.About.WhoAreWe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WhoAreWeRepo extends JpaRepository<WhoAreWe,Integer> {
}
