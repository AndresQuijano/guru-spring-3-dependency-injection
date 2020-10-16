package guru.springframework.guruspring3dependencyinjection.controllers;

import guru.services.GreetingService;
import guru.services.PropertyInjGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController=new SetterInjectedController();
        GreetingService greetingService=new PropertyInjGreetingService();
        setterInjectedController.setGreetingService(greetingService);
    }

    @Test
    void setGreetingService() {
        System.out.println(setterInjectedController.getGreeting());
    }
}