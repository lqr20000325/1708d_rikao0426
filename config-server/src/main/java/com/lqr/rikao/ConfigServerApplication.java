package com.lqr.rikao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        //启动类
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
