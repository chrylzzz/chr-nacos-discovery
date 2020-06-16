package com.chryl.service.impl;

import com.chryl.api.ConsumerService2;

/**
 * Created by Chr.yl on 2020/6/16.
 *
 * @author Chr.yl
 */
@org.apache.dubbo.config.annotation.Service//暴露给dubbo实现类
public class ConsumerService2Impl implements ConsumerService2 {
    public String service2() {
        return "consumer invoke service2";
    }
}
