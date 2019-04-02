package com.changzhen.pattern.singleton.Lazy;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-04-01 16:47
 **/
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazySimpleSingleton = null;

    public static LazySimpleSingleton getInstance(){

        if (lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }

        return lazySimpleSingleton;
    }
}
