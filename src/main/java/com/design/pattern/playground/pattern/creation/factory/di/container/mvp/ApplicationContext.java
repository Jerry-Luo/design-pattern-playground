package com.design.pattern.playground.pattern.creation.factory.di.container.mvp;

import org.springframework.beans.factory.config.BeanDefinition;

import java.io.IOException;
import java.util.List;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/11 12:34
 */

public interface ApplicationContext {
    Object getBean(String beanId);
}
