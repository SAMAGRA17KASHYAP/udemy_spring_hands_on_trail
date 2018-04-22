package aspecj.learn.curve.udemy_hands_on;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aspecj.learn.curve.udemy_hands_on.dao.AccountDAO;
import aspecj.learn.curve.udemy_hands_on.dao.MembershipDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(DemoConfig.class);
    	AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
    	accountDAO.addAccount();
    	accountDAO.getName();
    	accountDAO.getServiceCode();
    	MembershipDAO membershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
    	membershipDAO.addAccount(new Account(),true);
    	context.close();
    }
}
