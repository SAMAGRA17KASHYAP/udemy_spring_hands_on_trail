package aspecj.learn.curve.udemy_hands_on.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterFinallyAspectDemo {

	@After("execution(* aspecj.learn.curve.udemy_hands_on.dao.AccountDAO.findAccounts(..))")
	public void afterReturningAdvice(JoinPoint jp) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+ "after advice");
	}
}
