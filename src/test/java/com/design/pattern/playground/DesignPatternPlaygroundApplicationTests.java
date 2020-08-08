package com.design.pattern.playground;

import org.assertj.core.util.Hexadecimals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//@SpringBootTest
class DesignPatternPlaygroundApplicationTests {

    @Test
    void contextLoads() throws NoSuchAlgorithmException {
        String str = "73.25%";
        byte[] digest = str.getBytes(StandardCharsets.UTF_8);
        MessageDigest md = MessageDigest.getInstance("md2");
        for (int i=0; i<100_000_000; i++){
            digest = md.digest(digest);
        }
        String s = Hexadecimals.toHexString(digest);
        System.out.println(s);
    }

}
