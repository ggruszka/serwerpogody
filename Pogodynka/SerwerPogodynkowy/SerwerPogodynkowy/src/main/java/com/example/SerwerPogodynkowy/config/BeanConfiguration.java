package com.example.SerwerPogodynkowy.config;

import com.example.SerwerPogodynkowy.service.PrognozaPogody;
import com.example.SerwerPogodynkowy.service.PrognozaPogodyInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@PropertySource(value = "/application.properties" , encoding = "UTF-8")
public class BeanConfiguration {

    @Value("${myprop.aura}")
    private String[] aura;
    @Value("${myprop.region}")
    private String[] region;


    @Bean
    public PrognozaPogodyInterface prognozaPogodyInterface(){
        return new PrognozaPogody(region, aura);
    }
}
