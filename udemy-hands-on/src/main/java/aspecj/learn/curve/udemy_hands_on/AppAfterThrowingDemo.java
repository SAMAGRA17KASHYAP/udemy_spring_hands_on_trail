package aspecj.learn.curve.udemy_hands_on;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aspecj.learn.curve.udemy_hands_on.dao.AccountDAO;

/**
 * Hello world!
 *
 */
public class AppAfterThrowingDemo 
{
    public static void main( String[] args )
    {
    	try {
			AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(DemoConfig.class);
			AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
			boolean throwException = true;
			List<Account> accounts = accountDAO.findAccounts(throwException);
			System.out.println(accounts);
			context.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
