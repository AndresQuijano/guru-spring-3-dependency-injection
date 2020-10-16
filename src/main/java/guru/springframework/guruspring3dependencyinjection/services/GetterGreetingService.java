package guru.springframework.guruspring3dependencyinjection.services;

import org.springframework.stereotype.Service;


@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
