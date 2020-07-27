package com.rk;

import com.rk.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication

@EnableJpaRepositories("com.rk.user")
@EntityScan("com.rk.user")
public class DemoApp {

    @Autowired
    DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class,args);
    }
}
