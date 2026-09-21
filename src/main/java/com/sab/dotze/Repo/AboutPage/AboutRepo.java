package com.sab.dotze.Repo.AboutPage;


import com.sab.dotze.Model.About.AboutPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepo extends JpaRepository<AboutPage,Integer> {

}
