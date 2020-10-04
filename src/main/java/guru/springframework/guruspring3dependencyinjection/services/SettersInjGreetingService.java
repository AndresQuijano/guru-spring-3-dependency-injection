package guru.springframework.guruspring3dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SettersInjGreetingService implements GreetingService{
        @Override
        public String sayGreeting() {
            return "Hello world (setters edition)";
        }
    }

