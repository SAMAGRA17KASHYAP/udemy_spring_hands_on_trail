package spring_demo_one.spring.demo.one;

import org.springframework.stereotype.Component;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
