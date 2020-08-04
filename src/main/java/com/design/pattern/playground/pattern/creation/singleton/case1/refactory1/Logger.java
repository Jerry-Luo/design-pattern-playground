package com.design.pattern.playground.pattern.creation.singleton.case1.refactory1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author <a href="mailto:luojianwei@pinming.cn">LuoJianwei</a>
 * @since 2020/8/4 19:03
 */

public class Logger {
    private FileWriter writer;

    public Logger() throws IOException {
        File file = new File("/Users/wangzheng/log.txt");
        writer = new FileWriter(file, true); //true表示追加写入
    }

    public void log(String message) throws IOException {
        synchronized(Logger.class) { // 类级别的锁
            writer.write(message);
        }
    }
}