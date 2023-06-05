package org.campusmolndal.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DemoTestTest {

    private StarProvider mockStarProvider;
    private DemoTest demoTest;

    @BeforeEach
    public void setUp() {
        // Create a mock object of StarProvider
        mockStarProvider = Mockito.mock(StarProvider.class);

        // Configure mock object to return "*" when getStar() is called
        when(mockStarProvider.getStar()).thenReturn("*");

        // Create an instance of DemoTest with the mock object
        demoTest = new DemoTest(mockStarProvider);
    }

    @Test
    public void getStarsTest() {
        // Test getStars method
        assertEquals("***", demoTest.getStars(3), "Expected three stars for input 3");
        assertEquals("****", demoTest.getStars(4), "Expected four stars for input 4");
        assertEquals("", demoTest.getStars(0), "Expected empty string for input 0");
        assertEquals("", demoTest.getStars(-5), "Expected empty string for negative input");
    }
}
