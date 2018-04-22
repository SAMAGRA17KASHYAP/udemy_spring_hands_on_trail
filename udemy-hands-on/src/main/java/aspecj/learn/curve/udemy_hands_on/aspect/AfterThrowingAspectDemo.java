package aspecj.learn.curve.udemy_hands_on.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAspectDemo {

	@AfterThrowing(pointcut="execution(* aspecj.learn.curve.udemy_hands_on.dao.AccountDAO.findAccounts(..))",throwing="exec")
	public void afterReturningAdvice(JoinPoint jp,Throwable exec) {
		System.out.println(exec.getMessage() +"<<<<<<<<<<<<<<<<<<<<<");
	}
}
