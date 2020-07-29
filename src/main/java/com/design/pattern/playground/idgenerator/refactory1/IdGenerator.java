package com.design.pattern.playground.idgenerator.refactory1;

import com.design.pattern.playground.idgenerator.refactory3.IdGenerationFailureException;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/7/27 13:57
 */
public interface IdGenerator {
    String generate() throws IdGenerationFailureException;
}
