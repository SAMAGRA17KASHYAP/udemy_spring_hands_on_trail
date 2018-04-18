package spring_demo_one.spring.demo.one;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String team;
	
	private String email;
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("This is from post constructor");
	} 
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("This is from pre destroy");
	} 
	
	public void setTeam(String team) {
		this.team = team;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}

	public CricketCoach() {
		super();
		System.out.println("Cricket coach no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Do fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Fortune : " + fortuneService.getFortune();
	}
	@Autowired
	@Qualifier("sam")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	public void initMethod() {
		System.out.println("Init method called");
	}
	
	public void destroyMethod() {
		System.out.println("Destroy method called");
	}
}
