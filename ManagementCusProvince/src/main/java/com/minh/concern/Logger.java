package com.minh.concern;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Logger {
    public void error() {
        System.out.println("[cms] ERROR!");
    }
    @AfterThrowing(pointcut = "execution(public * com.minh.service.CustomerService.*(..))",throwing = "e")
    public void log(JointPoint jointPoint, Exception e) {
        System.out.println("[CMS] co loi xay ra: " + e.getMessage());

    }
}
