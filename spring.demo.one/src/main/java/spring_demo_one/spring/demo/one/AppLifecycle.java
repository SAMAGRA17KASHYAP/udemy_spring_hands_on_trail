package spring_demo_one.spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppLifecycle 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-lifecycle.xml");
    	
    	Coach coach1 = context.getBean("myCoach",Coach.class);
    	
    	Coach coach2 = context.getBean("myCoach",Coach.class);
    	
    	System.out.println(coach1);

    	System.out.println(coach2);
    	
    	context.close();
    }
}
