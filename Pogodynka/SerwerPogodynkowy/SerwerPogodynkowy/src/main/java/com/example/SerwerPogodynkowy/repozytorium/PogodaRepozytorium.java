package com.example.SerwerPogodynkowy.repozytorium;
import java.util.Collection;

import com.example.SerwerPogodynkowy.service.Pogoda;
import com.example.SerwerPogodynkowy.service.PrognozaPogody;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PogodaRepozytorium extends CrudRepository<Pogoda, Long> {
    Collection<Pogoda> findAll();
}

