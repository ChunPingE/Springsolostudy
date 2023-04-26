package DIstudyspring.di.config;

import org.springframework.context.annotation.*;

import DIstudyspring.di.entity.*;

@ComponentScan("DIstudyspring.di.ui")
@Configuration
public class NewlecDIConfig {
	@Bean
	public Exam exam(){
		return new NewlecExam(10,20,30,40);
	}
}
