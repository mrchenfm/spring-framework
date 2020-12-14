package org.springframework.cfm.example.aop.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: LogAspects
 * @Description: 日志切面 通知方法：logStart() -> 执行业务方法之前执行 ->前置通知
 *                                     logEnd() -> 业务方法执行完之后执行 ->后置通知
 *                                     logReturn() -> 业务方法正常返回值的时候执行 -> 返回通知
 *                                     logException() -> 业务方法执行出现异常时执行 -> 异常通知
 *                                     jointPort.process() -> 动态代理 -> 环绕通知
 *
 * @Author: fangming_chen
 * @Date: 2020/12/13 15:37
 */
@Slf4j
@Aspect
public class LogAspects {

	@Pointcut("execution(public int org.springframework.cfm.example.aop.handler.Calculator.* (..))")
	public void pointCut(){}
	@Before("pointCut()")
	public void logStart(){
		log.info("before运行...............");
	}

	@After("pointCut()")
	public void logEnd(){
		log.info("After运行.................");
	}

	@AfterReturning("pointCut()")
	public void logReturn(){
		log.info("logReturn运行.................");
	}

	@AfterThrowing("pointCut()")
	public void logException(){
		log.info("After运行.................");
	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint joinPoint){

		try {
			log.info("around运行业务处理之前.................");
			Object proceed = joinPoint.proceed();
			log.info("around运行业务处理之后.................");
			return proceed;
		} catch (Throwable throwable) {
			log.info("around运行业务处理异常.................");
			throwable.printStackTrace();
		}
		return null;
	}
}
