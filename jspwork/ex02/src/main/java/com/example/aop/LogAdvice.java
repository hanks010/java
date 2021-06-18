package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Log
@Aspect
@Component
public class LogAdvice {

	@Around("execution(* com.example.service.UserService.*(..) )")
	public Object logTime(ProceedingJoinPoint pjp) throws Throwable {
		
		log.info("Target : "+pjp.getTarget());
		log.info("메소드 시그니처: "+pjp.getSignature().getName());
		
		long beginTime = System.currentTimeMillis();
		
		Object result = pjp.proceed();
		
		long endTime = System.currentTimeMillis();
		
		long diff = endTime - beginTime;
		
		log.info("메소드 실행시간:"+diff+"ms");
		return result;
		
	}
}
