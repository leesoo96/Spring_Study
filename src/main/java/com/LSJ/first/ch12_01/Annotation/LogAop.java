package com.LSJ.first.ch12_01.Annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
//             공통기능 적용 범위 설정
	@Pointcut("within(com.LSJ.first.ch12_01.Annotation.*)")
	private void pointMethod() {}
	
	@Around("pointMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr + " is start");
		long st = System.currentTimeMillis(); 

		try {
// 			--> 핵심기능 실행(프록시(대행자)) => getInfo 실행
			Object obj = joinpoint.proceed(); 
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished"); // -> 핵심기능 종료
			System.out.println(signatureStr + " 경과시간 : " + (et + st));
			System.out.println("");
		}
	}
	
//	@Before 는 @Pointcut 없이 바로 쓸 수 있다 
	@Before("within(com.LSJ.first.ch12_01.Annotation.*)")
	public void beforeAdvice(JoinPoint joinpoint) {
 		System.out.println("beforeAdvice()");
 	} // 핵심기능이 실행되기전에 이 메소드가 실행된다
	
	
}
