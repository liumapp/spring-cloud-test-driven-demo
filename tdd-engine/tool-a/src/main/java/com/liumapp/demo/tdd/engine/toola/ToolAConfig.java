package com.liumapp.demo.tdd.engine.toola;

import com.liumapp.demo.tdd.engine.toola.entity.ResEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
/**
 * @author liumapp
 * @file ToolAConfig.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/22/18
 */
@Configuration
public class ToolAConfig {

    @Bean
    public ResEntity resEntity() {
        return new ResEntity();
    }

}
