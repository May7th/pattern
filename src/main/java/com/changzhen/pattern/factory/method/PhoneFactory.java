package com.changzhen.pattern.factory.method;

import com.changzhen.pattern.factory.IApple;
import com.changzhen.pattern.factory.Phone;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-03-28 11:48
 **/
public class PhoneFactory implements IAppleFactory {
    @Override
    public IApple create() {
        return new Phone();
    }
}
