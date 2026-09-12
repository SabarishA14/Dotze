package com.sab.dotze.Repo.HomeRepo;


import com.sab.dotze.Model.Home.WhyDotze;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WhyDotzeRepo extends JpaRepository<WhyDotze,String> {

}
