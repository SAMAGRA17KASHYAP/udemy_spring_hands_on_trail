package aspecj.learn.curve.udemy_hands_on.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)

public class MyCloudAnalytics {
	@Before("aspecj.learn.curve.udemy_hands_on.aspect.Expressions.forDAONotSetterGetter()")
	public void logToCloudAsync() {
		System.out.println("  >>>>>>>>>>>>Log to cloud");
	}
}
