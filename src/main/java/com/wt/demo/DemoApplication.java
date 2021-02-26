package com.wt.demo;


import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class DemoApplication {


    public static void main(String[] args) {
        log.info("123");
        log.warn("123");
        log.error("123");
        SpringApplication.run(DemoApplication.class, args);
    }

}
