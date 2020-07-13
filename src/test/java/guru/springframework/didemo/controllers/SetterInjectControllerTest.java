package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Test;
import org.junit.Before;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetterInjectControllerTest {

    private SetterInjectController setterInjectController;

    private GreetingService greetingService;

    @Before
    public void setUp() throws Exception{
        this.setterInjectController=new SetterInjectController();
        this.setterInjectController.setGreetingService(new GreetingServiceImpl());
    }
   @Test
    public void testGreeting() throws Exception{
       assertEquals(GreetingServiceImpl.HELLO_GURU,setterInjectController.sayHello());
   }

}
