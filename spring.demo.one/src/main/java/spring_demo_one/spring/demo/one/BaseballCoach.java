package spring_demo_one.spring.demo.one;

public class BaseballCoach implements Coach {
	/* (non-Javadoc)
	 * @see spring_demo_one.spring.demo.one.Coach#getDailyWorkout()
	 */
	
	public FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 30 minutes of batting practice";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+ fortuneService.getFortune();
	}
}
