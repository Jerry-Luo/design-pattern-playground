package com.design.pattern.playground.pattern.creation.factory.di.container;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/11 12:27
 */

public class RateLimiter {
    //private RedisCounter redisCounter;
    //public RateLimiter(RedisCounter redisCounter) {
    //    this.redisCounter = redisCounter;
    //}
    public void test() {
        System.out.println("Hello World!");
    }
    //...
}

//public class RedisCounter {
//    private String ipAddress;
//    private int port;
//    public RedisCounter(String ipAddress, int port) {
//        this.ipAddress = ipAddress;
//        this.port = port;
//    }
//    //...
//}

//配置文件beans.xml：
//<beans>
    //<bean id="rateLimiter" class="com.xzg.RateLimiter">
        //<constructor-arg ref="redisCounter"/>
    //</bean>
    //
    //<bean id="redisCounter" class="com.xzg.redisCounter">
        //<constructor-arg type="String" value="127.0.0.1">
        //<constructor-arg type="int" value=1234>
    //</bean>
//</beans>
