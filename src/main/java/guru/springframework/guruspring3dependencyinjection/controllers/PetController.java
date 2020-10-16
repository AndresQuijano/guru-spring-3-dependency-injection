package guru.springframework.guruspring3dependencyinjection.controllers;

import guru.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService service){
        petService=service;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}