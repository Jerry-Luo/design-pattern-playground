package com.design.pattern.playground.pattern.creation.singleton.case1;

import java.io.IOException;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/4 18:52
 */
public class OrderController {
    private Logger logger = new Logger();

    public OrderController() throws IOException {
    }

    public void create(OrderVo order) throws IOException {
        // ...省略业务逻辑代码...
        logger.log("Created an order: " + order.toString());
    }
}
