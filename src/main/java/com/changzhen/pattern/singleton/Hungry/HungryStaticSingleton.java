package com.changzhen.pattern.singleton.Hungry;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-04-01 16:42
 **/
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    private static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }

}
