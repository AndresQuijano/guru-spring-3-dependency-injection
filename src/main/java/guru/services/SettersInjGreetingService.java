package guru.services;

import org.springframework.stereotype.Service;

@Service
public class SettersInjGreetingService implements GreetingService{
        @Override
        public String sayGreeting() {
            return "Hello world (setters edition)";
        }
    }

