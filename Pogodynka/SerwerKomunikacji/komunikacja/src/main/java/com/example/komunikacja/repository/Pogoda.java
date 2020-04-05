package com.example.komunikacja.repository;

public class Pogoda {
    String region;
    String aura;

//    public Pogoda(String region, String aura) {
//        this.region = region;
//        this.aura = aura;
//    }



    public String getStanPogody() {

        return " Dla regionu: " + region + " jest taka pogoda: " +aura;
    }

    public String getOcenaPogody() {

        if (aura == "swietna") return "Super";
        if (aura == "ladna" ) return "Srednio";
        if (aura == "brzydka" ) return "Tak sobie";
        if (aura == "okropna" ) return "zle";
        return "nie udalo się przypisać aury na podstawie podanego id";
    }

    public String getRegion() {
        return region;
    }

    public String getAura() {
        return aura;
    }
}
