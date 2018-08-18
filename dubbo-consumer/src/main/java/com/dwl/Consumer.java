package com.dwl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo-demo
 * @description: 消费者
 * @author: daiwenlong
 * @create: 2018-08-18 20:27
 **/
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DubboService service = context.getBean(DubboService.class);
        System.out.println("consumer started");
        System.out.println(service.getMessage("dubbo"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


