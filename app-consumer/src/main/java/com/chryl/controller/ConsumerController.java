package com.chryl.controller;

import com.chryl.client.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chr.yl on 2020/6/14.
 *
 * @author Chr.yl
 */
@RestController
public class ConsumerController {


    @Autowired
    private ProviderFeign providerFeign;


    @GetMapping("/testFeign")
    public Object show() {
        //远程调用
        String providerResult = providerFeign.service();
        return providerResult;
    }


}
