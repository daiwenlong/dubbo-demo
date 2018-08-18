package com.dwl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo-demo
 * @description: 启动服务
 * @author: daiwenlong
 * @create: 2018-08-18 19:48
 **/
public class Provider {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("provider started");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


