package com.design.pattern.playground.pattern.creation.singleton.implementation.dubble.detection;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/4 19:31
 */
// 网上有人说，这种实现方式有些问题。因为指令重排序，可能会导致 IdGenerator 对象被 new 出来，并且赋值给 instance 之后，
// 还没来得及初始化（执行构造函数中的代码逻辑），就被另一个线程使用了。

// 要解决这个问题，我们需要给 instance 成员变量加上 volatile 关键字，禁止指令重排序才行。
// 实际上，只有很低版本的 Java 才会有这个问题。
// 我们现在用的高版本的 Java 已经在 JDK 内部实现中解决了这个问题（解决的方法很简单，只要把对象 new 操作和初始化操作设计为原子操作，就自然能禁止重排序）。
// 关于这点的详细解释，跟特定语言有关，我就不展开讲了，感兴趣的同学可以自行研究一下。
public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);

    private static IdGenerator instance;

    private IdGenerator() {}

    public static IdGenerator getInstance() {
        if (instance == null) {
            synchronized(IdGenerator.class) { // 此处为类级别的锁
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
// Q:
// 争哥新年好， 有个问题想请教一下，单例的实现中看到过一种实现方式，包括在spring源码中有类似的实现 ，代码如下
// 1. public class Singleton {
//    private static volatile Singleton instance=null;
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {//
//        Singleton temp=instance; // 为什么要用局部变量来接收
//        if (null == temp) {
//            synchronized (Singleton.class) {
//                temp=instance;
//                if (null == temp) {
//                    temp=new Singleton();
//                    instance=temp;
//                }
//            }
//        }
//        return instance;
//    }
//}
//
//spring源码 如 ReactiveAdapterRegistry。
//JDK 源码 如 AbstractQueuedSynchronizer。
//很多地方 都有用 局部变量 来接收 静态的成员变量， 请问下 这么写有什么性能上的优化点吗？
//jcu 包下面类似的用法太多。想弄明白为什么要这样写

//2. 看jdk 官方的文档（JMM）有说明 指令重排发生的地方有很多 ，编译器，及时编译，CPU在硬件层面的优化，
// 看spring 比较新的代码也使用volatile来修饰，你说的new 关键字和初始化 作为原子操作 可以说一下 大概的jdk版本吗

// A:
// Using localRef, we are reducing the access of volatile variable to just one for positive usecase.
// If we do not use localRef, then we would have to access volatile variable twice - once for checking null and then at method return time.
// Accessing volatile memory is quite an expensive affair because it involves reaching out to main memory.
// 参考链接：https://www.javacodemonk.com/threadsafe-singleton-design-pattern-java-806ad7e6