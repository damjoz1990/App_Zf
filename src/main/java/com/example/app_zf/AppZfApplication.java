package com.example.app_zf;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class AppZfApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppZfApplication.class, args);
    }

}
