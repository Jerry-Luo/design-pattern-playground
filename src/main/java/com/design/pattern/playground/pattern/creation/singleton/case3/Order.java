package com.design.pattern.playground.pattern.creation.singleton.case3;

import com.design.pattern.playground.pattern.creation.singleton.implementation.dubble.detection.IdGenerator;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/4 20:15
 */

public class Order {
    public void create(/*...*/) {
        //...
        long id = IdGenerator.getInstance().getId();
        //...
    }
}

class User {
    public void create(/*...*/) {
        // ...
        long id = IdGenerator.getInstance().getId();
        //...
    }
}

// IdGenerator 的使用方式违背了基于接口而非实现的设计原则，也就违背了广义上理解的 OOP 的抽象特性。
// 如果未来某一天，我们希望针对不同的业务采用不同的 ID 生成算法。
// 比如，订单 ID 和用户 ID 采用不同的 ID 生成器来生成。
// 为了应对这个需求变化，我们需要修改所有用到 IdGenerator 类的地方，这样代码的改动就会比较大。

//public class Order {
//    public void create(...) {
//        //...
//        long id = IdGenerator.getInstance().getId();
//        // 需要将上面一行代码，替换为下面一行代码
//        long id = OrderIdGenerator.getIntance().getId();
//        //...
//    }
//}
//
//public class User {
//    public void create(...) {
//        // ...
//        long id = IdGenerator.getInstance().getId();
//        // 需要将上面一行代码，替换为下面一行代码
//        long id = UserIdGenerator.getIntance().getId();
//    }
//}

// 除此之外，单例对继承、多态特性的支持也不友好。
// 这里我之所以会用“不友好”这个词，而非“完全不支持”，是因为从理论上来讲，单例类也可以被继承、也可以实现多态，
// 只是实现起来会非常奇怪，会导致代码的可读性变差。不明白设计意图的人，看到这样的设计，会觉得莫名其妙。
// 所以，一旦你选择将某个类设计成到单例类，也就意味着放弃了继承和多态这两个强有力的面向对象特性，
// 也就相当于损失了可以应对未来需求变化的扩展性。
