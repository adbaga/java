package ee.taltech.team4.barbershopapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingController {
    @GetMapping
    public String greeting() {
        return "To C or not to C, that is the question";
    }
}
