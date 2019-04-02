package com.changzhen.pattern.singleton.Lazy;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-04-01 22:43
 **/
public enum  EnumSingleton {

    /**
     * 单例
     */
    INSTANCE;
    private Object data;
    private Object getData(){
        return data;
    }
    private void setData(Object data){
        this.data = data;
    }

    private static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
