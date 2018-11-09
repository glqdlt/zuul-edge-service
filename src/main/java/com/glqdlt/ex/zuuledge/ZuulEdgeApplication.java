package com.glqdlt.ex.zuuledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

//https://cloud.spring.io/spring-cloud-netflix/multi/multi__router_and_filter_zuul.html 8.10번
@EnableZuulProxy
//@EnableZuulProxy 가 @EnableZuulServer 를 포함한다고 함.
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
