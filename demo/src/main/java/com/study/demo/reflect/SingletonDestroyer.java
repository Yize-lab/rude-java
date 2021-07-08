package com.study.demo.reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;

/**
 * @author Gaohj
 * @project 通过反射破坏单例
 * @description
 * @date 2021/7/6 11:26
 */
public class SingletonDestroyer {
    public static void main(String[] args) throws Exception {
        // 破坏懒汉模式
        Lazy lazyInstance = null;
        Lazy lazy = null;
        lazyInstance = Lazy.getInstance();
        Constructor<Lazy> lazyConstructor = Lazy.class.getDeclaredConstructor();
        lazyConstructor.setAccessible(true);
        lazy = lazyConstructor.newInstance();
        System.out.println("lazy = " + lazy);
        System.out.println("lazyInstance = " + lazyInstance);


        // 破坏饿汉模式
        Hungry hungryInstance = Hungry.getInstance();
        Hungry hungryInstance2 = Hungry.getInstance();
        Constructor<Hungry> hungryConstructor = Hungry.class.getDeclaredConstructor();
        hungryConstructor.setAccessible(true);
        Hungry hungryInstanceReflect = hungryConstructor.newInstance();
        System.out.println("hungryInstance = " + hungryInstance);
        System.out.println("hungryInstance2 = " + hungryInstance2);
        System.out.println("hungryInstanceReflect = " + hungryInstanceReflect);


    }
    public void demo(){

    }

}
