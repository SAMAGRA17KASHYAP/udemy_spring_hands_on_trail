package aspecj.learn.curve.udemy_hands_on.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspectDemo {

	Logger logger = Logger.getLogger(getClass().getName());
	@Around("execution(* aspecj.learn.curve.udemy_hands_on.service.TrafficFortuneService.getFortune(..))")
	public Object afterReturningAdvice(ProceedingJoinPoint jp) {
		long startTime = System.currentTimeMillis();
		Object result=null;
		try {
		 result= jp.proceed();
			logger.info("Result from advice :"+ result);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		
		logger.info("Duration is  (in ms):"+(endTime - startTime));
		
		return result;
	}
}
