package com.example.SerwerPogodynkowy.service;

public interface PrognozaPogodyInterface {
     Pogoda getPrognozaPogody(Integer regionID,Integer auraID);
     Pogoda getPrognozaPogody(Integer regionID);
     Pogoda getPrognozaPogody();
}
