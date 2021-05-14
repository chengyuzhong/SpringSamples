package org.sample.ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
//        IMessageService messageService = (IMessageService) context.getBean("message");
        IMessageService messageService = (IMessageService) context.getBean("message", IMessageService.class);
        System.out.println(messageService.get());
    }
}
