package com.chryl.controller;

import com.chryl.api.ConsumerService1;
import com.chryl.api.ConsumerService2;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注意,需要先看起dubbo的服务,在开启app服务
 * Created by Chr.yl on 2020/6/15.
 *
 * @author Chr.yl
 */
@RestController
public class App1Controller {

    //app 注入service(注入dubbo),使用dubbo调用接口
    @Reference // 生成接口的代理对象,通过代理对象进行远程调用
            ConsumerService1 consumerService1;

    @Reference
    ConsumerService2 consumerService2;

    @GetMapping("/service")
    public String service() {
        //远程调用 service 1 的方法
        String service1Result = consumerService1.service1();

        //调用service2
        String service2Result = consumerService2.service2();

        return "test" + " : " + service1Result + " : " + service2Result;
//        return "test" + " : " + service1Result ;
    }
}
