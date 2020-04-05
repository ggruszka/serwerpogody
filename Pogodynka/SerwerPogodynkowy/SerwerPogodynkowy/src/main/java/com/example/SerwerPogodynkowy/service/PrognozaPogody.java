package com.example.SerwerPogodynkowy.service;

import java.util.concurrent.ThreadLocalRandom;

public class PrognozaPogody implements PrognozaPogodyInterface {

    String[] region;
    String[] aura;

    public PrognozaPogody(String[] region, String[] aura) {
        this.region = region;
        this.aura = aura;
    }

    @Override
    public Pogoda getPrognozaPogody(Integer regionID, Integer auraID) {
        return new Pogoda(region[regionID], aura[auraID]);
    }

    @Override
    public Pogoda getPrognozaPogody(Integer regionID) {
        return new Pogoda(region[regionID], aura[ ThreadLocalRandom.current().nextInt(0, aura.length)] );
    }

    @Override
    public Pogoda getPrognozaPogody() {
        return new Pogoda(region[ ThreadLocalRandom.current().nextInt(0, region.length)],
                aura[ ThreadLocalRandom.current().nextInt(0, aura.length)]);
    }
}
