package guru.springframework.guruspring3dependencyinjection;

import guru.springframework.guruspring3dependencyinjection.controllers.ConstructorInjectedController;
import guru.springframework.guruspring3dependencyinjection.controllers.MyController;
import guru.springframework.guruspring3dependencyinjection.controllers.PropertyInjectedController;
import guru.springframework.guruspring3dependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GuruSpring3DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(GuruSpring3DependencyInjectionApplication.class, args);
		String greeting;

		System.out.println("---------Primary");
		MyController myController=(MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("----------Property injected");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------Setter injected");
		SetterInjectedController setterInjectedController=(SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------Constructor injected");
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
