package spring_demo_one.spring.demo.one;

public class SwimCoach implements Coach {

	FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 1000 minutes";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
