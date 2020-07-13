package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectController {
    @Qualifier("setterGreetingService")
    @Autowired
    private GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreeting();
    }
    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;
    }
}
