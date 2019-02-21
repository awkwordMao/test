package cn.ccpg.jl.java8;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64s {
    public static void main(String[] args){
        final String text = "Base64 finally in Java 8!";
        final String encode = Base64.getEncoder().encodeToString(text.getBytes());
        System.out.println(encode);

        final String decode = new String(Base64.getDecoder().decode(encode), StandardCharsets.UTF_8);
        System.out.println(decode);

        
    }
}
