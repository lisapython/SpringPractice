package com.lisapra.pra4.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        MyCalculator calculator = context.getBean(MyCalculator.class);
        System.out.println("mycalculator 测试开始--");
        calculator.add(1,1);
        System.out.println(calculator.getClass());

        MyGreateCalculator greateCalculator = context.getBean(MyGreateCalculator.class);
        greateCalculator.multTwo(4);
        System.out.println(greateCalculator.getClass());
        System.out.println("mycalculator 测试结束--");

    }
}
