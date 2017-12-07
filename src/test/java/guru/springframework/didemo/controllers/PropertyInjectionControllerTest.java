package guru.springframework.didemo.controllers;

import guru.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectionControllerTest {

    private PropertyInjectionController propertyInjectionController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectionController = new PropertyInjectionController();
        this.propertyInjectionController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void sayHello() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectionController.sayHello());
    }

}