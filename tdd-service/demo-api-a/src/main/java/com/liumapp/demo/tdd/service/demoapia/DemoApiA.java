package com.liumapp.demo.tdd.service.demoapia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author liumapp
 * @file DemoApiA.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/21/18
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.liumapp.demo.tdd")
@Import({com.liumapp.demo.tdd.engine.model.ModelConfig.class})
public class DemoApiA extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DemoApiA.class , args);
    }

}
