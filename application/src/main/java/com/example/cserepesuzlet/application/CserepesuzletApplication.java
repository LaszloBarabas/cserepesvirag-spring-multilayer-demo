package com.example.cserepesuzlet.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = {"com.example.cserepesuzlet"},
        exclude = {DataSourceAutoConfiguration.class })
@EnableAsync
public class CserepesuzletApplication {

    public static void main(String[] args) {
        SpringApplication.run(CserepesuzletApplication.class, args);
    }

}
