package com.changzhen.pattern.factory.simple;

import com.changzhen.pattern.factory.IApple;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-03-28 11:41
 **/
public class AppleFactory {

    IApple create(Class clazz){

        try {
            if (clazz != null){
                IApple apple = (IApple) clazz.newInstance();
                return apple;
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
