package com.changzhen.pattern.singleton.Hungry;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-04-01 16:38
 **/
public class HungrySingleton {

    private static final HungrySingleton hugrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    private static HungrySingleton getInstance(){
        return hugrySingleton;
    }

}
