package spring_demo_one.spring.demo.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring_demo_one.spring.demo.one")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	@Bean
	public FortuneService sadFortuneService() {
		System.out.println("Foo email"+email);
		return new SadFortuneService();
	}
	@Value("${foo.email}")
	public String email;
	
}
