package com.changzhen.pattern.factory.method;

import com.changzhen.pattern.factory.IApple;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-03-28 11:49
 **/
public class MethodTest {


    public static void main(String[] args) {

        IAppleFactory appleFactory = new PhoneFactory();

        IApple apple = appleFactory.create();

        apple.product();

    }

}
