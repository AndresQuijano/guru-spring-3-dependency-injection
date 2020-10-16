package guru.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world (constructor edition)";
    }
}
