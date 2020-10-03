package guru.springframework.guruspring3dependencyinjection.services;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world";
    }
}
