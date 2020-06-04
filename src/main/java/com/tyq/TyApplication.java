package com.tyq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.tyq.Mapper")
public class TyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TyApplication.class, args);
    }

}
