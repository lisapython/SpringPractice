package com.lisaPra;

import com.lisapra.pra2.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pra2Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.getName());
    }
}
