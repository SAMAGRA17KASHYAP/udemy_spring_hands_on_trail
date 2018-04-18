package spring_demo_one.spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	CricketCoach coach = context.getBean("myCoach",CricketCoach.class);
    	
    	System.out.println(coach.getDailyWorkout());
    	
    	System.out.println(coach.getDailyFortune());
    	
    	System.out.println(coach.getTeam());
    	
    	System.out.println(coach.getEmail());
    	
    	context.close();
    }
}
