package com.dima.photoapp.api.photoapp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableConfigServer
public class PhotoAppApiConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppApiConfigServerApplication.class, args);
    }

}
