package com.situ.project03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.situ.project03.mapper")
public class Project03Application {

    public static void main(String[] args) {
        SpringApplication.run(Project03Application.class, args);
    }

}
