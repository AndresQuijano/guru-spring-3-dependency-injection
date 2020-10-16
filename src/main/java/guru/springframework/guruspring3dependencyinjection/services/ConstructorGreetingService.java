package guru.springframework.guruspring3dependencyinjection.services;

import org.springframework.stereotype.Service;


@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!!";
    }
}
