package com.example.demo.aspect;

import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.DemoException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Aspect
@Component
public class ValidHeaderAspect {

    @Pointcut("execution(public * com.example.demo.controller.*.*(..)) && " +
            "@annotation(com.example.demo.annotation.ValidHeader)")
    public void valid() {
    }

    @Around("valid()")
    public Object Interceptor(ProceedingJoinPoint pjp) throws Throwable{
        log.info("权限校验-Around start");
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String role = request.getParameter("role");
        if (StringUtils.isEmpty(role)) {
            throw new DemoException(ResultEnum.PARM_ERROR);
        }
        Object result = null;

        //放行到before方法
        result = pjp.proceed();


        log.info("权限校验-Around end");
        return result;
    }

/*    @Before("valid()")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("权限校验-before: arg={}",args);
    }

    @After("valid()")
    public void after(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("权限校验-after: arg={}",args);
    }*/

}