package com.example.komunikacja.repository;

import org.springframework.stereotype.Service;

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
}
