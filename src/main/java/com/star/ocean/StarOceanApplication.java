package com.star.ocean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class StarOceanApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarOceanApplication.class, args);
    }

}
