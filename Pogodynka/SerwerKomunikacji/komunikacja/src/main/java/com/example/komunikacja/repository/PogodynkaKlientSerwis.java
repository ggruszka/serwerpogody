package com.example.komunikacja.repository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class PogodynkaKlientSerwis {
    private final PogodynkaKlientBrama pogodynkaKlientBrama;

    public PogodynkaKlientSerwis(PogodynkaKlientBrama pogodynkaKlientBrama) {
        this.pogodynkaKlientBrama = pogodynkaKlientBrama;
    }

    public String sprawdzPogode(Integer regionID, Integer auraID) {
        Pogoda forcast = pogodynkaKlientBrama.getForcast(regionID, auraID);
        return forcast.getStanPogody() + forcast.getOcenaPogody();
    }

    public Collection<String> findAll() {
        Collection<String> pogodyString = new ArrayList<>();
        Collection<Pogoda> all = pogodynkaKlientBrama.getAll();
        for (Pogoda pogoda:all
             ) { pogodyString.add( pogoda.getStanPogody());

        }
        return pogodyString;
    }
}
