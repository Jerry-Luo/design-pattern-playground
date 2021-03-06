package com.design.pattern.playground.pattern.structure.decorator;

import java.io.IOException;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/19 12:23
 */

public abstract class InputStream {
    ////...
    //public int read(byte b[]) throws IOException {
    //    return read(b, 0, b.length);
    //}
    //
    //public int read(byte b[], int off, int len) throws IOException {
    //    //...
    //}
    //
    //public long skip(long n) throws IOException {
    //    //...
    //}
    //
    //public int available() throws IOException {
    //    return 0;
    //}
    //
    //public void close() throws IOException {}
    //
    //public synchronized void mark(int readlimit) {}
    //
    //public synchronized void reset() throws IOException {
    //    throw new IOException("mark/reset not supported");
    //}
    //
    //public boolean markSupported() {
    //    return false;
    //}
}

//public class BufferedInputStream extends InputStream {
//    protected volatile InputStream in;
//
//    protected BufferedInputStream(InputStream in) {
//        this.in = in;
//    }
//
//    //...实现基于缓存的读数据接口...
//}

//public class DataInputStream extends InputStream {
//    protected volatile InputStream in;
//
//    protected DataInputStream(InputStream in) {
//        this.in = in;
//    }
//
//    //...实现读取基本类型数据的接口
//}



//// 代理模式的代码结构(下面的接口也可以替换成抽象类)
//public interface IA {
//    void f();
//}
//public class A impelements IA {
//    public void f() { //... }
//    }
//    public class AProxy impements IA {
//        private IA a;
//        public AProxy(IA a) {
//            this.a = a;
//        }
//
//        public void f() {
//            // 新添加的代理逻辑
//            a.f();
//            // 新添加的代理逻辑
//        }
//    }
//
//    // 装饰器模式的代码结构(下面的接口也可以替换成抽象类)
//    public interface IA {
//        void f();
//    }
//    public class A impelements IA {
//        public void f() { //... }
//        }
//        public class ADecorator impements IA {
//            private IA a;
//            public ADecorator(IA a) {
//                this.a = a;
//            }
//
//            public void f() {
//                // 功能增强代码
//                a.f();
//                // 功能增强代码
//            }
//        }


// Java IO 抽象出了一个装饰器父类 FilterInputStream，代码实现如下所示。
// InputStream 的所有的装饰器类（BufferedInputStream、DataInputStream）都继承自这个装饰器父类。
// 这样，装饰器类只需要实现它需要增强的方法就可以了，其他方法继承装饰器父类的默认实现。

//public class FilterInputStream extends InputStream {
//    protected volatile InputStream in;
//
//    protected FilterInputStream(InputStream in) {
//        this.in = in;
//    }
//
//    public int read() throws IOException {
//        return in.read();
//    }
//
//    public int read(byte b[]) throws IOException {
//        return read(b, 0, b.length);
//    }
//
//    public int read(byte b[], int off, int len) throws IOException {
//        return in.read(b, off, len);
//    }
//
//    public long skip(long n) throws IOException {
//        return in.skip(n);
//    }
//
//    public int available() throws IOException {
//        return in.available();
//    }
//
//    public void close() throws IOException {
//        in.close();
//    }
//
//    public synchronized void mark(int readlimit) {
//        in.mark(readlimit);
//    }
//
//    public synchronized void reset() throws IOException {
//        in.reset();
//    }
//
//    public boolean markSupported() {
//        return in.markSupported();
//    }
//}
