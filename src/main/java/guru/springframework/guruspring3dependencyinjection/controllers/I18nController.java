package guru.springframework.guruspring3dependencyinjection.controllers;

import guru.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService service){
        greetingService=service;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
