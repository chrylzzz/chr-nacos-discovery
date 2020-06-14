package com.chryl.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Chr.yl on 2020/6/14.
 *
 * @author Chr.yl
 */
@FeignClient(value = "app-provider")//这里的一般是服务的名称
public interface ProviderFeign {

    @GetMapping("/service")
    public String service();

}
