package com.chryl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chr.yl on 2020/6/14.
 *
 * @author Chr.yl
 */
@RestController
public class ProviderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProviderController.class);

    @GetMapping("/service")
    public String service() {
        LOGGER.info(" provider invoke");
        return " provider invoke";
    }
}
