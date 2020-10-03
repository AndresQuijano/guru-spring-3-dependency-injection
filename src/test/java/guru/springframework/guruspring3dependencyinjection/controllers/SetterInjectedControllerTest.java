package guru.springframework.guruspring3dependencyinjection.controllers;

import guru.springframework.guruspring3dependencyinjection.services.GreetingService;
import guru.springframework.guruspring3dependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController=new SetterInjectedController();
        GreetingService greetingService=new GreetingServiceImpl();
        setterInjectedController.setGreetingService(greetingService);
    }

    @Test
    void setGreetingService() {
        System.out.println(setterInjectedController.getGreeting());
    }
}