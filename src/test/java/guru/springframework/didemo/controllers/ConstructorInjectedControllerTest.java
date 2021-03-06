package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp(){
        this.constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURU,constructorInjectedController.sayHello());
    }
}
