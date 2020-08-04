package com.design.pattern.playground.pattern.creation.singleton.case1.refactory2;

import com.design.pattern.playground.pattern.creation.singleton.case1.OrderVo;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/4 19:08
 */
public class OrderController {
    public void create(OrderVo order) {
        // ...省略业务逻辑代码...
        Logger.getInstance().log("Created a order: " + order.toString());
    }
}
