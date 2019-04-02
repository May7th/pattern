package com.changzhen.pattern.factory.simple;

import com.changzhen.pattern.factory.IApple;
import com.changzhen.pattern.factory.Phone;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-03-28 11:45
 **/
public class AppleTest {

    public static void main(String[] args) {

        AppleFactory appleFactory = new AppleFactory();

        IApple apple = appleFactory.create(Phone.class);

        apple.product();

    }
}
