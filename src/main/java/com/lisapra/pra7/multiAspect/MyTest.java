package com.lisapra.pra7.multiAspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        MyCalculator calculator = context.getBean(MyCalculator.class);
        System.out.println("pra7 mycalculator 测试开始--");
        calculator.add(1,1);
        System.out.println(calculator.getClass());
    }
}
