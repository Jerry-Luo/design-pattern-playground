package com.design.pattern.playground.idgenerator.refactory1;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/7/27 14:00
 */
public class Test {
    public static void main(String[] args) {
        //代码使用举例
        LogTraceIdGenerator logTraceIdGenerator = new RandomIdGenerator();
        System.out.println(logTraceIdGenerator.generate());
    }
}
