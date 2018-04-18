package spring_demo_one.spring.demo.one;

import org.springframework.stereotype.Component;

@Component("sam")
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
