package com.design.pattern.playground.pattern.structure.adapter;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/20 12:29
 */
public class Demo3 {
}
//
//
//// 外部系统A
//public interface IA {
//    //...
//    void fa();
//}
//public class A implements IA {
//    //...
//    public void fa() { //... }
//    }
//    // 在我们的项目中，外部系统A的使用示例
//    public class Demo {
//        private IA a;
//        public Demo(IA a) {
//            this.a = a;
//        }
//        //...
//    }
//    Demo d = new Demo(new A());
//
//    // 将外部系统A替换成外部系统B
//    public class BAdaptor implemnts IA {
//        private B b;
//        public BAdaptor(B b) {
//            this.b= b;
//        }
//        public void fa() {
//            //...
//            b.fb();
//        }
//    }
//    // 借助BAdaptor，Demo的代码中，调用IA接口的地方都无需改动，
//// 只需要将BAdaptor如下注入到Demo即可。
//    Demo d = new Demo(new BAdaptor(new B()));
