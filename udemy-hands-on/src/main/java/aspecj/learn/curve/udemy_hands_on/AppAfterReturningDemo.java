package aspecj.learn.curve.udemy_hands_on;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aspecj.learn.curve.udemy_hands_on.dao.AccountDAO;

/**
 * Hello world!
 *
 */
public class AppAfterReturningDemo 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(DemoConfig.class);
    	AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
    	List<Account> accounts = accountDAO.findAccounts(false);
    	System.out.println(accounts);
    	context.close();
    }
}
