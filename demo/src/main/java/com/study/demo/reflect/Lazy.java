package com.study.demo.reflect;

/**
 * @author Gaohj
 * @project 单例（懒汉）
 * @description
 * @date 2021/7/6 11:23
 */
public class Lazy {
    private static Lazy instance;

    private Lazy() {
    }

    public static Lazy getInstance() {
        if (instance == null) {
            synchronized (Lazy.class) {
                instance = new Lazy();
            }
        }
        return instance;
    }
}
