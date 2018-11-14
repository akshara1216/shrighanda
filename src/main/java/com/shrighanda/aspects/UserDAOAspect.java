package com.shrighanda.aspects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserDAOAspect {

    @Before("execution(public void addMember())")
    public void addMemberAdvice()
    {
        System.out.println("Executing the member advice");
    }

        @After(value = "execution(public void addMember())")
        public void after(JoinPoint joinPoint) {
          System.out.println("after execution of {}" + joinPoint);
        }


}
