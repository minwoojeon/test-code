package com.marvrus.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan
@MapperScan("com.marvrus.project.mapper")
@PropertySource(value = {"classpath:/application-${spring.profiles.active}.properties"})
public class MarvrusCodeTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarvrusCodeTestApplication.class, args);
    }

}
