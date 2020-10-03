package guru.springframework.guruspring3dependencyinjection;

import guru.springframework.guruspring3dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GuruSpring3DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(GuruSpring3DependencyInjectionApplication.class, args);
		String greeting;

		MyController myController=(MyController) ctx.getBean("myController");
		greeting=myController.sayHello();

		System.out.println(greeting);
	}

}
