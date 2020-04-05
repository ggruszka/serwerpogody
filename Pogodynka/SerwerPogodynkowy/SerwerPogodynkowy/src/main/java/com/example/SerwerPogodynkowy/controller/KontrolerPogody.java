package com.example.SerwerPogodynkowy.controller;

import com.example.SerwerPogodynkowy.service.Pogoda;
import com.example.SerwerPogodynkowy.service.PrognozaPogody;
import com.example.SerwerPogodynkowy.service.PrognozaPogodyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KontrolerPogody {

    private PrognozaPogodyInterface PrognozaPogodyInterface;

    @Autowired
    public KontrolerPogody(PrognozaPogodyInterface PrognozaPogodyInterface) {
        this.PrognozaPogodyInterface = PrognozaPogodyInterface;
    }


    @GetMapping(path ="ProgonozaPogody")
    public Pogoda prognozaPogody (
            @RequestParam(value = "region", required = false) Integer regionID,
            @RequestParam(value = "aura", required = false) Integer auraID
    ){
        if(regionID != null && auraID != null) {
            return PrognozaPogodyInterface.getPrognozaPogody(regionID, auraID);
        }
        else if (regionID != null) {
            return PrognozaPogodyInterface.getPrognozaPogody(regionID);
        }
        else  return PrognozaPogodyInterface.getPrognozaPogody();
    }
}
