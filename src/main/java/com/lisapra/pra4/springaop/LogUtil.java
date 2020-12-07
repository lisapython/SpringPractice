package com.lisapra.pra4.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogUtil {
    @Before("execution(* *(..))")
    public static void start(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"方法开始执行，参数是："+ Arrays.asList(joinPoint.getArgs()));
    }

    @AfterReturning(value="execution(* *(..))",returning = "result")
    public static void stop(JoinPoint joinPoint,Object result){
        System.out.println(joinPoint.getSignature().getName()+"方法执行完成，结果是："+result);
    }

    //保留一个精准匹配
    @AfterThrowing(value = "execution( public int com.lisapra.pra4.springaop.MyCalculator.*(int,int))",throwing = "ex")
    public static void logException(JoinPoint joinPoint,Exception ex){
        System.out.println(joinPoint.getSignature().getName()+"方法出现异常："+ex);
    }

    @After("execution(* *(..))")
    public static void end(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"方法执行结束了......");
    }
}
