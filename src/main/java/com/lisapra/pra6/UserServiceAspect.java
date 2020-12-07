package com.lisapra.pra6;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserServiceAspect {
    @Before("execution(* com.lisapra.pra6.UserService.work(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("UserServiceAspect.....()");
    }
}
