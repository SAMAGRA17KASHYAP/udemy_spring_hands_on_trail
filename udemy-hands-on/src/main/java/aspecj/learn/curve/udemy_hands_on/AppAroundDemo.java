package aspecj.learn.curve.udemy_hands_on;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aspecj.learn.curve.udemy_hands_on.service.TrafficFortuneService;

/**
 * Hello world!
 *
 */
public class AppAroundDemo 
{
	private static Logger logger= Logger.getLogger(AppAroundDemo.class.getName());
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(DemoConfig.class);
    	TrafficFortuneService tfs = context.getBean("trafficFortuneService",TrafficFortuneService.class);
    	String fortune = tfs.getFortune();
    	logger.info(fortune);
    	context.close();
    }
}
