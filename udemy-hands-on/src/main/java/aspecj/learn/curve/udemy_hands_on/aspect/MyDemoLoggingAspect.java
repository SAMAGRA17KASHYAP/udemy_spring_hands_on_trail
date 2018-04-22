package aspecj.learn.curve.udemy_hands_on.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
	@Before("aspecj.learn.curve.udemy_hands_on.aspect.Expressions.forDAONotSetterGetter()")
	public void beforeAdvice(JoinPoint jp) {
		MethodSignature methodSig = (MethodSignature)jp.getSignature();
		System.out.println(" >>>>>>>>>>>>>Before Advice "+methodSig);
		Object []args = jp.getArgs();
		for(Object o : args) {
			System.out.println(o);
		}
	}
	
	
	
}
