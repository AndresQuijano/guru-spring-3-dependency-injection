package guru.springframework.guruspring3dependencyinjection.controllers;

import guru.springframework.guruspring3dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService service){
        greetingService=service;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
