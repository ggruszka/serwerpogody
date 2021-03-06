package com.example.komunikacja.repository;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collection;
import java.util.Map;
@Component
public class PogodynkaKlientBrama {

    private final RestTemplate restTemplate;

    public PogodynkaKlientBrama(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Pogoda getForcast(Integer regionID, Integer auraID) {

        URI uri = UriComponentsBuilder.fromUriString("http://localhost:9090/ProgonozaPogody")
                .queryParam("aura", auraID).queryParam("region", regionID)
                .build().toUri();

        return restTemplate.getForObject(uri,Pogoda.class);
    }
    public Collection<Pogoda> getAll() {
        return restTemplate.exchange("http://localhost:9090/wszystkie", HttpMethod.GET,
                null, new ParameterizedTypeReference<Collection<Pogoda>>() {
                }).getBody();
    }
}
