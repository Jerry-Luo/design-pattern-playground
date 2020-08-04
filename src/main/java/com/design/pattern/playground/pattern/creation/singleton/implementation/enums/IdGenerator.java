package com.design.pattern.playground.pattern.creation.singleton.implementation.enums;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/4 19:45
 */
// 这种实现方式通过 Java 枚举类型本身的特性，保证了实例创建的线程安全性和实例的唯一性。
public enum IdGenerator {

    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
