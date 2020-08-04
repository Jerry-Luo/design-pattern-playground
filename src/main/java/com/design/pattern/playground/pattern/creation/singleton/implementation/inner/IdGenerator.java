package com.design.pattern.playground.pattern.creation.singleton.implementation.inner;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 静态内部类实现单例
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/4 19:38
 */

// SingletonHolder 是一个静态内部类，当外部类 IdGenerator 被加载的时候，并不会创建 SingletonHolder 实例对象。
// 只有当调用 getInstance() 方法时，SingletonHolder 才会被加载，这个时候才会创建 instance。
// instance 的唯一性、创建过程的线程安全性，都由 JVM 来保证。
// 所以，这种实现方法既保证了线程安全，又能做到延迟加载。
public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);

    private IdGenerator() {}

    private static class SingletonHolder{
        private static final IdGenerator instance = new IdGenerator();
    }

    public static IdGenerator getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
