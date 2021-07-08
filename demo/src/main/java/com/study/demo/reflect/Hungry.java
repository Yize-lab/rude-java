package com.study.demo.reflect;

/**
 * @author Gaohj
 * @project 饿汉式单例
 * @description
 * @date 2021/7/6 11:22
 */
public class Hungry {
    private static final Hungry INSTANCE = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance() {
        return INSTANCE;
    }

}
