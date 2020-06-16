package com.chryl.service.impl;

import com.chryl.api.ConsumerService1;
import com.chryl.api.ConsumerService2;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * 实现接口
 * Created by Chr.yl on 2020/6/15.
 *
 * @author Chr.yl
 */
@Service//方法暴露为dubbo接口
public class ConsumerServiceImpl implements ConsumerService1 {

    //注入service 2
    @Reference
    ConsumerService2 consumerService2;

    //dubbo接口的实现方法
    public String service1() {
        String service2Res = consumerService2.service2();
        return "consumer invoke service1" + "(" + service2Res + ")";
    }

}
