package com.glqdlt.ex.zuuledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@EnableZuulProxy
@SpringBootApplication
public class ZuulEdgeApplication {

    @Bean
    public SimpleZullFilter simpleZullFilter(){
        return new SimpleZullFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZuulEdgeApplication.class, args);
    }
}
