package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class ProfileControllerTest {

    @Autowired
    private ProfileController profileController;

    @Test
    public void testProfileMessage() {
        String message = profileController.getMessage();
        assertEquals("Welcome to the Testing Environment!", message);
    }
}