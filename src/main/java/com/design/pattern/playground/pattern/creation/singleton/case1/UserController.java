package com.design.pattern.playground.pattern.creation.singleton.case1;

import java.io.IOException;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/4 18:52
 */
// Logger类的应用示例：
public class UserController {

    private Logger logger = new Logger();

    public UserController() throws IOException {
    }

    public void login(String username, String password) throws IOException {
        // ...省略业务逻辑代码...
        logger.log(username + " logined!");
    }
}
