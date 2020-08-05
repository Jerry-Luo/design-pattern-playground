package com.design.pattern.playground.pattern.creation.singleton.in.cluster.multiton;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/5 12:24
 */

public class Logger {

    private static final ConcurrentHashMap<String, Logger> instances = new ConcurrentHashMap<>();

    private Logger() {}

    public static Logger getInstance(String loggerName) {
        instances.putIfAbsent(loggerName, new Logger());
        return instances.get(loggerName);
    }

    public void log() {
        //...
    }
}

//l1==l2, l1!=l3
//Logger l1 = Logger.getInstance("User.class");
//Logger l2 = Logger.getInstance("User.class");
//Logger l3 = Logger.getInstance("Order.class");
