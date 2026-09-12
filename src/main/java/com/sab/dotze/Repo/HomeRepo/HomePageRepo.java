package com.sab.dotze.Repo.HomeRepo;


import com.sab.dotze.Model.Home.HomePage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HomePageRepo extends JpaRepository<HomePage,String> {
}
