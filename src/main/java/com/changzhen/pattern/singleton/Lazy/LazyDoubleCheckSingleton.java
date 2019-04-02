package com.changzhen.pattern.singleton.Lazy;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-04-01 22:09
 **/
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if (singleton == null){
            synchronized (LazyDoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;

    }
}
