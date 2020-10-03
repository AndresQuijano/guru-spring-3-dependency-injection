package guru.springframework.guruspring3dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Oe");

        return "Hi fulks!";
    }
}
