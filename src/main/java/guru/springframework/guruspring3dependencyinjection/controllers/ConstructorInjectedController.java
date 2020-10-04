package guru.springframework.guruspring3dependencyinjection.controllers;

import guru.springframework.guruspring3dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    //@Autowired is no longer required
    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
