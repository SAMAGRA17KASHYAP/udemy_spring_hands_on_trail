package aspecj.learn.curve.udemy_hands_on.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Expressions {
	@Pointcut("execution(public void add*(..))")
	public  void forAdd() {}
	
	@Pointcut("execution(public * get*(..))")
	public  void getter() {}
	

	@Pointcut("execution(public void set*(*))")
	public  void setter() {}
	
	@Pointcut("forAdd() && !(getter() && setter())")
	public  void forDAONotSetterGetter() {}
	
	

}
