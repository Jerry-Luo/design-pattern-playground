package com.design.pattern.playground.pattern.creation.singleton.case1.refactory2;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/4 19:08
 */
// Logger类的应用示例：
public class UserController {
    public void login(String username, String password) {
        // ...省略业务逻辑代码...
        Logger.getInstance().log(username + " logined!");
    }
}
