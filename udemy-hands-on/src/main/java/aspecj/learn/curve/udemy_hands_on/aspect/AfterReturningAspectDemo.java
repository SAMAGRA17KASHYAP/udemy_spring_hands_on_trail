package aspecj.learn.curve.udemy_hands_on.aspect;

import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import aspecj.learn.curve.udemy_hands_on.Account;

@Aspect
@Component
public class AfterReturningAspectDemo {

	@AfterReturning(pointcut="execution(* aspecj.learn.curve.udemy_hands_on.dao.AccountDAO.findAccounts(..))",returning="result")
	public void afterReturningAdvice(JoinPoint jp,List<Account> result) {
		System.out.println(">>>>>>>>>>>>>>>>"+"After returning       "+result);
		//modify result
		for(Account account:result) {
			account.setFirstName(account.getFirstName().toUpperCase());
		}
	}
}
