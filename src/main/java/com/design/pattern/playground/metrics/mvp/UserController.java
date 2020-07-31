package com.design.pattern.playground.metrics.mvp;

import java.util.concurrent.TimeUnit;

/**
 * 应用场景
 *
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/7/31 12:24
 */

//应用场景：统计下面两个接口(注册和登录）的响应时间和访问次数
public class UserController {
    private Metrics metrics = new Metrics();

    public UserController() {
        metrics.startRepeatedReport(60, TimeUnit.SECONDS);
    }

    public void register(UserVo user) {
        long startTimestamp = System.currentTimeMillis();
        metrics.recordTimestamp("regsiter", startTimestamp);
        //...
        long respTime = System.currentTimeMillis() - startTimestamp;
        metrics.recordResponseTime("register", respTime);
    }

    public UserVo login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();
        metrics.recordTimestamp("login", startTimestamp);
        //...
        long respTime = System.currentTimeMillis() - startTimestamp;
        metrics.recordResponseTime("login", respTime);

        return null;
    }
}
