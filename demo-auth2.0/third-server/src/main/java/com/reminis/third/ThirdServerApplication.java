package com.reminis.third;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author sql
 * @version 1.0.0
 * @date 2021/8/24 10:39
 */
@SpringBootApplication
public class ThirdServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdServerApplication.class, args);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
