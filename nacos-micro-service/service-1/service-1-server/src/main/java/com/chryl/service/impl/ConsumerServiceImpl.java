package com.chryl.service.impl;

import com.chryl.api.ConsumerService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 实现接口
 * Created by Chr.yl on 2020/6/15.
 *
 * @author Chr.yl
 */
@Service//方法暴露为dubbo接口
public class ConsumerServiceImpl implements ConsumerService {

    //dubbo接口的实现具体内容
    public String service() {
        return "consumer invoke";
    }

}
