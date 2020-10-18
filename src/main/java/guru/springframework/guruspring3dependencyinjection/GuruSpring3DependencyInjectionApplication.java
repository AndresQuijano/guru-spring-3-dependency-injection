package guru.springframework.guruspring3dependencyinjection;

import guru.springframework.guruspring3dependencyinjection.controllers.*;
import guru.springframework.guruspring3dependencyinjection.examplebeans.FakeDataSource;
import guru.springframework.guruspring3dependencyinjection.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class GuruSpring3DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GuruSpring3DependencyInjectionApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource=ctx.getBean(FakeDataSource.class);

		System.out.println("User name: "+fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker=ctx.getBean(FakeJmsBroker.class);
		System.out.println("JMS username: "+fakeJmsBroker.getUsername());

	}

}
