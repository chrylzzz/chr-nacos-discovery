package com.chryl.api;

/**
 * 这是dubbo的接口,需要在service中实现,因为这样的话,以后直接暴露一个api的接口就可以
 * Created by Chr.yl on 2020/6/15.
 *
 * @author Chr.yl
 */
public interface ConsumerService1 {
    //定义dubbo的接口
    public String service1();
}
