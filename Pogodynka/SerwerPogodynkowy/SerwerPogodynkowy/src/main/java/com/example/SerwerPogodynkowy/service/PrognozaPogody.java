package com.example.SerwerPogodynkowy.service;

import com.example.SerwerPogodynkowy.repozytorium.PogodaRepozytorium;

import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

public class PrognozaPogody implements PrognozaPogodyInterface {

    String[] region;
    String[] aura;
    private PogodaRepozytorium pogodaRepozytorium;

    public PrognozaPogody(String[] region, String[] aura, PogodaRepozytorium pogodaRepozytorium) {
        this.region = region;
        this.aura = aura;
        this.pogodaRepozytorium = pogodaRepozytorium;
    }

    @Override
    public Pogoda getPrognozaPogody(Integer regionID, Integer auraID) {
        Pogoda pogoda = new Pogoda(region[regionID], aura[auraID]);
        pogodaRepozytorium.save(pogoda);
        return pogoda;
    }

    @Override
    public Pogoda getPrognozaPogody(Integer regionID) {
        Pogoda pogoda = new Pogoda(region[regionID], aura[ ThreadLocalRandom.current().nextInt(0, aura.length)] );
        pogodaRepozytorium.save(pogoda);
        return pogoda;
    }

    @Override
    public Pogoda getPrognozaPogody() {
        Pogoda pogoda = new Pogoda(region[ ThreadLocalRandom.current().nextInt(0, region.length)],
                aura[ ThreadLocalRandom.current().nextInt(0, aura.length)]);
        pogodaRepozytorium.save(pogoda);
        return pogoda;
    }

    @Override
    public Collection<Pogoda> findAll() {
        return pogodaRepozytorium.findAll();
    }
}
