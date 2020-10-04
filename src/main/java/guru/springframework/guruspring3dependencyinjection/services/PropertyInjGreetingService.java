package guru.springframework.guruspring3dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world (property edition)";
    }
}
