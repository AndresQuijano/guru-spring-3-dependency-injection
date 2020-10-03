package guru.springframework.guruspring3dependencyinjection.controllers;

import guru.springframework.guruspring3dependencyinjection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
