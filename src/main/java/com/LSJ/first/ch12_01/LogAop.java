package com.LSJ.first.ch12_01;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
// 공통 기능							  joinpoint -> 핵심 기능 
 	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
//										어떤 메소드인지 짧게 이름 확인
 		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr + " is start");
		long st = System.currentTimeMillis(); // --> 공통 기능
//		System.out.println(joinpoint); --> 각 클래스에 있는 info 메소드 확인!
		
		try {
			// --> 핵심기능 실행(프록시(대행자)) => getInfo 실행
			Object obj = joinpoint.proceed(); 
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished"); // -> 핵심기능 종료
			System.out.println(signatureStr + " 경과시간 : " + (et + st));
			System.out.println("");
		}
	}	
}
