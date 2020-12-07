package com.lisapra.pra3;

/**
 * 通过调用jdk自己的反射类来实现动态代理。
 */
public class MyTest {
    public static void main(String[] args) {
       /* MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.add(1, 2));*/
        Calculator calculator = CalculatorProxy.getProxy(new MyCalculator());
        calculator.add(1,2);
        System.out.println(calculator.getClass());
    }
}
