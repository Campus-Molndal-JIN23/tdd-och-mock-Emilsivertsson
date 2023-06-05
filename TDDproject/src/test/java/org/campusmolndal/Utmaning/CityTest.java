package org.campusmolndal.Utmaning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    private City cityMock;
    @BeforeEach
    void setUp() {
        City cityMock = Mockito.mock(City.class);
        cityMock = new City("Göteborg", 20.59, "overcast clouds");
    }

    @Test
    void getName() {
        // Arrange
        String expectedName = "Göteborg";

        // Act
        String actualName = cityMock.getName();

        // Assert
        assertEquals(expectedName, actualName);

    }

    @Test
    void getTemp() {
    }

    @Test
    void getWeatherDescription() {
    }
}