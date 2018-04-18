package spring_demo_one.spring.demo.one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class AppAnnotation 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
    	
    	Coach coach1 = context.getBean("swimCoach",Coach.class);
    	
    	Coach coach2 = context.getBean("swimCoach",Coach.class);
    	
    	System.out.println(coach1);

    	System.out.println(coach2);
    	
    	context.close();
    }
}
