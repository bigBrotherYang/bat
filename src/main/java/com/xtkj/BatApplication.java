package com.xtkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xtkj.dao")
public class BatApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatApplication.class, args);
    }

}
