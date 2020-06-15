package com.chryl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Chr.yl on 2020/6/15.
 *
 * @author Chr.yl
 */
@EnableDiscoveryClient
@SpringBootApplication
public class App1Application {
    public static void main(String[] args) {
        SpringApplication.run(App1Application.class, args);
    }
}
