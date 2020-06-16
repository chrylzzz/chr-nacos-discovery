package com.chryl.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Chr.yl on 2020/6/16.
 *
 * @author Chr.yl
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy//网关代理注解
public class ApiGateWayApplication {

    public static void main(String[] args){
        SpringApplication.run(ApiGateWayApplication.class,args);
    }
}
