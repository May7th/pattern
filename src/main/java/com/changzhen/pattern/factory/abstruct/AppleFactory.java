package com.changzhen.pattern.factory.abstruct;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-03-28 15:42
 **/
public class AppleFactory implements IAppleFactory {
    @Override
    public Pad createPad() {
        return new IPad();
    }

    @Override
    public Phone createPhone() {
        return new Phone4();
    }
}
