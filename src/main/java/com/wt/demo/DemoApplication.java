package com.wt.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class DemoApplication {


    public static void main(String[] args) {
        log.info("欢迎来到伍涛的springbootdemo项目");
        SpringApplication.run(DemoApplication.class, args);
    }

}
