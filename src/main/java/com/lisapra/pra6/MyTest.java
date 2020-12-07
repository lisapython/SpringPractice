package com.lisapra.pra6;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = context.getBean(UserService.class);
        System.out.println("UserService 测试开始--");
        userService.work();
        System.out.println(context.getBean(UserService.class).getClass());
        System.out.println("UserService 测试结束--");
    }
}
