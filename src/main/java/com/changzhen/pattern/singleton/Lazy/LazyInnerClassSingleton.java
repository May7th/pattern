package com.changzhen.pattern.singleton.Lazy;

import java.io.Serializable;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-04-01 22:19
 **/
public class LazyInnerClassSingleton implements Serializable {

    /**
     * 防止使用反射破坏单例
     */
    private LazyInnerClassSingleton(){

        if (LazyHolder.LAZY_INNER_CLASS_SINGLETON !=null){
            throw new RuntimeException("it is not singleton!");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){

        return LazyHolder.LAZY_INNER_CLASS_SINGLETON;
    }

    private static class LazyHolder{

        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON
                = new LazyInnerClassSingleton();
    }




}
