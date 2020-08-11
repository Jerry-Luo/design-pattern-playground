package com.design.pattern.playground.pattern.creation.factory.di.container.mvp.demo;

import com.design.pattern.playground.pattern.creation.factory.di.container.RateLimiter;
import com.design.pattern.playground.pattern.creation.factory.di.container.mvp.ApplicationContext;
import com.design.pattern.playground.pattern.creation.factory.di.container.mvp.ClassPathXmlApplicationContext;


/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/11 12:33
 */

public class Demo {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        RateLimiter rateLimiter = (RateLimiter) applicationContext.getBean("rateLimiter");
        rateLimiter.test();
        //...
    }
}
