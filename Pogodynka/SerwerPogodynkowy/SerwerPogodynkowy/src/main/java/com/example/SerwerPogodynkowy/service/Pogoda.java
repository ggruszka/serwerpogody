package com.example.SerwerPogodynkowy.service;

import com.fasterxml.jackson.annotation.JsonTypeId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pogoda")

public class Pogoda {
    @Id
    @GeneratedValue
    private Long id;
    String region;
    String aura;

    protected Pogoda(){};

    public Pogoda(String region, String aura) {
        this.region = region;
        this.aura = aura;
    }


/*
    public String getStanPogody() {

        return " Dla regionu: " + region + " jest taka pogoda: " +aura;
    }
*/
//    public String getOcenaPogody() {
//
//        if (aura == "swietna") return "Super";
//        if (aura == "ladna" ) return "Srednio";
//        if (aura == "brzydka" ) return "Tak sobie";
//        if (aura == "okropna" ) return "zle";
//        return "nie udalo się przypisać aury na podstawie podanego id";
//    }

    public String getRegion() {
        return region;
    }

    public String getAura() {
        return aura;
    }
}
