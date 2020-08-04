package com.design.pattern.playground.pattern.creation.singleton.case4;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/4 20:24
 */
// 单例不支持有参数的构造函数，比如我们创建一个连接池的单例对象，
// 我们没法通过参数来指定连接池的大小。
// 针对这个问题，我们来看下都有哪些解决方案。

// 第一种解决思路是：创建完实例之后，再调用 init() 函数传递参数。
// 需要注意的是，我们在使用这个单例类的时候，要先调用 init() 方法，
// 然后才能调用 getInstance() 方法，否则代码会抛出异常
public class Singleton {
    private static Singleton instance = null;
    private final int paramA;
    private final int paramB;

    private Singleton(int paramA, int paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            throw new RuntimeException("Run init() first.");
        }
        return instance;
    }

    public synchronized static Singleton init(int paramA, int paramB) {
        if (instance != null){
            throw new RuntimeException("Singleton has been created!");
        }
        instance = new Singleton(paramA, paramB);
        return instance;
    }
}

// Singleton.init(10, 50); // 先init，再使用
// Singleton singleton = Singleton.getInstance();


//第二种解决思路是：将参数放到 getIntance() 方法中。具体的代码实现如下所示
//public class Singleton {
//    private static Singleton instance = null;
//    private final int paramA;
//    private final int paramB;
//
//    private Singleton(int paramA, int paramB) {
//        this.paramA = paramA;
//        this.paramB = paramB;
//    }
//
//    public synchronized static Singleton getInstance(int paramA, int paramB) {
//        if (instance == null) {
//            instance = new Singleton(paramA, paramB);
//        }
//        return instance;
//    }
//}
//
// Singleton singleton = Singleton.getInstance(10, 50);

// 不知道你有没有发现，上面的代码实现稍微有点问题。
// 如果我们如下两次执行 getInstance() 方法，那获取到的 singleton1 和 signleton2 的 paramA 和 paramB 都是 10 和 50。
// 也就是说，第二次的参数（20，30）没有起作用，而构建的过程也没有给与提示，这样就会误导用户。
// 这个问题如何解决呢？留给你自己思考，你可以在留言区说说你的解决思路。
//
// Singleton singleton1 = Singleton.getInstance(10, 50);
// Singleton singleton2 = Singleton.getInstance(20, 30);

// 第三种解决思路是：将参数放到另外一个全局变量中。具体的代码实现如下。
// Config 是一个存储了 paramA 和 paramB 值的全局变量。
// 里面的值既可以像下面的代码那样通过静态常量来定义，也可以从配置文件中加载得到。
// 实际上，这种方式是最值得推荐的。

//public class Config {
//    public static final int PARAM_A = 123;
//    public static final int PARAM_B = 245;
//}
//
//public class Singleton {
//    private static Singleton instance = null;
//    private final int paramA;
//    private final int paramB;
//
//    private Singleton() {
//        this.paramA = Config.PARAM_A;
//        this.paramB = Config.PARAM_B;
//    }
//
//    public synchronized static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}