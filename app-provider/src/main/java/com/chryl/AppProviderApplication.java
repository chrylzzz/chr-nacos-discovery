package com.chryl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by Chr.yl on 2020/6/14.
 *
 * @author Chr.yl
 */
@SpringBootApplication
@EnableDiscoveryClient//开启服务发现
@EnableFeignClients//feign 客户端
public class AppProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppProviderApplication.class, args);
    }


}
