package com.changzhen.pattern.factory;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-03-28 11:40
 **/
public class Phone implements IApple {
    @Override
    public void product() {
        System.out.println("iPhone 面世！");
    }
}
