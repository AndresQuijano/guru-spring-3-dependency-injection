package guru.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world (property edition)";
    }
}
