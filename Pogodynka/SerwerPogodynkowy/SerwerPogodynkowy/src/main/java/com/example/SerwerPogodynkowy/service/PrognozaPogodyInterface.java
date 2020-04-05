package com.example.SerwerPogodynkowy.service;

import java.util.Collection;

public interface PrognozaPogodyInterface {
     Pogoda getPrognozaPogody(Integer regionID,Integer auraID);
     Pogoda getPrognozaPogody(Integer regionID);
     Pogoda getPrognozaPogody();

     Collection<Pogoda> findAll();
}
