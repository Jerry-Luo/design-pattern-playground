package com.design.pattern.playground.id.generator.v3;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/7/29 12:18
 */
public class IdGenerationFailureException extends Exception{
    public IdGenerationFailureException(String message, Exception e){
        super(message, e);
    }
}
