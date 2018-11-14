package com.shrighanda.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class MemberXMLConfigAspect {

	public Object memberAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("MemberXMLConfigAspect:: Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("MemberXMLConfigAspect:: After invoking getName() method. Return value="+value);
		return value;
	}
}
