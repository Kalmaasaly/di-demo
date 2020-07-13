package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Test;
import org.junit.Before;


public class PropertyInjectedControllerTest {

    //public GreetingServiceImpl greetingService;
    private PropertyInjectedController propertyInjectedController;
    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController=new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl=new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURU,
                propertyInjectedController.sayHallo());
    }

    private void assertEquals(String helloGuru, String sayHallo) {
    }
   /* public GreetingServiceImpl getGreetingService(){
        return greetingService;
    }*/
}
