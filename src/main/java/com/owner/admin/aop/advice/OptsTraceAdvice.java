package com.owner.admin.aop.advice;

import com.owner.admin.aop.annotation.OptsTrace;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


/**
 * Created with PMS
 * User : Tim.Yao
 * Date : 2016/8/16.
 */
@Component
@Aspect
public class OptsTraceAdvice {

//    @Autowired
//    OptsTraceLogService optsTraceLogService;


    @Around("within(@org.springframework.stereotype.Controller *) && @annotation(optsTrace)")
    public Object aroundTest(ProceedingJoinPoint proceedingJoinPoint, OptsTrace optsTrace) throws Throwable{
      return null;
    }
}
