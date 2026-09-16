package com.sab.dotze.Repo.HomeRepo;

import com.sab.dotze.Model.Home.WhoAreWe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WhoAreWeRepo extends JpaRepository<WhoAreWe,Integer> {
}
