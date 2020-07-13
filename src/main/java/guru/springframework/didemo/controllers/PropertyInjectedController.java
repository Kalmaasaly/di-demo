package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired

    //@Qualifier("primaryGreetingService")
    public GreetingService greetingServiceImpl;
    public String sayHallo(){
        return greetingServiceImpl.sayGreeting();
    }
   /* public GreetingServiceImpl getGreetingService(){
        return greetingService;
    }*/
}
