package spring_demo_one.spring.demo.one;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomFortuneService implements FortuneService {

	String [] messages= {
							"This is going to be battle",
							"Do your best",
							"Give your everything"
						};
	Random rnd=new Random();
	
	@Override
	public String getFortune() {
		return messages[rnd.nextInt(3)];
	}

}
