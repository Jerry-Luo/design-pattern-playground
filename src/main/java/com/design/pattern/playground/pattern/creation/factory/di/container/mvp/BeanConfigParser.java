package com.design.pattern.playground.pattern.creation.factory.di.container.mvp;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/11 12:37
 */

public interface BeanConfigParser {
    List<BeanDefinition> parse(InputStream inputStream);
    List<BeanDefinition> parse(String configContent);
}
