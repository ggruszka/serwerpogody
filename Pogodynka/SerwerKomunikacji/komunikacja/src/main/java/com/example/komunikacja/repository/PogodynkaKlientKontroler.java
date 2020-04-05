package com.example.komunikacja.repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PogodynkaKlientKontroler {

    private final PogodynkaKlientSerwis pogodynkaKlientSerwis;

    public PogodynkaKlientKontroler(PogodynkaKlientSerwis pogodynkaKlientSerwis) {
        this.pogodynkaKlientSerwis = pogodynkaKlientSerwis;
    }

    @GetMapping(path = "prognoza")
    public String pobierzPrognoze (
            @RequestParam(value = "region", required = false) Integer regionID,
            @RequestParam(value = "aura", required = false) Integer auraID
    ){
        return pogodynkaKlientSerwis.sprawdzPogode(regionID, auraID);
    }

}
