package com.changzhen.pattern.singleton.Lazy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: pattern
 * @description:
 * @author: changzhen
 * @create: 2019-04-01 22:50
 **/
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className){

        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object object = null;

                try {
                    object = Class.forName(className).newInstance();
                    ioc.put(className, object);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return object;
            } else {
                return ioc.get(className);
            }
        }

    }

}
